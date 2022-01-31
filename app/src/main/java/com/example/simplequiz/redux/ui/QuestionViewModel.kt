package com.example.simplequiz.redux.ui

import android.app.Application
import com.example.simplequiz.model.Response
import com.example.simplequiz.redux.store.MainStore
import me.tatarka.redux.android.lifecycle.StoreAndroidViewModel

class QuestionViewModel : StoreAndroidViewModel<Response, MainStore> {

    constructor(application: Application) : super(application, MainStore(Response(0, emptyList())))

}