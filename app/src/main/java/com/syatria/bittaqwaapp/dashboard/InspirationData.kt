package com.syatria.bittaqwaapp.dashboard

import com.syatria.bittaqwaapp.R

object InspirationData {
    private val dataImage = intArrayOf(
        R.drawable.img_inspiration,
        R.drawable.diniyah_2,
        R.drawable.persegi,
    )
    // tempat memanggil data asli dari InspirationData
    val listData: ArrayList<InspirationModel>
        get() {
            val list = arrayListOf<InspirationModel>()
            for (position in dataImage.indices) {
                val model = InspirationModel()
                model.imgInspiration = dataImage[position]
                list.add(model)
            }
            return list
        }




}