package com.srushti.covid19stats.base.di.component

import android.app.Application
import com.srushti.covid19stats.base.di.module.NetModule
import dagger.Component
import javax.inject.Singleton


/**
 * <h1>com.srushti.coronastats.base.di.component</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 21/4/20 1:58 AM
 */

@Singleton
@Component(modules = [NetModule::class])
interface NetComponent {
    fun inject(application: Application)
}