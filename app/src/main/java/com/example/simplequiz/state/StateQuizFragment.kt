package com.example.simplequiz.state

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.simplequiz.R

class StateQuizFragment : Fragment() {

    companion object {
        fun newInstance() = StateQuizFragment()
    }

    private lateinit var viewModel: StateQuizViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.state_quiz_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StateQuizViewModel::class.java)
        // TODO: Use the ViewModel
    }

}