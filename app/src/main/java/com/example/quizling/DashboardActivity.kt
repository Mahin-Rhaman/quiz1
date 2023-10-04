package com.example.quizling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        var art=findViewById<Button>(R.id.next_id)
        art.setOnClickListener {
            val intent = Intent(this,NextByArtActivity::class.java)
            startActivity(intent)
        }
    }
}