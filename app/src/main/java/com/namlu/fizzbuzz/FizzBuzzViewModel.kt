package com.namlu.fizzbuzz

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FizzBuzzViewModel : ViewModel() {

    // EditText accepts a numeric value entered by user and also gets updates from SeekBar
    @Bindable
    val editNumberInput = MutableLiveData<String>()

    // FizzBuzz text observers EditText and SeekBar and updates accordingly
    private val _textDisplayFizzBuzz = MutableLiveData<String>()
    val textDisplayFizzBuzz: LiveData<String>
        get() = _textDisplayFizzBuzz


    fun calculateFizzBuzz() {
        val newInput = editNumberInput.value?.toIntOrNull() ?: 0
        doFizzBuzz(newInput)
    }

    // Figure out FizzBuzz text
    private fun doFizzBuzz(numberInput: Int) {
        if (numberInput % 3 == 0 && numberInput % 5 == 0) {
            _textDisplayFizzBuzz.value = "FizzBuzz"
        } else if (numberInput % 3 == 0) {
            _textDisplayFizzBuzz.value = "Fizz"
        } else if (numberInput % 5 == 0) {
            _textDisplayFizzBuzz.value = "Buzz"
        } else
            _textDisplayFizzBuzz.value = numberInput.toString()
    }
}