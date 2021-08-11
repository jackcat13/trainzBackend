package com.chrhenry.trainz.dto

import java.time.LocalDateTime

data class TrainingApiDto(val _id: String?,
                          val title: String,
                          val date: LocalDateTime,
                          val user: UserApiDto,
                          val program: ProgramApiDto
)
