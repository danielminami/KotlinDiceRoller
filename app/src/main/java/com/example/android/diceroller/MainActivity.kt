package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countUpButton: Button = findViewById(R.id.count_up)
        countUpButton.setOnClickListener { countUp() }

    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = (1..6).random().toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text.length > 1) {
            resultText.text = "1"
        } else {
            var currentNumber: Int = resultText.text.toString().toInt()
            if (currentNumber < 6)
                resultText.text = (currentNumber + 1).toString()
        }
    }
}