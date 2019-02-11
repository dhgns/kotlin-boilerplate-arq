package com.atsistemas.ui.di.modules

import com.atsistemas.ui.ui.SplashActivity
import com.atsistemas.ui.viewmodels.ISplashPresenter
import com.atsistemas.ui.viewmodels.SplashPresenter
import org.koin.dsl.module.module


val uiModule = module {

    factory { SplashActivity() }

    single <ISplashPresenter> { SplashPresenter(get()) }

}