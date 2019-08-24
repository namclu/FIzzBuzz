package com.namlu.fizzbuzz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editNumberInput: EditText
    private lateinit var sliderNumberInput: SeekBar
    private lateinit var textDisplayFizzBuzz: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNumberInput = findViewById(R.id.edit_number_input)
        sliderNumberInput = findViewById(R.id.seek_number_input)
        textDisplayFizzBuzz = findViewById(R.id.text_display_fizz_buzz)
    }

    /*
    * If number is a multiple of:
    * - 3, return "Fizz"
    * - 5, return "Buzz"
    * - 3 and 5, return "FizzBuzz"
    * - else return the number given
    * */
    private fun doFizzBuzz(numberInput: Int): String? {

        val resultString = if (numberInput % 3 == 0 && numberInput % 5 == 0) {
            "FizzBuzz"
        } else if (numberInput % 3 == 0) {
            "Fizz"
        } else if (numberInput % 5 == 0) {
            "Buzz"
        } else
            numberInput.toString()
        return resultString
    }
}
