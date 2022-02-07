package com.example.simplequiz.redux.reducer;

import com.example.simplequiz.model.QuizResponse;
import com.example.simplequiz.redux.action.Action;
import com.example.simplequiz.redux.action.Load;

import me.tatarka.redux.Reducer;
import me.tatarka.redux.Reducers;

public class QuizReducers {

    public static Reducer<Action, QuizResponse> reducer() {
        return Reducers.<Action, QuizResponse>matchClass()
                .when(Load.class, new LoadReducer());
    }
}
