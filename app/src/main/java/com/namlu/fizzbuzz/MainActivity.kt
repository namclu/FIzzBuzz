package com.namlu.fizzbuzz

import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.namlu.fizzbuzz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: FizzBuzzViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProviders.of(this)
            .get(FizzBuzzViewModel::class.java)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        viewModel.editNumberInput.observe(this, Observer {
            binding.seekNumberInput.progress = it.toIntOrNull() ?: 0
            binding.editNumberInput.setSelection(it.length)
            viewModel.calculateFizzBuzz()
        })

        updateTextFromSlider()
    }


    // Read slider value and update FizzBuzz text
    private fun updateTextFromSlider() {
        binding.seekNumberInput.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Update EditText
                binding.editNumberInput.setText(progress.toString(), TextView.BufferType.EDITABLE)
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
