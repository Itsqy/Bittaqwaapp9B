package com.syatria.bittaqwaapp.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.syatria.bittaqwaapp.R
import com.syatria.bittaqwaapp.databinding.ActivityDashboardBinding
import com.syatria.bittaqwaapp.menus.doa.DoaActivity
import com.syatria.bittaqwaapp.menus.jadwalshalat.JadwalShalatActivity
import com.syatria.bittaqwaapp.menus.videokajian.VideoKajianActivity
import com.syatria.bittaqwaapp.menus.zakat.ZakatActivity
import java.text.SimpleDateFormat
import java.util.Calendar

class DashboardActivity : AppCompatActivity() {

    // fitur untuk menghubungkan design file dengan logic file
    private lateinit var binding: ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val params1 = binding.btn1.layoutParams as LinearLayout.LayoutParams
            params1.weight = 2f
            binding.btn1.layoutParams = params1

        }


//      fitur intent = untuk pindah dari "layar sekarang" => "layar yang ingin dituju"

//      memanggil id   .aksi yang dilakukan
//        binding.menuDoa.setOnClickListener {
////          startActivity  Intent      layar(now), pergi => layar yang dituju
//            startActivity(Intent(this, DoaActivity::class.java))
//        }
//        binding.menuZakat.setOnClickListener {
//            startActivity(Intent(this, ZakatActivity::class.java))
//        }
//        binding.menuVideoKajian.setOnClickListener {
//            startActivity(Intent(this, VideoKajianActivity::class.java))
//        }
//        binding.menuJadwalShalat.setOnClickListener {
//            startActivity(Intent(this, JadwalShalatActivity::class.java))
//        }
//
////        ambil data waktu dari kalender hp kita
//        val timeNow = Calendar.getInstance()
////       ambil format waktu jam nya aja / "HH"/ Hours
//        val timeFormat = SimpleDateFormat("HH")
////        Kombinasikan data dari kalender(timeNow) untuk mendapatkan data jam(timeFormat)nya saja
//        val time = timeFormat.format(timeNow.time)
//
////        setting custom background sesuai dengan waktu
//        when {
//            time.toInt() in 0..5 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_night)
//            time.toInt() in 6..11 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_morning)
//            time.toInt() in 12..17 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_afternoon)
//            time.toInt() in 18..23 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_night)
//        }
//
//
////        pasang adapter untuk menampilkan list poster diniyyah
//
//// variable list untuk menampung data dari object InspirationData
//        val list: ArrayList<InspirationModel> = arrayListOf()
//// memasukkan semua data ke dalam variabel list
//        list.addAll(InspirationData.listData)
//// membuat object InspirationListAdapter
//        val listAdapter = InspirationListAdapter(list)
//
//
//// mengatur ukuran recyclerview agar fix
//        binding.rvInspiration.setHasFixedSize(true)
//// mengatur tampilan recyclerview agar sejajar secara vertical
//        binding.rvInspiration.layoutManager = LinearLayoutManager(this)
//// memasang adapter ke recyclerview
//        binding.rvInspiration.adapter = listAdapter
//

    }

//    override fun onResume() {
//        super.onResume()
//        //        ambil data waktu dari kalender hp kita
//        val timeNow = Calendar.getInstance()
////       ambil format waktu jam nya aja / "HH"/ Hours
//        val timeFormat = SimpleDateFormat("HH")
////        Kombinasikan data dari kalender(timeNow) untuk mendapatkan data jam(timeFormat)nya saja
//        val time = timeFormat.format(timeNow.time)
//        when {
//            time.toInt() in 0..5 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_night)
//            time.toInt() in 6..11 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_morning)
//            time.toInt() in 12..17 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_afternoon)
//            time.toInt() in 18..23 -> binding.ivBackground.setImageResource(R.drawable.bg_header_dashboard_night)
//        }
//    }


}