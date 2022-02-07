package com.example.simplequiz.redux.middleware

import me.tatarka.redux.middleware.Middleware

class QuizMiddleware<A, R>: Middleware<A, R> {
    override fun dispatch(next: Middleware.Next<A, R>?, action: A): R {
        TODO("Not yet implemented")
    }
}