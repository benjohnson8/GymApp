package com.johnson.gym.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.johnson.gym.R
import com.johnson.gym.databinding.CreateExerciseFragmentBinding
import com.johnson.gym.ui.viewmodel.CreateExerciseViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CreateExerciseFragment : Fragment() {

    private val viewModel: CreateExerciseViewModel  by viewModels()
    private lateinit var binding: CreateExerciseFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.create_exercise_fragment, container, false)
        binding.viewModel = viewModel
        observeUi()
        return binding.root
    }

    private fun observeUi() {
        binding.btnSubmit.setOnClickListener {
            viewModel.submitExercise()
        }
    }


}