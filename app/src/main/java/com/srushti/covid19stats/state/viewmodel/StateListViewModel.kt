package com.srushti.covid19stats.state.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.srushti.covid19stats.covid19india.datamodel.DmState
import com.srushti.covid19stats.covid19india.datamodel.NetworkState
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
    val loadingLiveData = MutableLiveData<Int>()
//    lateinit var loadingData: MutableLiveData<Int>

    init {
        stateListLiveData = getStatewiseData()
        setLoadingState(1)
    }

    private fun setLoadingState(progress: Int) {
        loadingLiveData.value = 1
    }

    private fun getStatewiseData(): MutableLiveData<List<DmState>> {
        val statesLiveData = MutableLiveData<List<DmState>>()

        viewModelScope.launch {
            when (val networkState = repository.fetchStateList().value) {
                is NetworkState.Success -> {
                    statesLiveData.value = networkState.data?.statewise
                    loadingLiveData.value = 0
                }

                else -> {
                    statesLiveData.value = null
                    loadingLiveData.value = 0
                }

            }
        }
        return statesLiveData
    }
}