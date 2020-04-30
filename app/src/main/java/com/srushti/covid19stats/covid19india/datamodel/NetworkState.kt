package com.srushti.covid19stats.covid19india.datamodel


/**
 * <h1>com.srushti.covid19stats.covid19india.datamodel</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 1/5/20 12:36 AM
 */
sealed class NetworkState<T> {
    data class Success<T>(val data: T) : NetworkState<T>()
    data class Failure<T>(val description: String) : NetworkState<T>()
}