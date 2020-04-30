package com.srushti.covid19stats.state.model.repository

import androidx.lifecycle.MutableLiveData
import com.srushti.covid19stats.covid19india.api.CovidIndiaService
import com.srushti.covid19stats.covid19india.datamodel.CovidData
import com.srushti.covid19stats.covid19india.datamodel.NetworkState
import com.srushti.covid19stats.utils.executeCoroutine
import javax.inject.Inject


/**
 * <h1>com.srushti.coronastats.states.model.repository</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 25/4/20 3:48 PM
 */
class StateDataRepository @Inject constructor(private val stateListService: CovidIndiaService) {
    suspend fun fetchStateList(): MutableLiveData<NetworkState<CovidData?>> {
        val statesLiveData = MutableLiveData<NetworkState<CovidData?>>()

        val stateData = executeCoroutine {
            stateListService.getCovidIndiaData()
        }
        statesLiveData.value = stateData

        return statesLiveData
    }
}