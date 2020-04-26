package com.srushti.covid19stats.app

import android.app.Application
import com.srushti.covid19stats.base.di.component.DaggerNetComponent
import com.srushti.covid19stats.base.di.component.NetComponent


/**
 * <h1>com.srushti.coronastats.app</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 20/4/20 3:23 PM
 */

class CovidApp : Application() {

    companion object {
        lateinit var netComponent: NetComponent
    }

    override fun onCreate() {
        super.onCreate()

        netComponent = DaggerNetComponent.create()
        netComponent.inject(this)

    }

}