package com.srushti.covid19stats.state.di.module

import androidx.lifecycle.ViewModel
import com.srushti.covid19stats.base.annotation.PerFragment
import com.srushti.covid19stats.base.annotation.ViewModelKey
import com.srushti.covid19stats.covid19india.api.CovidIndiaService
import com.srushti.covid19stats.state.viewmodel.StateListViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import retrofit2.Retrofit


/**
 * <h1>com.srushti.coronastats.states.di.module</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 25/4/20 2:15 AM
 */

@Module
class StateListModule {

    @PerFragment
    @IntoMap
    @Provides
    @ViewModelKey(StateListViewModel::class)
    fun provideViewModel(stateListViewModel: StateListViewModel): ViewModel = stateListViewModel

//    @PerFragment
//    @Provides
//    fun provideStateListViewModel(viewModelProviderFactory: ViewModelProvider.Factory): StateListViewModel {
//        return ViewModelProvider(viewModelStoreOwner, viewModelProviderFactory).get(
//            StateListViewModel::class.java
//        )
//    }

    @PerFragment
    @Provides
    fun provideStateDataApi(retrofit: Retrofit): CovidIndiaService {
        return retrofit.create(CovidIndiaService::class.java)
    }
}