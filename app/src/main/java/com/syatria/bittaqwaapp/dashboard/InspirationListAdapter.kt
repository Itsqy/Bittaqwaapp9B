package com.syatria.bittaqwaapp.dashboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.syatria.bittaqwaapp.R

class InspirationListAdapter(private val listInspiration: ArrayList<InspirationModel>) :
    RecyclerView.Adapter<InspirationListAdapter.ListViewHolder>() {


    // class untuk mendaftarkan komponen pada layout dan memasukkannya ke dalam variable
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // variabel imgPhoto berisi komponen ImageView pada layout item_row_inspiration.xml
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_inspiration)
    }


    // mendaftarkan tampilan / layout untuk menampilkan data
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        // variable view berisi layout yang akan menampilkan data (item_row_inspiration)
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_kajian, parent, false)
        return ListViewHolder(view)
    }


    // memasang data ke komponen layout
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        // memasukkan data berdasarkan posisinya ke dalam variabel inspiration
        val inspiration = listInspiration[position]
        // menampilkan data pada variable inspiration di komponen imgPhoto
        Glide.with(holder.itemView.context)
            .load(inspiration.imgInspiration)
            .into(holder.imgPhoto)
    }


    // menentukan jumlah data yang ingin ditampilkan
    override fun getItemCount(): Int {
        return listInspiration.size
    }
}
