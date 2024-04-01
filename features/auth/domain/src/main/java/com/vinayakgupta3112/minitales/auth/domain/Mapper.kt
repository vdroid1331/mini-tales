package com.vinayakgupta3112.minitales.auth.domain

interface Mapper<F, T> {
    fun map(from: F): T
}