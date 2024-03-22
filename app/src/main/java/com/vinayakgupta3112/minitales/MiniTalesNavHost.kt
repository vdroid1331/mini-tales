package com.vinayakgupta3112.minitales

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.vinayakgupta3112.minitales.auth.authNavGraph
import com.vinayakgupta3112.minitales.auth.authRoot

@Composable
fun MiniTalesNavHost(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = authRoot
    ) {
        authNavGraph(
            navController = navHostController,
            onAuthSuccess = {

            }
        )
    }
}