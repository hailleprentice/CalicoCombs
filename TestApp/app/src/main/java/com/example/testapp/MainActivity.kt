package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.testapp.New.Load

class MainActivity : AppCompatActivity() {

    internal lateinit var playButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playButton = findViewById(R.id.playButton)

        playButton.setOnClickListener { view ->
            intent = Intent(this, Load::class.java)
            startActivity(intent)
        }
    }
}