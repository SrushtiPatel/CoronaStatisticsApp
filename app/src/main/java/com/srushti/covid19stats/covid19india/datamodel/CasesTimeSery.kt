package com.srushti.covid19stats.covid19india.datamodel

import com.google.gson.annotations.SerializedName


data class CasesTimeSery(
    @SerializedName("dailyconfirmed")
    var dailyconfirmed: String? = null,
    @SerializedName("dailydeceased")
    var dailydeceased: String? = null,
    @SerializedName("dailyrecovered")
    var dailyrecovered: String? = null,
    @SerializedName("date")
    var date: String? = null,
    @SerializedName("totalconfirmed")
    var totalconfirmed: String? = null,
    @SerializedName("totaldeceased")
    var totaldeceased: String? = null,
    @SerializedName("totalrecovered")
    var totalrecovered: String? = null
)