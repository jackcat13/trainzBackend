package com.chrhenry.discordBotGenerator.mapper

import com.chrhenry.discordBotGenerator.dto.ProgramApiDto
import com.chrhenry.discordBotGenerator.entity.Program

fun Program.map() = ProgramApiDto(type, repetition, exercises.map{ it.map() }.toSet() )

fun ProgramApiDto.map() = Program(type, repetition, exercises.map{ it.map() }.toSet() )