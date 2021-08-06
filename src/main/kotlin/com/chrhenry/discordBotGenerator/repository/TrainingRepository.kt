package com.chrhenry.discordBotGenerator.repository

import com.chrhenry.discordBotGenerator.entity.Training
import com.chrhenry.discordBotGenerator.entity.User
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Flux

interface TrainingRepository: ReactiveMongoRepository<Training, String> {

    fun findByUser(user: User): Flux<Training>
}
