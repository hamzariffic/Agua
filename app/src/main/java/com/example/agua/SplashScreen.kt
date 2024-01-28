package com.example.agua

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.Agua.R
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController? = null) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
    ) {
        Card(
            modifier = Modifier.align(alignment = Alignment.TopCenter)
                .height(30.dp)
                .graphicsLayer {
                    alpha = 0.5f
                }
        ) {
            Text(text = "Agua")
        }

        LaunchedEffect(key1 = true) {
            delay(3500L)
            navController?.navigate("MainScreen") {
                popUpTo("SplashScreen") {
                    inclusive = true
                }
            }
        }

        Image(
            painter = painterResource(id = R.drawable.oceania),
            contentDescription = "SPH Splash Image",
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview
@Composable
fun PreviewSplashScreen() {
    MaterialTheme {
        SplashScreen()
    }
}
