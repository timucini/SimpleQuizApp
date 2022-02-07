package com.example.simplequiz.redux.ui

import android.app.Application
import com.example.simplequiz.model.QuizResponse
import com.example.simplequiz.model.Result
import com.example.simplequiz.redux.state.AppState
import com.example.simplequiz.redux.store.MainStore
import me.tatarka.redux.android.lifecycle.StoreAndroidViewModel

class QuestionViewModel(application: Application) : StoreAndroidViewModel<AppState, MainStore>(
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
)