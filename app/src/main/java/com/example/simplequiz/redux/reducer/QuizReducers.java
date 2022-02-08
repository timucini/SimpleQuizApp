package com.example.simplequiz.redux.reducer;

import com.example.simplequiz.redux.action.Action;
import com.example.simplequiz.redux.action.AddUserName;
import com.example.simplequiz.redux.action.Load;
import com.example.simplequiz.redux.state.AppState;
import me.tatarka.redux.Reducer;
import me.tatarka.redux.Reducers;

public class QuizReducers {

    public static Reducer<Action, AppState> reducer() {
        return Reducers.<Action, AppState>matchClass()
                .when(Load.class, new LoadReducer())
                .when(AddUserName.class, new AddUserNameReducer());
    }
}
