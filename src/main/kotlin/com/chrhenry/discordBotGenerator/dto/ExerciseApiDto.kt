package com.chrhenry.discordBotGenerator.dto

import com.chrhenry.discordBotGenerator.entity.ExerciseResultCondifence
import com.chrhenry.discordBotGenerator.entity.ExerciseTitle
import com.chrhenry.discordBotGenerator.entity.ExerciseVariation
import java.time.Duration

data class ExerciseApiDto (
    val title: ExerciseTitle,
    val variation: ExerciseVariation?,
    val repetitions: Int,
    val restTime: Duration,
    val additionalInformation: String,
    val resultConfidence: ExerciseResultCondifence,
    val resultComments: String
)