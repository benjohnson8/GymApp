package com.johnson.gym.ui.viewmodel

import androidx.lifecycle.*
import com.johnson.gym.data.model.Exercise
import com.johnson.gym.data.repo.ExerciseRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreateExerciseViewModel @Inject constructor(private val exerciseRepo: ExerciseRepo) :
    ViewModel() {

    val exerciseName: MutableLiveData<String> = MutableLiveData()
    val reps: MutableLiveData<String> = MutableLiveData()
    val sets: MutableLiveData<String> = MutableLiveData()
    val notes: MutableLiveData<String> = MutableLiveData()
    val weight: MutableLiveData<String> = MutableLiveData()

    val unitList = listOf<String>("kg", "lb", "minutes")

    fun submitExercise(): LiveData<Boolean> {
        viewModelScope.launch {
            exerciseRepo.createNewExercise(Exercise("Curls",1,3,22,""))
        }
        return liveData { false }
    }

}