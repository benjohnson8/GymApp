package com.johnson.gym.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    val observableState = MutableLiveData<ObservableState>()
    fun onCreateWorkoutPressed(){
        
    }
}

enum class ObservableState{
    NAVIGATE_TO_CREATE_WORKOUT
}