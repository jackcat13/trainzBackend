package com.chrhenry.discordBotGenerator.mapper

import com.chrhenry.discordBotGenerator.dto.TrainingApiDto
import com.chrhenry.discordBotGenerator.entity.Training
import com.chrhenry.discordBotGenerator.entity.Program
import org.bson.types.ObjectId

fun Training.map() = TrainingApiDto(_id.toString(), title, date, user.map(), program.map())

fun TrainingApiDto.map() = Training(_id?.let { ObjectId(_id) }, title, date, user.map(), program.map())