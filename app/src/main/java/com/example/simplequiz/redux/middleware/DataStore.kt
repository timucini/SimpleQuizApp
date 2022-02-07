package com.example.simplequiz.redux.middleware

import android.os.StrictMode
import android.util.Log
import com.example.simplequiz.api.QuizApi
import com.example.simplequiz.api.RetroFitApi
import com.example.simplequiz.data.QuizRepositoryImpl
import com.example.simplequiz.model.QuizResponse
import com.example.simplequiz.model.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.awaitResponse

class DataStore {

    // That needs to be changed :D
    init {
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
    }


    fun getQuestion(): QuizResponse {
        Log.d("GetQuestion","In DataStore")
        val quizApi = RetroFitApi.getInstance().create(QuizApi::class.java)
        val repository = QuizRepositoryImpl(quizApi)
        val call = repository.getQuestionsWithRedux()
        return call.execute().body()!!
    }
}