package com.example.simplequiz.redux.ui

import android.app.Application
import com.example.simplequiz.model.QuizResponse
import com.example.simplequiz.model.Result
import com.example.simplequiz.redux.store.MainStore
import me.tatarka.redux.android.lifecycle.StoreAndroidViewModel

class QuestionViewModel : StoreAndroidViewModel<QuizResponse, MainStore> {

    constructor(application: Application) : super(application, MainStore(
       QuizResponse(0, listOf(
            Result("","","", emptyList(),"Test question","")
        ))))

}