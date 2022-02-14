package com.example.simplequiz.state

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.simplequiz.databinding.StateQuizFragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class StateQuizFragment : Fragment() {

    private var _binding: StateQuizFragmentBinding? = null
    private val binding get() = _binding!!
    private val stateViewModel: StateQuizViewModel by viewModels()
    private var uiStateJob: Job? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = StateQuizFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        uiStateJob = lifecycleScope.launchWhenStarted {
            stateViewModel.uiState.collect {
                when(it) {
                    is StateQuizViewModel.StateQuizUiState.Success -> {
                        Log.d("uiState",it.questionList.toString())
                        binding.tvQuestionText.text = it.questionList[0].question
                    }
                    is StateQuizViewModel.StateQuizUiState.Error -> {
                        Log.d("uiState",it.exception.message.toString())
                    }
                }
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
    }
}