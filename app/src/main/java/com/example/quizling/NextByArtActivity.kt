package com.example.quizling

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.quizling.databinding.ActivityNextByArtBinding
import com.mehedi.simplequiz2302.QuizViewModel

class NextByArtActivity : AppCompatActivity() {

    private lateinit var viewModel: QuizViewModel
    private lateinit var binding: ActivityNextByArtBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNextByArtBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(QuizViewModel::class.java)

        binding.nextQuestion.setOnClickListener {
            val selectOptionIndex =
                binding.optionsRadioGroup.indexOfChild(findViewById(binding.optionsRadioGroup.checkedRadioButtonId))

            if (selectOptionIndex != -1) {
                viewModel.checkAnswer(selectOptionIndex)
                showNextQuestion()
            } else {
                Toast.makeText(this, "Select an option", Toast.LENGTH_SHORT).show()
            }
        }

        showCurrentQuestion()
    }

    private fun showNextQuestion() {
        val nextQuestion = viewModel.getNextQuestion()
        if (nextQuestion != null) {
            showCurrentQuestion()
        } else {
            showResult("Your Score : ${viewModel.getScore()} out of ${viewModel.getQuestionSize()} ")
        }
    }

    private fun showResult(msg: String) {
        val alertDialog = AlertDialog.Builder(this)
            .setTitle("Your Result!")
            .setMessage(msg)
            .setPositiveButton("Restart") { _, _ ->
                viewModel.restart()
                showCurrentQuestion()
            }
            .setNegativeButton("Dismiss") { _, _ ->
                binding.nextQuestion.visibility = View.INVISIBLE
            }
            .setCancelable(false)
            .create()
        alertDialog.show()
    }

    private fun showCurrentQuestion() {
        val currentQuestion = viewModel.getCurrentQuestion()
        binding.apply {
            questionTextView.text = currentQuestion.question
            option1RadioBtn.text = currentQuestion.options[0]
            option2RadioBtn.text = currentQuestion.options[1]
            option3RadioBtn.text = currentQuestion.options[2]
            option4RadioBtn.text = currentQuestion.options[3]
            optionsRadioGroup.clearCheck()
        }
    }
}
