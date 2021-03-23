package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            firstRollDice()
            secondRollDice()
            Toast.makeText(this, "Good Job!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun firstRollDice() {
        val dice1 = Dice(6)
        val rollFirstDice = dice1.roll()
        val firstDiceResult: ImageView = findViewById(R.id.firstDice)
        firstDiceResult.setImageResource(rollFirstDice)
    }

    private fun secondRollDice() {
        val dice2 = Dice(6)
        val rollSecondDice = dice2.roll()
        val secondDiceResult: ImageView = findViewById(R.id.secondDice)
        secondDiceResult.setImageResource(rollSecondDice)
    }
}

class Dice(val numSides: Int) {
    val returnNumber: Int = (1..numSides).random()
    fun roll() = when (returnNumber) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
}

