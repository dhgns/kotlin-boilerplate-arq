package com.example.repositories.di

import com.example.repositories.AuthRepository
import com.example.repositories.IAuthRepository
import org.koin.dsl.module.module

val repoModule = module {

    single<IAuthRepository> { AuthRepository() }

}