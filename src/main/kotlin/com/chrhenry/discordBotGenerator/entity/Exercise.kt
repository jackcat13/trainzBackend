package com.chrhenry.discordBotGenerator.entity

data class Exercise (
    val title: ExerciseTitle,
    val variation: ExerciseVariation?,
    val repetitions: Int,
    val restTime: Int,
    val additionalInformation: String,
    val resultConfidence: ExerciseResultCondifence,
    val resultComments: String
)
