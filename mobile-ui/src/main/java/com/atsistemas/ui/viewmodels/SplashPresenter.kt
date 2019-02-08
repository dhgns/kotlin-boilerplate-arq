package com.atsistemas.ui.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.usecase.AuthUseCase

class SplashPresenter (val authUseCase: AuthUseCase) : ViewModel(), ISplashPresenter {

    override fun showProgress() {
        Log.w("","Presenter loaded")
        authUseCase.doLogin()
    }

}
