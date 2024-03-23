package com.vinayakgupta3112.minitales.auth.login

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LoginViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(LoginUIState())
    val uiState: StateFlow<LoginUIState> = _uiState

    fun onEvent(uiEvent: LoginUIEvent) {
        when (uiEvent) {
            is LoginUIEvent.EmailChanged -> {
                _uiState.value = uiState.value.copy(email = uiEvent.email)
            }
            is LoginUIEvent.PasswordChanged -> {
                _uiState.value = uiState.value.copy(password = uiEvent.password)
            }
            else -> {

            }
        }
    }
}