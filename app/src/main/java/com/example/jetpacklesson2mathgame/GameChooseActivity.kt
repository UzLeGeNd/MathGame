package com.example.jetpacklesson2mathgame

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
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
import com.example.jetpacklesson2mathgame.model.MainClass
import com.example.jetpacklesson2mathgame.ui.theme.JetpackLesson2MathGameTheme

@SuppressLint("CustomGameChooseActivity")
class GameChooseActivity:MainClass() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            JetpackLesson2MathGameTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GameChooseScreen()

                }
            }
        }
    }

    @SuppressLint("SuspiciousIndentation")
    @Preview
    @Composable
    fun GameChooseScreen() {

        val mContext = LocalContext.current
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier.matchParentSize(),
                painter = painterResource(id = R.drawable.background_choose),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Row() {
                    Button(onClick = {
                        mContext.startActivity(Intent(mContext, NameActivity::class.java))
                        gameType = "+"
                        Questions()
                    }
                    ) {
                        Text(text = "+")
                    }

                    Button(
                        onClick = {

                            mContext.startActivity(Intent(mContext, NameActivity::class.java))
                            gameType = "-"
                            Questions()
                        },
                        modifier = Modifier
                    ) {
                        Text(text = "-")
                    }

                }
                Row() {
                    Button(onClick = {
                        mContext.startActivity(Intent(mContext, NameActivity::class.java))
                        gameType = "*"
                        Questions()
                    }
                    ) {
                        Text(text = "*")
                    }

                    Button(
                        onClick = {
                            mContext.startActivity(Intent(mContext, NameActivity::class.java))
                            gameType = "/"
                            Questions()
                        },
                        modifier = Modifier
                    ) {
                        Text(text = "/")
                    }

                }
            }
        }
    }

   @SuppressLint("SuspiciousIndentation")
   fun Questions(){

    var Plusquestions= mutableListOf("1+1","1+2","1+3","1+4","2+5","195+25","34+66")
    var PlusAnswers= mutableListOf("2","3","4","5","7","220","100")

    var Minusquestions= mutableListOf("1-1","2-1","3-1","4-1","5-2","195-25","66-16")
    var MinusAnswers= mutableListOf("0","1","2","3","3","170","50")

    var Dividequestions= mutableListOf("1/1","1/2","3/1","4/2","25/5","195/15","99/11")
    var DivideAnswers= mutableListOf("1","0.5","3","2","5","13","9")

    var Multiplyquestions= mutableListOf("1*1","1*2","1*3","1*4","2*5","10*25","66*3")
    var MultiplyAnswers= mutableListOf("1","2","3","4","10","250","198")


            if (gameType=="+"){
                questionsList=Plusquestions
                answersList=PlusAnswers
            }
            if (gameType=="-"){
                questionsList=Minusquestions
                answersList=MinusAnswers
            }
            if (gameType=="*"){
                questionsList=Multiplyquestions
                answersList=MultiplyAnswers
            }
            if (gameType=="/"){
                questionsList=Dividequestions
                answersList=DivideAnswers
            }
        }
    }
