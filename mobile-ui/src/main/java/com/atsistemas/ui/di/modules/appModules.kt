package com.atsistemas.ui.di.modules

import com.example.repositories.di.repoModule
import com.example.usecase.di.useCaseModule

val appModules = listOf(uiModule, useCaseModule, repoModule)