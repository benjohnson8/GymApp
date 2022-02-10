package com.johnson.gym.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.johnson.gym.R
import com.johnson.gym.databinding.FragmentDashboardBinding
import com.johnson.gym.ui.viewmodel.DashboardViewModel

class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding
    private val viewModel: DashboardViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //Bind view
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false)

        //Listen for the user to press the create workout button
        binding.btnCreateWorkout.setOnClickListener {
            navigateToCreateRoutine()
        }
        //Listen for the user to press the create Exercise button
        binding.btnAddExercise.setOnClickListener {
            navigateToCreateExercise()
        }
        return binding.root
    }

    private fun navigateToCreateRoutine() {
        findNavController().navigate(DashboardFragmentDirections.actionDashboardFragmentToCreateRoutineFragment())
    }

    private fun navigateToCreateExercise() {
        findNavController().navigate(DashboardFragmentDirections.actionDashboardFragmentToCreateExerciseFragment())
    }
}