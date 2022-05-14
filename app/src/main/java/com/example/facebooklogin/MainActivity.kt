package com.example.facebooklogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.facebooklogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Remove app bar
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        // Binding main activity view
        binding = ActivityMainBinding.inflate(layoutInflater)

        //TODO: Set spinner text color
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.language_array,
            R.layout.color_spinner_layout // Dropdown item color
        )
        binding.selectLanguage.adapter = adapter
    }
}