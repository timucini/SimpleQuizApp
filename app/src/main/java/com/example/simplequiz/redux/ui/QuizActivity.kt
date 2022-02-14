package com.example.simplequiz.redux.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simplequiz.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
    }
}