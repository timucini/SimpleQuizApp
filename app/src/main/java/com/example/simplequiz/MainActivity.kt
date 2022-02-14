package com.example.simplequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simplequiz.databinding.ActivityMainBinding
import com.example.simplequiz.redux.ui.QuizActivity
import com.example.simplequiz.state.StateActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
        binding.btnStartGameState.setOnClickListener {
            val intent = Intent(this, StateActivity::class.java)
            startActivity(intent)
        }

    }
}