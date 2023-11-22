package com.example.jetpacklesson2mathgame

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.Animatable
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.delay


@SuppressLint("CustomSplashScreen")
class SplashScreen: ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

SplashActivity()
            
        }
    }
@Preview
    @Composable
    private fun SplashActivity(){
    val alpha= remember {
        androidx.compose.animation.core.Animatable(0f)
    }
    LaunchedEffect(key1 = true, block = {
        alpha.animateTo(1f, animationSpec = tween(1500))
        delay(3000)
        startActivity(Intent(this@SplashScreen, MainActivity::class.java))
    })
Box(modifier = Modifier
    .fillMaxSize()
    .background(
        Color(0xFF03A9F4)
    ) , contentAlignment = Alignment.Center){
Image(
    modifier=Modifier.alpha(alpha.value),
    painter = painterResource(id = R.drawable.splash_image4), contentDescription =null )
}
    }
}