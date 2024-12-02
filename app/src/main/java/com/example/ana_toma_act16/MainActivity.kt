package com.example.ana_toma_act16

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greenButton = findViewById<Button>(R.id.greenButton)
        val redButton = findViewById<Button>(R.id.redButton)
        val blueButton = findViewById<Button>(R.id.blueButton)

        greenButton.setOnClickListener {
            val intent = Intent(this, GreenActivity::class.java)
            startActivity(intent)
        }

        redButton.setOnClickListener {
            val intent = Intent(this, RedActivity::class.java)
            startActivity(intent)
        }

        blueButton.setOnClickListener {
            val intent = Intent(this, BlueActivity::class.java)
            startActivity(intent)
        }
    }
}