package com.syatria.bittaqwaapp.menus.doa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.syatria.bittaqwaapp.R
import com.syatria.bittaqwaapp.databinding.ActivityListDoaBinding

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


    }

    // fungsi untuk tombol back
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }


}