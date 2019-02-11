package com.atsistemas.ui.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.atsistemas.ui.R
import com.atsistemas.ui.viewmodels.ISplashPresenter
import org.koin.android.ext.android.inject


class SplashActivity : AppCompatActivity() {

    val presenter: ISplashPresenter by inject()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if (presenter.checkConectivity())
            goToMain()

    }

    private fun goToMain() {

    }


}