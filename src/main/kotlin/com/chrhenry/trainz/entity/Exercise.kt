package com.chrhenry.trainz.entity

data class Exercise (
    val title: ExerciseTitle,
    val variation: ExerciseVariation?,
    val series: Int,
    val repetitions: Int,
    val mass: Int,
    val restTime: Int,
    val additionalInformation: String = "",
    val resultConfidence: ExerciseResultCondifence,
    val resultComments: String = "",
    val order: Int
)
