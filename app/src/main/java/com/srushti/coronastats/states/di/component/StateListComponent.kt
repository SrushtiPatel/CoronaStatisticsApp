package com.srushti.coronastats.states.di.component

import com.srushti.coronastats.base.annotation.PerFragment
import com.srushti.coronastats.base.di.component.NetComponent
import com.srushti.coronastats.states.di.module.StateListModule
import com.srushti.coronastats.states.view.StateListFragment
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