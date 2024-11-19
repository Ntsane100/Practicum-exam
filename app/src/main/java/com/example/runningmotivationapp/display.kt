package com.example.runningmotivationapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.savedinstancestate.savedInstanceState
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class display : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstancesState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = examadapter(mainMenu.activityList)

        val back = findViewById<Button>(R.id.backbtn)

        back.setOnClickListener {

            // back to main screen
            startActivity(Intent(this, mainMenu::class.java))
        }
    }
}