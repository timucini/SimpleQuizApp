package com.example.simplequiz.state

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simplequiz.api.QuizApi
import com.example.simplequiz.api.RetroFitApi
import com.example.simplequiz.data.QuizRepository
import com.example.simplequiz.data.QuizRepositoryImpl
import com.example.simplequiz.model.DisplayQuestion
import com.example.simplequiz.model.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class StateQuizViewModel @Inject constructor(
    private val repository: QuizRepository
) : ViewModel() {


    private val _uiState = MutableStateFlow<StateQuizUiState>(StateQuizUiState.Empty)
    // The UI collects form this StateFlow to get its state updates
    val uiState: StateFlow<StateQuizUiState> = _uiState

    init {
        viewModelScope.launch {
            repository.computerQuestions
                .catch { exception ->
                    _uiState.value = StateQuizUiState.Error(exception)
                    Log.d("ComputerQuestion","error while call api: ${exception.message}")
                }
                .collect { quizResponse ->
                    _uiState.value = StateQuizUiState.Success(quizResponse.results)
                    Log.d("ComputerQuestion","ComputerQuestions successfully loaded")

                }
        }
    }

    // Represents different states for the StateQuiz screen
    sealed class StateQuizUiState {
        data class Success(val questionList: List<Result>) : StateQuizUiState()
        data class Error(val exception: Throwable): StateQuizUiState()
        object Empty: StateQuizUiState()
    }
}