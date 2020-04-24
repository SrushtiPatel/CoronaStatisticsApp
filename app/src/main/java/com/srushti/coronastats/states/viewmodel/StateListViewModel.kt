package com.srushti.coronastats.states.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.srushti.coronastats.states.model.repository.DmState
import javax.inject.Inject


/**
 * <h1>StateListViewModel</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 23/4/20 2:28 AM
 */
class StateListViewModel @Inject constructor() : ViewModel() {
    val stateListLiveData: LiveData<List<DmState>>

    init {
        stateListLiveData = getStatewiseData()
    }

    private fun getStatewiseData(): MutableLiveData<List<DmState>> {
        val statesLiveData = MutableLiveData<List<DmState>>()

        val stateList = arrayListOf<DmState>()
        stateList.add(DmState(place = "Gujarat"))
        stateList.add(DmState(place = "Maharastra"))
        stateList.add(DmState(place = "Rajasthan"))
        stateList.add(DmState(place = "Delhi"))
        stateList.add(DmState(place = "Tamilnadu"))
        stateList.add(DmState(place = "Punjab"))
        stateList.add(DmState(place = "Bihar"))
        stateList.add(DmState(place = "Kolkata"))
        stateList.add(DmState(place = "Karnataka"))

        statesLiveData.value = stateList
        return statesLiveData
    }
}