package com.example.repositories

import android.util.Log

class AuthRepository : IAuthRepository {

    override fun doLogin() {
        Log.w("", "On login repository")
    }

}