package com.example.simplequiz.data

import com.example.simplequiz.model.QuizResponse
import com.example.simplequiz.model.Result
import kotlinx.coroutines.flow.Flow

class FakeQuizRepositoryImpl : QuizRepository {

    private val quizResponse = QuizResponse(100, listOf(Result(
        "computer",
        "correct",
        "easy",
        listOf("incorrect1", "incorrect2", "incorrect3"),
        "what?",
        "multiple"
    )))

    private var shouldReturnNetworkError = false

    fun shouldReturnNetworkError(value: Boolean) {
        shouldReturnNetworkError = value
    }

    override val computerQuestions: Flow<QuizResponse>
        get() = TODO("Not yet implemented")

    override suspend fun getQuestionsWithRedux(): QuizResponse {
        TODO("Not yet implemented")
    }
}