package com.srushti.covid19stats.covid19india.api

import com.srushti.covid19stats.covid19india.datamodel.CovidData
import com.srushti.covid19stats.covid19india.datamodel.DmState
import retrofit2.Response
import retrofit2.http.GET


/**
 * <h1>CovidIndiaService</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 25/4/20 8:54 PM
 */
interface CovidIndiaService {
    @GET("/data.json")
    suspend fun getCovidIndiaData(): Response<CovidData>

    @GET("/state_district_wise.json")
    suspend fun getStateDistrictData(): Response<List<DmState>>
}