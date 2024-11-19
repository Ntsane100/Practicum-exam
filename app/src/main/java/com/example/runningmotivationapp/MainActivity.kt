package com.example.runningmotivationapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainBTN = findViewById<Button>(R.id.mainBTN)
        val exitBTN = findViewById<Button>(R.id.exitBTN)
        // when main button is clicked
        mainBTN.setOnClickListener {
            intent = Intent(this, mainMenu::class.java)
            startActivity(intent)
            // when exit button is clicked
            exitBTN.setOnClickListener {
                finishAffinity()
            }
        }
    }
}