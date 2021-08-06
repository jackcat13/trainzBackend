package com.chrhenry.discordBotGenerator.dto

import com.chrhenry.discordBotGenerator.entity.ProgramType

data class ProgramApiDto(
    val type: ProgramType,
    val repetition: Int,
    val exercises: Set<ExerciseApiDto>
)
