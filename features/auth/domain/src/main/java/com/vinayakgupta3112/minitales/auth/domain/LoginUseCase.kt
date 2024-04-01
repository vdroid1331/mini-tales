package com.vinayakgupta3112.minitales.auth.domain

import com.vinayakgupta3112.minitales.auth.data.AuthRepository
import com.vinayakgupta3112.minitales.auth.data.UserLoginRequest
import com.vinayakgupta3112.minitales.network.NetworkException
import com.vinayakgupta3112.minitales.network.NetworkResult
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: AuthRepository,
    private val mapper: UserMapper
) {

    suspend fun invoke(email: String, password: String): Resource<User> {
        val request = UserLoginRequest(email, password)
        return when (val result = repository.login(request)) {
            is NetworkResult.Error -> {
                result.toResourceError()
            }
            is NetworkResult.Success -> Resource.Success(mapper.map(result.result.data))
        }
    }
}

fun NetworkResult.Error<*>.toResourceError(): Resource.Error {
    return when (exception) {
        is NetworkException.NotFoundException -> Resource.Error(ResourceError.SERVICE_UNAVAILABLE)
        is NetworkException.UnauthorizedException -> Resource.Error(ResourceError.UNAUTHORIZED)
        else -> Resource.Error(ResourceError.UNKNOWN)
    }
}