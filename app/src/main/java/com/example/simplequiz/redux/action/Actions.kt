package com.example.simplequiz.redux.action

import com.example.simplequiz.model.QuizResponse


interface Action {

}

data class Load(val quizResponse: QuizResponse): Action

data class AddUserName(val name: String): Action