package com.namlu.fizzbuzz

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun initial_fizz_test() {
        // ARRANGE
        val fizzBuzz = FizzBuzzViewModel()

        // ACT
        val sequence = fizzBuzz.generateSequence(size = 4)

        // ASSERT
        assertEquals(listOf("1", "2", "Fizz", "4"), sequence)
    }

    @Test
    fun full_fizz_buzz_sequence_test() {
        // ARRANGE
        val fizzBuzz = FizzBuzzViewModel()

        // ACT
        val sequence = fizzBuzz.generateSequence(size = 31)

        // ASSERT
        assertEquals(listOf(
            "1", "2", "Fizz", "4", "Buzz",
            "Fizz", "7", "8", "Fizz", "Buzz",
            "11", "Fizz", "13", "14", "FizzBuzz",
            "16", "17", "Fizz", "19", "Buzz",
            "Fizz", "22", "23", "Fizz", "Buzz",
            "26", "Fizz", "28", "29", "FizzBuzz",
            "31"), sequence)
    }
}
