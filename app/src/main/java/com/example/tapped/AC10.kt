package com.example.tapped

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AC10 : AppCompatActivity() {
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac10)

        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnClick = findViewById<Button>(R.id.btnClick)

        btnClick.setOnClickListener {
            contador++
            tvCounter.text = contador.toString()
        }
    }
}