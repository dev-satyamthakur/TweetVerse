package com.satyamthakur.learning.tweetverse.di

import com.satyamthakur.learning.tweetverse.networking.TweetsRetrofitAPI
import com.satyamthakur.learning.tweetverse.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Network {

    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Singleton
    @Provides
    fun providesTweetAPI(retrofit: Retrofit): TweetsRetrofitAPI {
        return retrofit.create(TweetsRetrofitAPI::class.java)
    }
}