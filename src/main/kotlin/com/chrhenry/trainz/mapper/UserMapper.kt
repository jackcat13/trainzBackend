package com.chrhenry.trainz.mapper

import com.chrhenry.trainz.dto.UserApiDto
import com.chrhenry.trainz.entity.User

fun User.map() = UserApiDto(id)

fun UserApiDto.map() = User(id)