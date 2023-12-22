package com.example.lesson

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    val binding: ActivityMainBinding
        get() = _binding ?: throw RuntimeException("Binding not initialized")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val login = binding.login.text
        val password = binding.password.text
        binding.button.setOnClickListener {
            Toast.makeText(this, login.toString() + " here" + password.toString(), Toast.LENGTH_SHORT).show()
            binding.login.error
            binding.password.error
            binding.button.isEnabled=false
            binding.button.visibility= View.INVISIBLE
        }



    }


}