package com.example.simplequiz.data

import com.example.simplequiz.model.QuizResponse
import kotlinx.coroutines.flow.Flow

interface QuizRepository {
    val computerQuestions: Flow<QuizResponse>
}