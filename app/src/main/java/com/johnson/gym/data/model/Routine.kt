package com.johnson.gym.data.model

data class Routine(private val name: String = "",
                   private val exerciseList: List<Exercise> = listOf()
)
