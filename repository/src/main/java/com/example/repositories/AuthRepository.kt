package com.example.repositories

import android.util.Log
import retrofit2.Retrofit

class AuthRepository(retrofit: Retrofit): IAuthRepository {

    var loginAPI: TODOAPI

    init {
        loginAPI = retrofit.create(TODOAPI::class.java)
    }

    override fun doLogin() {
        Log.w("", "On login repository")

        val call = loginAPI.doLogin("","")
        call.execute()
    }

}