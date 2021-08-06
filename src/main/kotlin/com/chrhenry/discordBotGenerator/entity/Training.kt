package com.chrhenry.discordBotGenerator.entity

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Training(@Id val _id: ObjectId?,
                    val title: String,
                    val date: LocalDateTime,
                    val user: User,
                    val program: Program)
