package com.vinayakgupta3112.minitales.auth.data

import com.vinayakgupta3112.minitales.network.NetworkResult
import com.vinayakgupta3112.minitales.network.RequestHandler
import com.vinayakgupta3112.minitales.network.Response
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val requestHandler: RequestHandler
) : AuthRepository {
    override suspend fun login(request: UserLoginRequest): NetworkResult<Response<UserApiModel>> {
        return requestHandler.post(
            urlPathSegments = listOf("auth", "login"),
            body = request
        )
    }
}