package com.example.repositories.di

import com.example.repositories.AuthRepository
import com.example.repositories.IAuthRepository
import com.example.repositories.proviceOkHttpClient
import com.example.repositories.provideRetrofit
import org.koin.dsl.module.module

val repoModule = module {

    single { proviceOkHttpClient() }

    single { provideRetrofit(get()) }

    single<IAuthRepository> { AuthRepository(get()) }

}