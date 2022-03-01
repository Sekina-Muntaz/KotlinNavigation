package com.example.newsapp.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object Api {
    const val API_KEY="b3a39a9acbf64e3ca781f81626dcb6f3"
    private const val BASE_URL="https://newsapi.org/v2/"

    private val moshi=Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private val retrofit=Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()

    val retrofitService:NewsService by lazy{
        retrofit.create(NewsService::class.java)
    }
}