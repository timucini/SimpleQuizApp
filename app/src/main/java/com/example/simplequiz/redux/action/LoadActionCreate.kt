package com.example.simplequiz.redux.action

import android.util.Log
import com.example.simplequiz.redux.middleware.DataStore
import me.tatarka.redux.Thunk

class LoadActionCreate(private val dataStore: DataStore) {
    fun load(): Thunk<Action, Action> {
        Log.d("GetQuestion","Create Thunk")
        val thunk =
            Thunk<Action, Action> { dispatcher ->
                dispatcher.dispatch(Load(dataStore.getQuestion()))
            }
        return thunk
    }
}