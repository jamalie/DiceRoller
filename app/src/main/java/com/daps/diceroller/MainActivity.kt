package com.daps.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImageOne : ImageView
    lateinit var diceImageTwo : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        diceImageOne = findViewById(R.id.dice_image)
        diceImageTwo = findViewById(R.id.dice_image_twp)
        rollButton.setOnClickListener {
            makeText(this, "Both Dice Rolled!", LENGTH_SHORT).show()
            diceImageOne.setImageResource(getRandomDiceImage())
            diceImageTwo.setImageResource(getRandomDiceImage())
        }
    }
    private fun getRandomDiceImage(): Int {
        return when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

}