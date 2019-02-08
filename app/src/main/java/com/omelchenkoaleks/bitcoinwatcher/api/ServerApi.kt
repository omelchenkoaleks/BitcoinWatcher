package com.omelchenkoaleks.bitcoinwatcher.api

import com.omelchenkoaleks.bitcoinwatcher.models.CoinCap
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface ServerApi {
    @GET("ticket")
    fun loadData(@Query("limit") limit: Int): Deferred<List<CoinCap>>
}