package com.vinayakgupta3112.minitales.auth.data

import com.vinayakgupta3112.minitales.network.NetworkResult
import com.vinayakgupta3112.minitales.network.Response

interface AuthRepository {
    suspend fun login(request: UserLoginRequest): NetworkResult<Response<UserApiModel>>
}