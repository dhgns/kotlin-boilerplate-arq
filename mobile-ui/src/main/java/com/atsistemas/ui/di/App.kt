package com.atsistemas.ui.di

import android.app.Application
import com.atsistemas.ui.di.modules.appModules
import org.koin.android.ext.android.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, appModules)
    }

}