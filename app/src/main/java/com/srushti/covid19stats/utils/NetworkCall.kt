package com.srushti.covid19stats.utils

import com.srushti.covid19stats.covid19india.datamodel.NetworkState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response


/**
 * <h1>com.srushti.covid19stats.utils</h1>
 *
 *
 * @author Srushti Patel (srushtip@meditab.com) Meditab Software Inc.
 * @since 29/4/20 2:24 AM
 */
class NetworkCall {
}

suspend fun <T> executeCoroutine(api: suspend () -> Response<T>): NetworkState<T?>? {

    return try {
        val response = api.invoke()
        withContext(Dispatchers.Main) {
            NetworkState.Success(response.body())
        }
    } catch (e: Exception) {
        e.printStackTrace()
        NetworkState.Failure(e.message ?: "")
    }
}