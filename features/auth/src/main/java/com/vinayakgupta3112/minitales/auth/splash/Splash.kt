package com.vinayakgupta3112.minitales.auth.splash

//import android.window.SplashScreen
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.vinayakgupta3112.minitales.theme.MiniTalesTheme
import com.vinayakgupta3112.minitales.theme.components.MiniTalesPreview
import com.vinayakgupta3112.minitales.auth.R

@Composable
fun SplashScreen() {
    Splash()
}

@Composable
fun Splash() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = R.drawable.mini_tales),
            contentDescription = "mini tales"
        )
    }

}

@MiniTalesPreview
@Composable
private fun SplashPreview() {
    MiniTalesTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Splash()
        }
    }
}