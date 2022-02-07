package com.example.simplequiz.api

import com.example.simplequiz.model.QuizResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import rx.Observable
import java.util.*

interface QuizApi {

    @GET("api.php?amount=10&category=18&type=multiple")
    suspend fun get10ComputerQuestions() : QuizResponse

}