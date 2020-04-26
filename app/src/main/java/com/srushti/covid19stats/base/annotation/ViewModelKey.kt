package com.srushti.covid19stats.base.annotation

import androidx.lifecycle.ViewModel
import dagger.MapKey
import kotlin.reflect.KClass


/**
 * <h1>com.srushti.coronastats.base.annotation</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 22/4/20 7:26 PM
 */

@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)