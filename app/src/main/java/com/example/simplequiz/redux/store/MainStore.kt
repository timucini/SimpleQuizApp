package com.example.simplequiz.redux.store

import com.example.simplequiz.model.QuizResponse
import com.example.simplequiz.redux.action.Action
import com.example.simplequiz.redux.action.Load
import com.example.simplequiz.redux.action.LoadActionCreate
import com.example.simplequiz.redux.reducer.QuizReducers
import me.tatarka.redux.*

class MainStore(initialState: QuizResponse?) : SimpleStore<QuizResponse>(initialState) {

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