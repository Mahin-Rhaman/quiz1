package com.example.quizling


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val textView_by_art = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.textView_by_art)
        textView_by_art.setOnClickListener {
            val intent = Intent(this, NextByArtActivity::class.java)
            startActivity(intent)
        }
        val option2 = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.textView_by_genaral)
        option2.setOnClickListener {
            val intent = Intent(this, Option2Activity::class.java)
            startActivity(intent)

        }
    }
}