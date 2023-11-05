package com.satyamthakur.learning.tweetverse.networking

import com.satyamthakur.learning.tweetverse.models.TweetListItem
import com.satyamthakur.learning.tweetverse.utils.Constants.BIN_ID
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsRetrofitAPI {

    @GET("b/BIN_ID?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String): Response<List<TweetListItem>>

    @GET("b/6546683a12a5d3765994d299?meta=false")
    @Headers("X-JSON-Path: $..category")
    suspend fun getCategories(): Response<List<String>>

}