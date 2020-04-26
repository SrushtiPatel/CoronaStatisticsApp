package com.srushti.covid19stats.covid19india.datamodel

import com.google.gson.annotations.SerializedName


data class Tested(
    @SerializedName("individualstestedperconfirmedcase")
    var individualstestedperconfirmedcase: String? = null,
    @SerializedName("positivecasesfromsamplesreported")
    var positivecasesfromsamplesreported: String? = null,
    @SerializedName("samplereportedtoday")
    var samplereportedtoday: String? = null,
    @SerializedName("source")
    var source: String? = null,
    @SerializedName("testpositivityrate")
    var testpositivityrate: String? = null,
    @SerializedName("testsconductedbyprivatelabs")
    var testsconductedbyprivatelabs: String? = null,
    @SerializedName("testsperconfirmedcase")
    var testsperconfirmedcase: String? = null,
    @SerializedName("totalindividualstested")
    var totalindividualstested: String? = null,
    @SerializedName("totalpositivecases")
    var totalpositivecases: String? = null,
    @SerializedName("totalsamplestested")
    var totalsamplestested: String? = null,
    @SerializedName("updatetimestamp")
    var updatetimestamp: String? = null
)