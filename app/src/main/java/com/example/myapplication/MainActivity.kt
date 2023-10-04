package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calcButton.setOnClickListener {
            val firstNumber = binding.firstNumberEditText.text.toString().toDoubleOrNull()
            val secondNumber = binding.secondNumberEditText.text.toString().toDoubleOrNull()

            if (firstNumber != null && secondNumber != null) {
                val result = firstNumber + secondNumber
                binding.resultTextView.text = "Result: $result"
            } else {
                binding.resultTextView.text = "Invalid input. Please enter valid numbers."
            }


        }
    }
}
