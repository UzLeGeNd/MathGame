package com.example.jetpacklesson2mathgame.model

import android.os.CountDownTimer
import androidx.activity.ComponentActivity
import kotlin.random.Random

open class MainClass:ComponentActivity() {
    var answers= mutableListOf<String>()
    var randNum:Int=0
    var time:Long=60000
    var gameType=""
    var username=""
    var questionsList= mutableListOf<String>()
    var answersList= mutableListOf<String>()
    var question=""
    var chosenAnswer=""
    var score=0

     fun randomNumberGenerator():Int{
         randNum= (0..questionsList.size-1).random()
         return randNum
     }
fun getOneQuestion():String{
    return questionsList[randomNumberGenerator()]
}

    fun getFourAnswers():MutableList<String>{

        var firstrand=(0..answersList.size).random()
        var secondrand=(0..answersList.size).random()
        var thirdrand=(0..answersList.size).random()
        if (firstrand!=secondrand && firstrand!=thirdrand && secondrand!=thirdrand){
            answers.add(answersList[firstrand])
            answers.add(answersList[secondrand])
            answers.add(answersList[thirdrand])
            answers.add(answersList[randNum])
        }
        return answers
    }
    fun checkTests(){
        if (questionsList!=null && answersList!=null){
                for (i in 0..questionsList.size - 1) {
                    if (questionsList[i] == question && answersList[i] == chosenAnswer) {
                        score++
                    }
                }
        }
    }
    fun saveRecords(){}
    fun changeTime(){
        object:CountDownTimer(time,1000){
            override fun onTick(millisUntilFinished: Long) {
                time -= 1000
                checkTests()
            }

            override fun onFinish() {

            }

        }
    }
}