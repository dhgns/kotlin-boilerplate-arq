package com.atsistemas.ui.viewmodels

import android.arch.lifecycle.ViewModel
import com.example.usecase.IAuthUseCase


class SplashPresenter(val authUseCase: IAuthUseCase) : ISplashPresenter, ViewModel(){
    override fun checkConectivity(): Boolean {
        return true
    }

    override fun showProgress() {
        return
    }

}
