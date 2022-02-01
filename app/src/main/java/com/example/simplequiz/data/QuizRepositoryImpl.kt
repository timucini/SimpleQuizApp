package com.example.simplequiz.data

import com.example.simplequiz.api.QuizApi
import com.example.simplequiz.model.QuizResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class QuizRepositoryImpl(private val quizApi: QuizApi): QuizRepository {
    override val computerQuestions: Flow<QuizResponse> = flow {
        // while (true) to constantly update State

        // repeat to repeat api call only once
        repeat(1) {
            val questionList = quizApi.get10ComputerQuestions()
            emit(questionList)

        }
    }
}