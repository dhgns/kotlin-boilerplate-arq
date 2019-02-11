package com.atsistemas.ui.di.modules

import com.atsistemas.ui.ui.SplashActivity
import com.atsistemas.ui.viewmodels.ISplashPresenter
import com.atsistemas.ui.viewmodels.SplashPresenter
import org.koin.android.viewmodel.experimental.builder.viewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val uiModule = module {

    factory { SplashActivity() }

    single <ISplashPresenter> { SplashPresenter(get()) }

}