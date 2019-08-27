package com.namlu.fizzbuzz

import org.junit.Test
import org.junit.Assert.*
import com.namlu.fizzbuzz.FizzBuzzViewModel.Companion.FIZZ
import com.namlu.fizzbuzz.FizzBuzzViewModel.Companion.BUZZ
import com.namlu.fizzbuzz.FizzBuzzViewModel.Companion.FIZZ_BUZZ

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
        assertEquals(listOf("1", "2", FIZZ, "4"), sequence)
    }

    @Test
    fun full_fizz_buzz_sequence_test() {
        // ARRANGE
        val fizzBuzz = FizzBuzzViewModel()

        // ACT
        val sequence = fizzBuzz.generateSequence(size = 31)

        // ASSERT
        assertEquals(
            listOf(
                "1", "2", FIZZ, "4", BUZZ,
                FIZZ, "7", "8", FIZZ, BUZZ,
                "11", FIZZ, "13", "14", FIZZ_BUZZ,
                "16", "17", FIZZ, "19", BUZZ,
                FIZZ, "22", "23", FIZZ, BUZZ,
                "26", FIZZ, "28", "29", FIZZ_BUZZ,
                "31"
            ), sequence
        )
    }
}
