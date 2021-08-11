package com.chrhenry.trainz.repository

import com.chrhenry.trainz.entity.Training
import com.chrhenry.trainz.entity.User
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Flux

interface TrainingRepository: ReactiveMongoRepository<Training, String> {

    fun findByUser(user: User): Flux<Training>
}
