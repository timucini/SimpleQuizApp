package com.example.simplequiz.model

data class QuizResponse(
    val response_code: Int,
    val results: List<Result>
)