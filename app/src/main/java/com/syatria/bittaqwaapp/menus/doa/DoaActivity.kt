package com.syatria.bittaqwaapp.menus.doa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toolbar
import com.syatria.bittaqwaapp.R
import com.syatria.bittaqwaapp.databinding.ActivityDoaBinding

class DoaActivity : AppCompatActivity() {

    //  penggunaan tools/ library binding 1
    private lateinit var binding: ActivityDoaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        pneggunaan tools binding 2
        binding = ActivityDoaBinding.inflate(layoutInflater)
//        penggunaan tools binding 3 ubah R.layout.activity_doa -> binding.root
        setContentView(binding.root)

        binding.kategoriRumah.setOnClickListener {
//          navigasi / perpindahan layar menggunakan Intent dengan membawa data
            val intent = Intent(this, ListDoaActivity::class.java)
            intent.putExtra("judul", "Kagetori Rumah")
            intent.putExtra("logo", R.drawable.ic_doa_rumah)
            startActivity(intent)
        }

        binding.kategoriEtikabaik.setOnClickListener {
//            navigasi / perpindahan layar menggunakan Intent dengan membawa data
            val intent = Intent(this, ListDoaActivity::class.java)
            intent.putExtra("judul", "Kagetori Etika Baik")
            intent.putExtra("logo", R.drawable.ic_doa_etika_baik)
            startActivity(intent)
        }

        binding.kategoriMakandanminum.setOnClickListener {
//            navigasi / perpindahan layar menggunakan Intent dengan membawa data
            val intent = Intent(this, ListDoaActivity::class.java)
            intent.putExtra("judul", "Kagetori Makan dan Minum")
            intent.putExtra("logo", R.drawable.ic_doa_makanan_minuman)
            startActivity(intent)

        }
        binding.kategoriShalat.setOnClickListener {
//          navigasi / perpindahan layar menggunakan Intent dengan membawa data
            val intent = Intent(this, ListDoaActivity::class.java)
            intent.putExtra("judul", "Kagetori Sholat")
            intent.putExtra("logo", R.drawable.ic_doa_sholat)
            startActivity(intent)
        }

        binding.kategoriPagidanmalam.setOnClickListener {
//            navigasi / perpindahan layar menggunakan Intent dengan membawa data
            val intent = Intent(this, ListDoaActivity::class.java)
            intent.putExtra("judul", "Kagetori Pagi dan Malam")
            intent.putExtra("logo", R.drawable.ic_doa_pagi_malam)
            startActivity(intent)
        }

        binding.kategoriPerjalanan.setOnClickListener {
//            navigasi / perpindahan layar menggunakan Intent dengan membawa data
            val intent = Intent(this, ListDoaActivity::class.java)
            intent.putExtra("judul", "Kagetori Perjalanan")
            intent.putExtra("logo", R.drawable.ic_doa_perjalanan)
            startActivity(intent)
        }

//        menampilkan toolbar
        setSupportActionBar(binding.toolbarDoa)
    }

    // fungsi untuk tombol back
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

}