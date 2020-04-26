package com.srushti.covid19stats.state.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.srushti.covid19stats.covid19india.datamodel.DmState
import com.srushti.covid19stats.state.model.repository.StateDataRepository
import kotlinx.coroutines.launch
import javax.inject.Inject


/**
 * <h1>StateListViewModel</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 23/4/20 2:28 AM
 */
class StateListViewModel @Inject constructor(val repository: StateDataRepository) : ViewModel() {
    val stateListLiveData: LiveData<List<DmState>>

    init {
        stateListLiveData = getStatewiseData()
    }

    private fun getStatewiseData(): MutableLiveData<List<DmState>> {
        val statesLiveData = MutableLiveData<List<DmState>>()

        viewModelScope.launch {
            statesLiveData.value = repository.fetchStateList().value
        }
        return statesLiveData
    }
}