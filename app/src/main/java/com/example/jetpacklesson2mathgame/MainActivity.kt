package com.example.jetpacklesson2mathgame

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpacklesson2mathgame.ui.theme.JetpackLesson2MathGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackLesson2MathGameTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    MyApp()
//                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun MyApp() {
    val mContext = LocalContext.current

    Box(modifier = Modifier
        .fillMaxSize(),
         contentAlignment = Alignment.Center){
        Image(
            modifier=Modifier.matchParentSize(),
            painter = painterResource(id = R.drawable.background),
            contentDescription =null,
            contentScale = ContentScale.FillBounds)

    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Button(onClick = {
            mContext.startActivity(Intent(mContext,GameChooseActivity::class.java))
        }
        ) {
        Text(text = "New Game")

            Icon(
                imageVector = Icons.Default.Refresh,
                contentDescription = "Favorite",
                modifier = Modifier.size(20.dp)
            )
        }

        Button(
            onClick = {
                mContext.startActivity(Intent(mContext, RecordsActivity::class.java))
            },
            modifier = Modifier
        ) {
            Text(text = "Records")
            Icon(
                imageVector = Icons.Default.DateRange,
                contentDescription = "Favorite",
                modifier = Modifier.size(20.dp)
            )
        }


    }
}
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackLesson2MathGameTheme {
        Greeting("Android")
    }
}