package com.johnson.gym.data.dao

import androidx.room.*
import com.johnson.gym.data.model.Exercise
import com.johnson.gym.utilities.EXERCISE_LIST_TABLE_NAME
import kotlinx.coroutines.flow.Flow

/**
 * The Data Access Object for the [Exercise] class.
 */
@Dao
interface ExerciseDao {

    @Query("SELECT * FROM $EXERCISE_LIST_TABLE_NAME")
    fun getExerciseList(): Flow<List<Exercise>>

    @Insert
    suspend fun insertExercise(exercise: Exercise): Long

}