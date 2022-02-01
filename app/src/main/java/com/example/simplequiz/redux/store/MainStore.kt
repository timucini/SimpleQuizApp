package com.example.simplequiz.redux.store

import com.example.simplequiz.model.QuizResponse
import me.tatarka.redux.SimpleStore

class MainStore : SimpleStore<QuizResponse> {

    constructor(initialState: QuizResponse?) : super(initialState)
}