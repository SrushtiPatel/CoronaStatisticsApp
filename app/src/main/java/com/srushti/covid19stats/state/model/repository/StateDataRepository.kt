package com.srushti.covid19stats.state.model.repository

import androidx.lifecycle.MutableLiveData
import com.srushti.covid19stats.covid19india.api.CovidIndiaService
import com.srushti.covid19stats.covid19india.datamodel.DmState
import javax.inject.Inject


/**
 * <h1>com.srushti.coronastats.states.model.repository</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 25/4/20 3:48 PM
 */
class StateDataRepository @Inject constructor(val stateListService: CovidIndiaService) {
    suspend fun fetchStateList(): MutableLiveData<List<DmState>> {
        val stateList = arrayListOf<DmState>()
        stateList.add(
            DmState(
                state = "Gujarat"
            )
        )
        stateList.add(
            DmState(
                state = "Maharastra"
            )
        )
        stateList.add(
            DmState(
                state = "Rajasthan"
            )
        )
        stateList.add(
            DmState(
                state = "Delhi"
            )
        )
        stateList.add(
            DmState(
                state = "Tamilnadu"
            )
        )
        stateList.add(
            DmState(
                state = "Punjab"
            )
        )
        stateList.add(
            DmState(
                state = "Bihar"
            )
        )
        stateList.add(
            DmState(
                state = "Kolkata"
            )
        )
        stateList.add(
            DmState(
                state = "Karnataka"
            )
        )

        val stateData = stateListService.getCovidIndiaData()
        val statesLiveData = MutableLiveData<List<DmState>>()
        statesLiveData.value = stateData.body()


        return statesLiveData
    }
}