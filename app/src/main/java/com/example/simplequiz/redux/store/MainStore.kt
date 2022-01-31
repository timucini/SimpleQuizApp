package com.example.simplequiz.redux.store

import com.example.simplequiz.model.Response
import me.tatarka.redux.SimpleStore

class MainStore : SimpleStore<Response> {

    constructor(initialState: Response?) : super(initialState)
}