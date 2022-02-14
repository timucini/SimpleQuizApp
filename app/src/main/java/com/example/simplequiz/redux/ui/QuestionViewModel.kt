package com.example.simplequiz.redux.ui

import android.app.Application
import com.example.simplequiz.model.QuizResponse
import com.example.simplequiz.model.Result
import com.example.simplequiz.redux.action.LoadActionCreate
import com.example.simplequiz.redux.middleware.DataStore
import com.example.simplequiz.redux.state.AppState
import com.example.simplequiz.redux.store.MainStore
import dagger.hilt.android.lifecycle.HiltViewModel
import me.tatarka.redux.android.lifecycle.StoreAndroidViewModel
import javax.inject.Inject

@HiltViewModel
class QuestionViewModel @Inject constructor(application: Application, private val dataStore: DataStore) : StoreAndroidViewModel<AppState, MainStore>(
    application, MainStore(
        AppState(
            QuizResponse(
                0, listOf(
                    Result("", "", "", emptyList(), "Test question", "")
                )
            ),
            "testUserName"
        )
    )
) {
    fun loadQuestion() {
        store.dispatch(LoadActionCreate(dataStore).load())
    }
}