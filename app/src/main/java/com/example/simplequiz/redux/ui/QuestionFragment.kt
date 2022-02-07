package com.example.simplequiz.redux.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.simplequiz.databinding.QuestionFragmentBinding
import com.example.simplequiz.model.QuizResponse
import com.example.simplequiz.redux.action.LoadActionCreate
import com.example.simplequiz.redux.middleware.DataStore

class QuestionFragment : Fragment() {

    private var _binding: QuestionFragmentBinding? = null
    private val binding get() = _binding!!

    private val viewModel: QuestionViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = QuestionFragmentBinding.inflate(layoutInflater, container, false)
        val store = viewModel.store;
        store.dispatch(LoadActionCreate(DataStore()).load())

        val questionObserver = Observer<QuizResponse> { response ->
            binding.tvQuestionText.text = response.results[0].question
        }

        viewModel.state.observe(viewLifecycleOwner,questionObserver)
        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}