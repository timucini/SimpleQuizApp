package com.example.simplequiz.redux.state

import com.example.simplequiz.model.QuizResponse

data class AppState(
    val quizResponse: QuizResponse,
    val userName: String
)

