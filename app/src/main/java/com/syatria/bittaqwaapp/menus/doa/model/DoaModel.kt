package com.syatria.bittaqwaapp.menus.doa.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class DoaModel(
    var judulDoa: String = "",
    var arabDoa: String = "",
    var artiDoa: String = "",
    var latinDoa: String = "",
    var riwayatDoa: String = "",
) : Parcelable
