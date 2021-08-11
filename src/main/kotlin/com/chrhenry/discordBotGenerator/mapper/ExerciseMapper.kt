package com.chrhenry.discordBotGenerator.mapper

import com.chrhenry.discordBotGenerator.dto.ExerciseApiDto
import com.chrhenry.discordBotGenerator.entity.Exercise

fun Exercise.map() = ExerciseApiDto(title, variation, series, repetitions, mass, restTime, additionalInformation, resultConfidence, resultComments)

fun ExerciseApiDto.map() = Exercise(title, variation, series, repetitions, mass, restTime, additionalInformation, resultConfidence, resultComments)