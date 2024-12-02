package com.example.ana_toma_act16
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class RedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)

        val textView = findViewById<TextView>(R.id.colorTextView)
        textView.text = "RGB: (255, 0, 0)" // Código RGB para rojo
    }
}