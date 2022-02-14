package com.example.simplequiz.redux.store

import com.example.simplequiz.redux.action.Action
import com.example.simplequiz.redux.reducer.QuizReducers
import com.example.simplequiz.redux.state.AppState
import me.tatarka.redux.*

class MainStore(initialState: AppState) : SimpleStore<AppState>(initialState) {

    private val dispatcher: Dispatcher<Action,Action>
    private val thunkDispatcher: Dispatcher<Thunk<Action,Action>, Void>

    init {
        val reducers = QuizReducers.reducer()
        dispatcher = Dispatcher.forStore(this,reducers)
        thunkDispatcher = ThunkDispatcher(dispatcher)
    }

    fun dispatch(thunk: Thunk<Action, Action>) {
        thunkDispatcher.dispatch(thunk)
    }

    fun dispatch(action: Action): Action {
        return dispatcher.dispatch(action)
    }


}