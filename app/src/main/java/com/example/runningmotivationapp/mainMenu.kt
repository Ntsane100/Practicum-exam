package com.example.runningmotivationapp

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class mainMenu : AppCompatActivity() {
    companion object{
        val activityList= mutableListOf<Activity>()
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        // declare edit texts
        val txtDay = findViewById<EditText>(R.id.txtDay)
        val txtMorning = findViewById<EditText>(R.id.txtMorning)
        val txtAfternoon = findViewById<EditText>(R.id.txtAfternoon)
        val Activitynotes = findViewById<EditText>(R.id.txtActivitynotes)
        // declare buttons
        val saveDataBTN = findViewById<Button>(R.id.savedataBTN)
        val cleardataBTN = findViewById<Button>(R.id.cleardataBTN)
        val showdetailBTN =findViewById<Button>(R.id.showdetailBTN)

        //when Save button is clicked
        saveDataBTN.setOnClickListener {
            val Date = Day.text.toString
            val MorningRun = Morning.text.toString()
            val AfternoonRun = Afternoon.text.toString()
            val Activitynotes = Notes.text.toString

            if (Date.isNotBlank() && MorningRun.isNotBlank() && AfternoonRun.isNotBlank() && Activitynotes.isNotBlank()){

                //insert the data into te list
                activityList.add(Activity(Date, MorningRun, AfternoonRun, Activitynotes))
                Day.text.clear()
                Morning.text.clear()
                Afternoon.text.clear()
                Activitynotes.text.clear()

            }
        }
        btndisplay.setOnCLickListener{

            //calling the second screen to show data
            startActivity(Intent(this, display))
        }

    }
}