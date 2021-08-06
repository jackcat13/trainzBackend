package com.chrhenry.discordBotGenerator.entity

data class Program(
        val type: ProgramType,
        val repetition: Int,
        val exercises: Set<Exercise>
)
