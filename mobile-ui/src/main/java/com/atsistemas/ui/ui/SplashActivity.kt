package com.atsistemas.ui.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.atsistemas.ui.R
import com.atsistemas.ui.viewmodels.ISplashPresenter
import com.atsistemas.ui.viewmodels.SplashPresenter
import org.koin.android.viewmodel.ext.android.viewModel


class SplashActivity : AppCompatActivity() {

    val vm : ISplashPresenter by viewModel<SplashPresenter>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        if(vm.checkConectivity())
            goToMain()

    }

    private fun goToMain() {

    }


}