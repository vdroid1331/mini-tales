package com.vinayakgupta3112.minitales.auth.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserLoginRequest(
    @SerialName("email")
    val email: String,

    @SerialName("password")
    val password: String,
)