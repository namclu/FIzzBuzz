package com.namlu.fizzbuzz.data

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class FizzBuzzViewModel : ViewModel() {
    private val _editNumberInput = MutableLiveData<String>()
    val editNumberInput: LiveData<String>
        get() = _editNumberInput

    private val _seekNumberInput = MutableLiveData<Int>()
    val seekNumberInput: LiveData<Int>
        get() = _seekNumberInput

//    init {
//        _editNumberInput.value =
//        _seekNumberInput.value = 0
//    }

    private val _textFizzBuzz = MutableLiveData<String>()
    val textFizzBuzz: LiveData<String>
        get() = _textFizzBuzz

    fun updateFizzBuzz(numberInput: Int): String {
        return if (numberInput % 3 == 0 && numberInput % 5 == 0) {
            "FizzBuzz"
        } else if (numberInput % 3 == 0) {
            "Fizz"
        } else if (numberInput % 5 == 0) {
            "Buzz"
        } else
            numberInput.toString()
    }
}

