package com.example.uts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CokelatClass(
    val cokelatimg: Int,
    val cokelatname: String,
    val cokelatdesc: String,
    val cokelatrate: String,
    val ratingbar: Double
) : Parcelable