package com.atsistemas.ui.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.atsistemas.ui.R
import com.atsistemas.ui.viewmodels.ISplashPresenter
import io.reactivex.Observable
import org.koin.android.ext.android.inject
import java.util.concurrent.TimeUnit

class SplashActivity : AppCompatActivity() {

    val presenter by inject<ISplashPresenter>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onResume() {
        super.onResume()

        Observable
            .timer(2, TimeUnit.SECONDS)
            .run {
                goToMain()
            }

    }

    private fun goToMain() {
        presenter.showProgress()

    }

}