package com.example.facebooklogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Remove app bar
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        // Set spinner items
        ArrayAdapter(
            this,
            R.layout.color_spinner_layout, // Dropdown item color
            resources.getStringArray(R.array.language_array),
        ).also {
            it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            val spinner = findViewById<Spinner>(R.id.select_language)
            spinner.adapter = it
        }
    }
}