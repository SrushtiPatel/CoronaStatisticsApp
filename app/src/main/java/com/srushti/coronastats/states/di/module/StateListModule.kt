package com.srushti.coronastats.states.di.module

import androidx.lifecycle.ViewModel
import com.srushti.coronastats.base.annotation.PerFragment
import com.srushti.coronastats.base.annotation.ViewModelKey
import com.srushti.coronastats.states.viewmodel.StateListViewModel
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap


/**
 * <h1>com.srushti.coronastats.states.di.module</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 25/4/20 2:15 AM
 */

@Module
class StateListModule() {

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
}