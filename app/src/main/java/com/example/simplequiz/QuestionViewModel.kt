package com.example.simplequiz

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.simplequiz.model.Response
import com.example.simplequiz.store.MainStore
import me.tatarka.redux.android.lifecycle.StoreAndroidViewModel

class QuestionViewModel : StoreAndroidViewModel<Response, MainStore> {

    constructor(application: Application) : super(application, MainStore(Response(0, emptyList())))

}