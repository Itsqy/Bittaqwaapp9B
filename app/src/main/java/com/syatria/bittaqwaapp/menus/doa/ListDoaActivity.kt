package com.syatria.bittaqwaapp.menus.doa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.syatria.bittaqwaapp.R
import com.syatria.bittaqwaapp.databinding.ActivityListDoaBinding
import com.syatria.bittaqwaapp.menus.doa.data.DoaEtikaBaik
import com.syatria.bittaqwaapp.menus.doa.data.DoaMakanMinum
import com.syatria.bittaqwaapp.menus.doa.data.DoaPagiMalam
import com.syatria.bittaqwaapp.menus.doa.data.DoaPerjalanan
import com.syatria.bittaqwaapp.menus.doa.data.DoaRumah
import com.syatria.bittaqwaapp.menus.doa.data.DoaSholat
import com.syatria.bittaqwaapp.menus.doa.model.DoaModel

class ListDoaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListDoaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityListDoaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//      menerima data dari DoaActivity
        var titleDoa: String = intent.getStringExtra("judul").toString()
        var logoDoa: Int = intent.getIntExtra("logo", 0)

//      set / inisialisasi / pasang toolbar
        setSupportActionBar(binding.toolbarListdoa)
//      pasang title toolbar sesuai dengan judul kategori yang diterima
        supportActionBar?.title = titleDoa

//      Menampilkan List Doa dengan memasangkan DoaAdapter
        val list: ArrayList<DoaModel> = arrayListOf()
        when (titleDoa) {
            "Kagetori Perjalanan"->list.addAll(DoaPerjalanan.listDoaPerjalan)
            "Kagetori Rumah"-> list.addAll(DoaRumah.listDoaRumahData)
            "Kagetori Makan dan Minum" -> list.addAll(DoaMakanMinum.listDoaMakanMinum)
            "Kagetori Etika Baik" -> list.addAll(DoaEtikaBaik.listDoaEtikaBaik)
            "Kagetori Pagi dan Malam" -> list.addAll(DoaPagiMalam.listDoaPagiMalam)
            "Kagetori Sholat" -> list.addAll(DoaSholat.listDoaShalat)
        }


        val adapterDoa = DoaAdapter(list, logoDoa)
        binding.rvDoa.setHasFixedSize(true)
        binding.rvDoa.layoutManager = LinearLayoutManager(this)
        binding.rvDoa.adapter = adapterDoa
        Log.d("listoda", "onCreate: ${list.size}")






    }

    // fungsi untuk tombol back
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }


}