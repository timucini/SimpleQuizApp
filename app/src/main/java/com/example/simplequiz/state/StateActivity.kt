package com.example.simplequiz.state

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simplequiz.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state)
    }
}