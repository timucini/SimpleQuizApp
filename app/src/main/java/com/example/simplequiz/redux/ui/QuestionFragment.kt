package com.example.simplequiz.redux.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.input.input
import com.example.simplequiz.R
import com.example.simplequiz.databinding.QuestionFragmentBinding
import com.example.simplequiz.redux.action.AddUserName
import com.example.simplequiz.redux.action.LoadActionCreate
import com.example.simplequiz.redux.middleware.DataStore
import com.example.simplequiz.redux.state.AppState

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

        val questionObserver = Observer<AppState> { response ->
            binding.tvQuestionText.text = response.quizResponse.results[0].question
            binding.tvUserName.text = response.userName
        }

        viewModel.state.observe(viewLifecycleOwner,questionObserver)
        binding.btnOpenDialog.setOnClickListener {
            MaterialDialog(this.requireContext()).show {
                input { _, text ->
                    store.dispatch(AddUserName(text.toString()))
                }
                positiveButton(R.string.positive_btn)
            }
        }
        return binding.root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}