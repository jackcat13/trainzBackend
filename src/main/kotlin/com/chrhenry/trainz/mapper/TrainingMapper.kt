package com.chrhenry.trainz.mapper

import com.chrhenry.trainz.dto.TrainingApiDto
import com.chrhenry.trainz.entity.Training
import org.bson.types.ObjectId

fun Training.map() = TrainingApiDto(_id.toString(), title, date, user.map(), program.map())

fun TrainingApiDto.map() = Training(_id?.let { ObjectId(_id) }, title, date, user.map(), program.map())