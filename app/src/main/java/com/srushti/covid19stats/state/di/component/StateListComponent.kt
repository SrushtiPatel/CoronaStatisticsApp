package com.srushti.covid19stats.state.di.component

import com.srushti.covid19stats.base.annotation.PerFragment
import com.srushti.covid19stats.base.di.component.NetComponent
import com.srushti.covid19stats.state.di.module.StateListModule
import com.srushti.covid19stats.state.view.StateListFragment
import dagger.Component


/**
 * <h1>com.srushti.coronastats.states.di.component</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 25/4/20 2:17 AM
 */

@PerFragment
@Component(dependencies = [NetComponent::class], modules = [StateListModule::class])
interface StateListComponent {
    fun inject(stateListFragment: StateListFragment)
}