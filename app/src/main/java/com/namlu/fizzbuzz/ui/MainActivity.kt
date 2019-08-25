package com.namlu.fizzbuzz.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import com.namlu.fizzbuzz.R
import com.namlu.fizzbuzz.data.FizzBuzzViewModel
import com.namlu.fizzbuzz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var editNumberInput: EditText
//    private lateinit var sliderNumberInput: SeekBar
//    private lateinit var textDisplayFizzBuzz: TextView
//    private val viewModel by lazy {
//        ViewModelProviders.of(this).get(FizzBuzzViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProviders.of(this)
            .get(FizzBuzzViewModel::class.java)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )

        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

//        viewModel.textFizzBuzz.observe(this, Observer {
//            viewModel.updateFizzBuzz(Integer.parseInt(viewModel.editNumberInput.value!!))
//        })

//        binding.editNumberInput.inputType = InputType.TYPE_CLASS_NUMBER

//        editNumberInput = findViewById(R.id.edit_number_input)
//        sliderNumberInput = findViewById(R.id.seek_number_input)
//        textDisplayFizzBuzz = findViewById(R.id.text_display_fizz_buzz)
//
//        updateTextFromEditText()
//        updateTextFromSlider()
    }

    /*
    * If number is a multiple of:
    * - 3, return "Fizz"
    * - 5, return "Buzz"
    * - 3 and 5, return "FizzBuzz"
    * - else return the number given
    * */
//    private fun doFizzBuzz(numberInput: Int): String? {
//
//        val resultString = if (numberInput % 3 == 0 && numberInput % 5 == 0) {
//            "FizzBuzz"
//        } else if (numberInput % 3 == 0) {
//            "Fizz"
//        } else if (numberInput % 5 == 0) {
//            "Buzz"
//        } else
//            numberInput.toString()
//        return resultString
//    }

    // Read editText value and update FizzBuzz text
//    private fun updateTextFromEditText() {
//        editNumberInput.addTextChangedListener(object : TextWatcher {
//            override fun afterTextChanged(s: Editable?) {
//                if (!s.isNullOrBlank()) {
//                    val numberInput = Integer.parseInt(s.toString())
//                    // Update slider
//                    sliderNumberInput.progress = numberInput
//                    // Update FizzBuzz display
//                    textDisplayFizzBuzz.text = doFizzBuzz(numberInput)
//                }
//                // Keep cursor to the right of input value
//                editNumberInput.setSelection(editNumberInput.text.length)
//            }
//
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//
//            }
//        })
//    }

    // Read slider value and update FizzBuzz text
//    private fun updateTextFromSlider() {
//        sliderNumberInput.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
//            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
//                // Update EditText
//                editNumberInput.setText(progress.toString(), TextView.BufferType.EDITABLE)
//                // Update FizzBuzz display
//                textDisplayFizzBuzz.text = doFizzBuzz(progress)
//            }
//
//            override fun onStartTrackingTouch(seekBar: SeekBar?) {
//                // called when the user first touches the SeekBar
//            }
//
//            override fun onStopTrackingTouch(seekBar: SeekBar?) {
//                // called after the user finishes moving the SeekBar
//            }
//
//        })
//    }
}
