package com.chrhenry.trainz.mapper

import com.chrhenry.trainz.dto.ProgramApiDto
import com.chrhenry.trainz.entity.Program

fun Program.map() = ProgramApiDto(type, repetition, exercises.map{ it.map() }.toSet() )

fun ProgramApiDto.map() = Program(type, repetition, exercises.map{ it.map() }.toSet() )