package com.srushti.covid19stats.covid19india.datamodel

import com.google.gson.annotations.SerializedName


data class CovidData(
    @SerializedName("cases_time_series")
    var casesTimeSeries: List<CasesTimeSery>? = null,
    @SerializedName("statewise")
    var statewise: List<DmState>? = null,
    @SerializedName("tested")
    var tested: List<Tested>? = null
)