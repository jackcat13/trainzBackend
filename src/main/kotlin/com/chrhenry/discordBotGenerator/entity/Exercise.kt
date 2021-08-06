package com.chrhenry.discordBotGenerator.entity

import java.time.Duration

data class Exercise (
    val title: ExerciseTitle,
    val variation: ExerciseVariation?,
    val repetitions: Int,
    val restTime: Duration,
    val additionalInformation: String,
    val resultConfidence: ExerciseResultCondifence,
    val resultComments: String
)
