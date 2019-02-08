package com.example.usecase

import com.example.repositories.IAuthRepository

class AuthUseCase (val authRepository : IAuthRepository) : IAuthUseCase{

    override fun doLogin() {
        authRepository.doLogin()
    }

}