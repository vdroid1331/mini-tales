package com.vinayakgupta3112.minitales.auth

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.vinayakgupta3112.minitales.auth.login.LoginScreen
import com.vinayakgupta3112.minitales.auth.splash.SplashScreen

const val authRoot = "auth"

sealed class AuthScreen(val route: String) {
    data object Splash: AuthScreen("$authRoot/splash")
    data object Login: AuthScreen("$authRoot/login")
    data object Signup: AuthScreen("$authRoot/signup")
}

fun NavGraphBuilder.authNavGraph(
    onAuthSuccess:  () -> Unit,
    navController: NavController
) {
    navigation(startDestination = AuthScreen.Splash.route, route = authRoot) {
        composable(AuthScreen.Splash.route) {
            SplashScreen()
            navController.navigate(AuthScreen.Login.route)
        }
        composable(AuthScreen.Login.route) {
            LoginScreen(viewModel())
        }
    }
}