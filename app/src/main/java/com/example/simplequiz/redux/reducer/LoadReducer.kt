package com.example.simplequiz.redux.reducer

import android.util.Log
import com.example.simplequiz.model.QuizResponse
import com.example.simplequiz.redux.action.Load
import me.tatarka.redux.Reducer

class LoadReducer: Reducer<Load, QuizResponse> {
    override fun reduce(action: Load, state: QuizResponse): QuizResponse {
        Log.d("QuizReducer","In LoadReducer with data: ${action.quizResponse}")
        return action.quizResponse
    }
}