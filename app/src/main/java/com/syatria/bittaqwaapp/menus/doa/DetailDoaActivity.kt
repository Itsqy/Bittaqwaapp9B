package com.syatria.bittaqwaapp.menus.doa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.syatria.bittaqwaapp.R
import com.syatria.bittaqwaapp.databinding.ActivityDetailDoaBinding
import com.syatria.bittaqwaapp.menus.doa.model.DoaModel

class DetailDoaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailDoaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDoaBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        menerima data dari listdoaactivty
        val doa = intent.getParcelableExtra<DoaModel>("extra_doa") as DoaModel

//        memasangkan data yang diterima ke layout activity_detail_doa
        binding.tvTitleDetaildoa.text = doa.judulDoa
        binding.tvArabDetaildoa.text = doa.arabDoa
        binding.tvLatinDetaildoa.text = doa.latinDoa
        binding.tvDeskripsiDetaildoa.text = doa.artiDoa
        binding.tvRiwayatDetaildoa.text = doa.riwayatDoa

//        manggil toolbar
        setSupportActionBar(binding.toolbarDetaildoa)

    }

    // fungsi untuk tombol back
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}