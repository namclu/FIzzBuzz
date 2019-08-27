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

    // Figure out FizzBuzz text
    private fun calculateFizzBuzzText(input: Int): String {
        return when {
            input % 15 == 0 -> "FizzBuzz"
            input % 3 == 0 -> "Fizz"
            input % 5 == 0 -> "Buzz"
            else -> input.toString()
        }
    }

    // Set FizzBuzz text
    fun setFizzBuzzText() {
        val input = editNumberInput.value?.toIntOrNull() ?: 0
        _textDisplayFizzBuzz.value = calculateFizzBuzzText(input)
    }

    // Helper method to generate a sequence for testing
    fun generateSequence(size: Int): List<String> {
        return (1..size).map { calculateFizzBuzzText(it) }
    }
}