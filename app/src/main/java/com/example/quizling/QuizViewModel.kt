package com.mehedi.simplequiz2302

import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {

//    quizQuestions is the name of a vaL that is diclar in DataSource.kt

    private var quizQuestions = DataSource.quizQuestions
    private var quizList : MutableList<QuizQuestion> =quizQuestions


    init {
        quizList.shuffle()

      var dd= quizList[10]

    }

    private var currentQuestionIndex = 0
    private var score = 0

    fun restart() {
        currentQuestionIndex = 0
    }

    fun getCurrentQuestion(): QuizQuestion {
        return quizList[currentQuestionIndex]
    }




    fun getNextQuestion(): QuizQuestion? {
        currentQuestionIndex++
        return if (currentQuestionIndex < quizList.size) {
            quizList[currentQuestionIndex]
        } else {
            null
        }
    }

    fun checkAnswer(selectedIndex: Int): Boolean {
        val currentQuestion = quizList[currentQuestionIndex]
        return if (selectedIndex == currentQuestion.correctAnswerIndex) {
            score +=2
            true
        } else {
            score--
            false
        }
    }

    fun getScore(): Int {
        return score
    }


    fun getQuestionSize(): Int {
        return quizList.size
    }

}