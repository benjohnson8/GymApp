package com.johnson.gym.data.repo

import com.johnson.gym.data.dao.ExerciseDao
import com.johnson.gym.data.model.Exercise
import javax.inject.Inject

class ExerciseRepo @Inject constructor(private val exerciseDao: ExerciseDao) {
    suspend fun createNewExercise(exercise: Exercise)  = exerciseDao.insertExercise(exercise)
}