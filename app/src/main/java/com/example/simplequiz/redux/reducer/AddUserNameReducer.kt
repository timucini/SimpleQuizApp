package com.example.simplequiz.redux.reducer

import com.example.simplequiz.redux.action.AddUserName
import com.example.simplequiz.redux.state.AppState
import me.tatarka.redux.Reducer

class AddUserNameReducer : Reducer<AddUserName, AppState> {
    override fun reduce(action: AddUserName, state: AppState): AppState {
        return AppState(state.quizResponse,action.name)
    }
}