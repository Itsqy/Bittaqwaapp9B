package com.syatria.bittaqwaapp.menus.zakat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.syatria.bittaqwaapp.R
import com.syatria.bittaqwaapp.databinding.ActivityZakatBinding
import java.text.NumberFormat


class ZakatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityZakatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityZakatBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnSubmitHasil.setOnClickListener {

            val inputZakat = binding.edtInputHarta
            val totalHarta = inputZakat.getNumericValue().toInt()

//          kondisi pertama : input tidak boleh kosong

            if (inputZakat.text?.isEmpty() == true) {
//          untuk menampilkan allert / peringatan dengan toast
                Toast.makeText(this, "Tolong isi input terlebih dahulu", Toast.LENGTH_LONG).show()
//          kondisi kedua : harta harus mencapai 85 juta
            } else if (totalHarta >= 85000000) {
//              total zakat yang dikeluarkan
                val rumusZakat = totalHarta * 2.5 / 100
                val formatZakat = NumberFormat.getNumberInstance().format(rumusZakat)
                binding.tvTotalZakat.text = "$formatZakat"

//               total harta pengguna
                val formatZkt = NumberFormat.getNumberInstance().format(totalHarta)
                binding.tvTotalHarta.text = "$formatZkt"


            } else {
                Toast.makeText(
                    this,
                    "harta masih belum mencapai minimum zakat ( 85 juta)",
                    Toast.LENGTH_LONG
                ).show()

            }


        }
        setSupportActionBar(binding.toolbarZakat)

//        set tvTotalHarta = 0 (opsional)
        binding.tvTotalHarta.text = "0"
//        set tvTotalZakat = 0  (opsional)
        binding.tvTotalZakat.text = "0"

    }

    // fungsi untuk tombol back
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}