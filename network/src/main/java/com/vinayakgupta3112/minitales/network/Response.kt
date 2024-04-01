package com.vinayakgupta3112.minitales.network

import kotlinx.serialization.Serializable

@Serializable
data class Response<T> (
    val data: T,
    val message: String? = null
)