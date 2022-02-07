package com.example.simplequiz.redux.middleware

import android.util.Log
import com.example.simplequiz.api.QuizApi
import com.example.simplequiz.api.RetroFitApi
import com.example.simplequiz.data.QuizRepositoryImpl
import com.example.simplequiz.model.QuizResponse
import com.example.simplequiz.model.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataStore {

    fun getQuestion(): QuizResponse {
        Log.d("GetQuestion","In DataStore")
        val quizApi = RetroFitApi.getInstance().create(QuizApi::class.java)
        val repository = QuizRepositoryImpl(quizApi)
        val call = repository.getQuestionsWithRedux()
        var callResponse: QuizResponse = QuizResponse(0, listOf(
            Result("","","", emptyList(),"Test question","")
        ))
        call.enqueue(object : Callback<QuizResponse> {
            override fun onResponse(call: Call<QuizResponse>, response: Response<QuizResponse>) {
                Log.d("Get Questions", "succeeded")
                callResponse = response.body()!!
            }

            override fun onFailure(call: Call<QuizResponse>, t: Throwable) {
                Log.d("Get Questions","Failed : $t")
            }
        })
        return callResponse
    }
}