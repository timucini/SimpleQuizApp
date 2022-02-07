package com.example.simplequiz.model

data class DisplayQuestion(
    val questionText: String,
    val correctAnswer: String,
    val incorrectAnswers: List<String>
)
