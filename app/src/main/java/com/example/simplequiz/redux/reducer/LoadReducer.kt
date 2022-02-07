package com.example.simplequiz.redux.reducer

import com.example.simplequiz.model.QuizResponse
import com.example.simplequiz.redux.action.Load
import me.tatarka.redux.Reducer

class LoadReducer: Reducer<Load, QuizResponse> {
    override fun reduce(action: Load, state: QuizResponse): QuizResponse {
        return action.quizResponse
    }
}