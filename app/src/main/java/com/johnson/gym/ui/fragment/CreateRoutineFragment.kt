package com.johnson.gym.ui.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.johnson.gym.ui.viewmodel.CreateRoutineViewModel
import com.johnson.gym.R

class CreateRoutineFragment : Fragment() {

    companion object {
        fun newInstance() = CreateRoutineFragment()
    }

    private lateinit var viewModel: CreateRoutineViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.create_routine_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CreateRoutineViewModel::class.java)
        // TODO: Use the ViewModel
    }

}