package com.chrhenry.trainz.dto

import com.chrhenry.trainz.entity.ProgramType

data class ProgramApiDto(
    val type: ProgramType,
    val repetition: Int,
    val exercises: Set<ExerciseApiDto>
)
