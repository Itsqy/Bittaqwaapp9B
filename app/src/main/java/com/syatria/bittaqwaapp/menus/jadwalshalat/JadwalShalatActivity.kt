package com.syatria.bittaqwaapp.menus.jadwalshalat

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import com.syatria.bittaqwaapp.databinding.ActivityJadwalShalatBinding
import cz.msebera.android.httpclient.Header
import org.json.JSONObject

class JadwalShalatActivity : AppCompatActivity() {
    // step 1
    private lateinit var binding: ActivityJadwalShalatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
//        step 2
        binding = ActivityJadwalShalatBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
//        step 3
        setContentView(binding.root)



        val client = AsyncHttpClient()
        val url = "https://muslimsalat.com/bogor.json?key=2f0b1cf344d13234acd49826dbd65743"

        client.get(url,object : AsyncHttpResponseHandler(){
            override fun onSuccess(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?
            ) {
                val responseData = responseBody.let {
                    String(it!!)
                }

                try {
                    var jsonData = JSONObject(responseData)
                    var objData = jsonData.getJSONArray("items")
                    var obnew = objData.getJSONObject(0)

                    binding.tvShubuh.text = obnew.getString("fajr")
                    binding.tvImsak.text = obnew.getString("fajr")
                    binding.tvDuha.text = obnew.getString("shurooq")
                    binding.tvDzuhur.text = obnew.getString("dhuhr")
                    binding.tvAshar.text = obnew.getString("asr")
                    binding.tvMaghrib.text = obnew.getString("maghrib")
                    binding.tvIsya.text = obnew.getString("isha")
                    binding.tvKabupaten.text = "Kabupaten ${jsonData.getString("query")}"


                }catch (e : Exception){
                    Toast.makeText(this@JadwalShalatActivity, "$e", Toast.LENGTH_SHORT).show()
                }


            }

            override fun onFailure(
                statusCode: Int,
                headers: Array<out Header>?,
                responseBody: ByteArray?,
                error: Throwable?
            ) {
                Toast.makeText(this@JadwalShalatActivity, "$statusCode", Toast.LENGTH_SHORT).show()
            }
        }  )






    }
}