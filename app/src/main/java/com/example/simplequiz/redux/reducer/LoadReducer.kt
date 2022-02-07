package com.example.simplequiz.redux.reducer

import android.util.Log
import com.example.simplequiz.redux.action.Load
import com.example.simplequiz.redux.state.AppState
import me.tatarka.redux.Reducer

class LoadReducer: Reducer<Load, AppState> {
    override fun reduce(action: Load, state: AppState): AppState {
        Log.d("QuizReducer","In LoadReducer with data: ${action.quizResponse}")
        return AppState(action.quizResponse,state.userName)
    }
}