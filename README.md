# FizzBuzz

This is my implementation of the FizzBuzz app. It's a native Kotlin app that calculates the FizzBuzz text of a given value. 
If the value is divisible by:
* 3 -> Displays "Fizz"
* 5 -> Displays "Buzz"
* 3 and 5 -> Displays "FizzBuzz"
 else -> Displays the value

The actual text and value can be configured in code.

## How the app works
* The user enters a number and then see the result (either the number, Fizz,
Buzz or FizzBuzz). 
* The user can change the number manually by entering it or select a
number using the slider. 
* The TextView, Slider and EditText should update when changing
either the slider or the edit text.

## App Design/ Constraints
* Using only the Kotlin.
* The App must use the MVVM Architecture pattern.
* The Business logic of the app should be unit tested.
* The numbers and text used to calculate “FizzBuzz” should be configurable.
* The UI of the app must always be in a data consistent state.
* The EditText may only ever contain numbers.
* The value must be reflected on the Slider and TextView when changed.
* The EditText and TextView Should update if the slider is moved.

## Additional Items I would like to add
* The App should make use of the RxKotlin/LiveData library to provide observable
streams. (We would prefer RxKotlin more and RxAndroid can optionally also be used
on top of it.)
* Dagger should be used for dependancy injection. Basic graph should do.
* More tests/UI tests
* Onscreen Numeric Keyboard

## Screenshots
Image 1 | Image 2 | Image 3
------------ | ------------- | -------------
<img src="/images/Screenshot_1566945359.png" width="280" height="480"> | <img src="/images/Screenshot_1566945384.png" width="280" height="480"> | <img src="/images/Screenshot_1566945393.png" width="280" height="480">
Multiple of 3, show "Fizz" | Multiple of 3 and 5, show "FizzBuzz" | Else show the value
