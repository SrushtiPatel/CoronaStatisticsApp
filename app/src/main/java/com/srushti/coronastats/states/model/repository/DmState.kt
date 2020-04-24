package com.srushti.coronastats.states.model.repository

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DmState(
    @SerializedName("confirmed_foreign")
    var confirmedForeign: String? = null,
    @SerializedName("confirmed_indian")
    var confirmedIndian: String? = null,
    @SerializedName("cured")
    var cured: String? = null,
    @SerializedName("deaths")
    var deaths: String? = null,
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("place")
    var place: String? = null
) : Parcelable