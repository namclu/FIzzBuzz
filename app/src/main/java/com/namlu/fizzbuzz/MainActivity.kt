package com.namlu.fizzbuzz

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
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

        // Read editText value and update FizzBuzz text

        // Read slider value and update FizzBuzz text
        updateTextFromSlider()
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

    private fun updateTextFromSlider() {
        sliderNumberInput.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // updated continuously as the user slides their thumb
                val fizzBuzzText = doFizzBuzz(progress)
                editNumberInput.setText(progress.toString(), TextView.BufferType.EDITABLE)
                textDisplayFizzBuzz.text = fizzBuzzText
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // called when the user first touches the SeekBar
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // called after the user finishes moving the SeekBar
            }

        })
    }
}
