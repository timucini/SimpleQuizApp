package com.example.simplequiz.model

data class Response(
    val response_code: Int,
    val results: List<Result>
)