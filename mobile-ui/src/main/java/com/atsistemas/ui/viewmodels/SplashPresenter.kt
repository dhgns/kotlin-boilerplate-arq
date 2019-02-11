package com.atsistemas.ui.viewmodels

import android.util.Log
import com.example.usecase.IAuthUseCase

class SplashPresenter (val authUseCase: IAuthUseCase) : ISplashPresenter {

    override fun showProgress() {
        Log.w("","Presenter loaded")
        authUseCase.doLogin()
    }

}
