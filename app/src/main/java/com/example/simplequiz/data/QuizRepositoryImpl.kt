package com.example.simplequiz.data

import com.example.simplequiz.api.QuizApi
import com.example.simplequiz.model.QuizResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.await
import retrofit2.awaitResponse

class QuizRepositoryImpl(private val quizApi: QuizApi): QuizRepository {
    override val computerQuestions: Flow<QuizResponse> = flow {
        // while (true) to constantly update State

        // repeat to repeat api call only once
        repeat(1) {
            val questionList = quizApi.get10ComputerQuestions()
            emit(questionList)

        }
    }

    override suspend fun getQuestionsWithRedux(): QuizResponse = withContext(Dispatchers.IO) {
        val response = quizApi.get10ComputerQuestions()
        response
    }
}