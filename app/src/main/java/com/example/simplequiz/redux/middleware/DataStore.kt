package com.example.simplequiz.redux.middleware

import android.util.Log
import com.example.simplequiz.api.QuizApi
import com.example.simplequiz.api.RetroFitApi
import com.example.simplequiz.data.QuizRepositoryImpl
import com.example.simplequiz.model.QuizResponse
import kotlinx.coroutines.*

class DataStore {

    fun getQuestion(): QuizResponse = runBlocking {
        Log.d("GetQuestion","In DataStore")
        val quizApi = RetroFitApi.getInstance().create(QuizApi::class.java)
        val repository = QuizRepositoryImpl(quizApi)
        repository.getQuestionsWithRedux()
    }

}