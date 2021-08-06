package com.chrhenry.discordBotGenerator.service

import com.chrhenry.discordBotGenerator.entity.Training
import com.chrhenry.discordBotGenerator.entity.User
import com.chrhenry.discordBotGenerator.repository.TrainingRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class TrainingService(private val trainingRepository: TrainingRepository) {

    fun getTrainingsForUser(userId: String): Flux<Training> {
        return trainingRepository.findByUser(User(userId))
                .doOnNext { println("On next: Training $it retrieved") }
                .doOnSubscribe { println("Retrieve training by id $userId") }
    }

    fun createOrUpdateTraining(training: Training): Mono<Training> {
        return trainingRepository.save(training)
                .doOnSuccess { println("Created training entity $it") }
                .doOnSubscribe { println("Creating training entity $it") }
    }

    fun deleteTraining(trainingId: String): Mono<Void> {
        return trainingRepository.deleteById(trainingId)
                .doOnSuccess { println("Training entity $it deleted") }
                .doOnSubscribe{ println("Deleting training entity $it") }
    }
}
