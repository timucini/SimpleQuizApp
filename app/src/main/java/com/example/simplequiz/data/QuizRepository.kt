package com.example.simplequiz.data

import com.example.simplequiz.model.QuizResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Call

interface QuizRepository {
    val computerQuestions: Flow<QuizResponse>

    fun getQuestionsWithRedux() : Call<QuizResponse>
}