package com.chrhenry.trainz.dto

import com.chrhenry.trainz.entity.ExerciseResultCondifence
import com.chrhenry.trainz.entity.ExerciseTitle
import com.chrhenry.trainz.entity.ExerciseVariation

data class ExerciseApiDto (
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