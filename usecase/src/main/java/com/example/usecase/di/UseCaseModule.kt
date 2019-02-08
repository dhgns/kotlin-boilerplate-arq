package com.example.usecase.di

import com.example.usecase.AuthUseCase
import com.example.usecase.IAuthUseCase
import org.koin.dsl.module.module

val useCaseModule = module {

    single<IAuthUseCase> { AuthUseCase(get())}

}