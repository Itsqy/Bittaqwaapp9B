package com.syatria.bittaqwaapp.menus.doa

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.syatria.bittaqwaapp.R
import com.syatria.bittaqwaapp.menus.doa.model.DoaModel

class DoaAdapter(
    private val listDoa: ArrayList<DoaModel>,
    private val logo: Int,
) :
    RecyclerView.Adapter<DoaAdapter.ListViewHolder>() {


    // r yang berfungsi untuk memanggil komponen yang ada pada layout
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        // variabel imgDoa berisi komponen ImageView pada layout item_row_doa.xml
        val imgDoa: ImageView = itemView.findViewById(R.id.iv_doa_row)
        val titleDoa: TextView = itemView.findViewById(R.id.tv_doa_row)
    }


    // berfungsi untuk menentukan layout tempat data akan ditampilkan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        // variable view berisi layout yang akan menampilkan data (item_row_inspiration)
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_doa, parent, false)
        return ListViewHolder(view)
    }


    // ) berfungsi untuk menampilkan data pada masing-masing komponen pada layout
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        // memasukkan data berdasarkan posisinya ke dalam variabel inspiration
        val doa = listDoa[position]
        // menampilkan data pada variable inspiration di komponen imgPhoto
        holder.titleDoa.text = doa.judulDoa
        Glide.with(holder.itemView.context)
            .load(logo)
            .into(holder.imgDoa)


        // memberikan action pada setiap item pada list agar ketika di klik berpindah ke halaman DetailActivity.kt
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailDoaActivity::class.java)
            intent.putExtra("extra_doa", doa)
            it.context.startActivity(intent)
        }


    }


    // menentukan jumlah data yang ingin ditampilkan
    override fun getItemCount(): Int {
        return listDoa.size
    }
}



