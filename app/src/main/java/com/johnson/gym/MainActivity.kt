package com.johnson.gym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.johnson.gym.databinding.ActivityMainBinding
import com.johnson.gym.ui.fragment.DashboardFragment
import com.johnson.gym.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Inflate and bind the view
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //start observing the view model
        observeViewModel()
    }

    /**
     * Start observing the viewModel so that we can update the view accordingly
     */
    private fun observeViewModel() {

    }
}