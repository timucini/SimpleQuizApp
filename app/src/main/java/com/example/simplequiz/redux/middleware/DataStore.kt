package com.example.simplequiz.redux.middleware

import android.util.Log
import com.example.simplequiz.api.QuizApi
import com.example.simplequiz.api.RetroFitApi
import com.example.simplequiz.data.QuizRepository
import com.example.simplequiz.data.QuizRepositoryImpl
import com.example.simplequiz.model.QuizResponse
import kotlinx.coroutines.*
import javax.inject.Inject

class DataStore @Inject constructor(private val repository: QuizRepository) {

    fun getQuestion(): QuizResponse = runBlocking {
        Log.d("GetQuestion","In DataStore")
        repository.getQuestionsWithRedux()
    }

}