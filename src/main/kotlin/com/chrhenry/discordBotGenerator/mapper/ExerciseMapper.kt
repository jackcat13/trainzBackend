package com.chrhenry.discordBotGenerator.mapper

import com.chrhenry.discordBotGenerator.dto.ExerciseApiDto
import com.chrhenry.discordBotGenerator.entity.Exercise

fun Exercise.map() = ExerciseApiDto(title, variation, repetitions, restTime, additionalInformation, resultConfidence, resultComments)

fun ExerciseApiDto.map() = Exercise(title, variation, repetitions, restTime, additionalInformation, resultConfidence, resultComments)