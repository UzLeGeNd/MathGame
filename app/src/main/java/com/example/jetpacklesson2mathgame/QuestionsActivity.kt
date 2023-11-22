package com.example.jetpacklesson2mathgame

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.jetpacklesson2mathgame.model.MainClass
import com.example.jetpacklesson2mathgame.ui.theme.JetpackLesson2MathGameTheme

@SuppressLint("CustomQuestionsActivity")
class QuestionsActivity:MainClass() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()

                }

        }
    }
    @Composable
    fun MyApp(){
        var listOfAnswers=getFourAnswers()
    changeTime()
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
          Text(text = getOneQuestion())
            Row() {
                Button(onClick = {
            
                }
                ) {
                    Text(text = listOfAnswers[0])
                }

                Button(
                    onClick = {
                 
                    },
                    modifier = Modifier
                ) {
                    Text(text = listOfAnswers[1])
                }

            }


            Row() {
                Button(onClick = {

                }
                ) {
                    Text(text = listOfAnswers[2])
                }

                Button(
                    onClick = {

                    },
                    modifier = Modifier
                ) {
                    Text(text = listOfAnswers[3])
                }

            }
        }
    }

}