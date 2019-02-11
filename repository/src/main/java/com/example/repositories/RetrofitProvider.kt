package com.example.repositories

import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


fun proviceOkHttpClient(): OkHttpClient {
    return OkHttpClient().newBuilder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            level =
                    if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
                    else HttpLoggingInterceptor.Level.NONE
        })
        .build()
}


fun provideRetrofit(client : OkHttpClient): Retrofit {

    return Retrofit.Builder()
        .baseUrl("https://www.google.com/api/v1/")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}


interface TODOAPI {

    @GET("auth/login")
    fun doLogin(
        @Query("user") user: String,
        @Query("password") passwd: String
    ): Call

}