package com.johnson.gym.data.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.johnson.gym.utilities.EXERCISE_LIST_TABLE_NAME

@Entity(tableName = EXERCISE_LIST_TABLE_NAME)
data class Exercise(
    @PrimaryKey @NonNull @ColumnInfo(name = "name") val name: String,
    @NonNull @ColumnInfo(name = "sets") val sets: Int,
    val reps : Int,
    val rest : Int,
    val notes : String
    )
