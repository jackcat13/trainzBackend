package com.chrhenry.trainz.mapper

import com.chrhenry.trainz.dto.ExerciseApiDto
import com.chrhenry.trainz.entity.Exercise

fun Exercise.map() = ExerciseApiDto(title, variation, series, repetitions, mass, restTime, additionalInformation, resultConfidence, resultComments)

fun ExerciseApiDto.map() = Exercise(title, variation, series, repetitions, mass, restTime, additionalInformation, resultConfidence, resultComments)