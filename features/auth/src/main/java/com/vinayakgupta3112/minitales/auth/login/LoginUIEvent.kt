package com.vinayakgupta3112.minitales.auth.login

sealed class LoginUIEvent {
    data class EmailChanged(val email: String): LoginUIEvent()
    data class PasswordChanged(val password: String): LoginUIEvent()
    data object Login: LoginUIEvent()
    data object ForgotPassword: LoginUIEvent()
    data object Signup: LoginUIEvent()
}