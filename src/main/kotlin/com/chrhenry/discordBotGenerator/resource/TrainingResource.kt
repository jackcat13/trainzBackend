package com.chrhenry.discordBotGenerator.resource

import com.chrhenry.discordBotGenerator.dto.TrainingApiDto
import com.chrhenry.discordBotGenerator.entity.Training
import com.chrhenry.discordBotGenerator.mapper.map
import com.chrhenry.discordBotGenerator.service.TrainingService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@RestController()
class TrainingResource(private val trainingService: TrainingService) {

    companion object{
        private const val TRAININGS_PATH = "/trainings"
    }

    @GetMapping(TRAININGS_PATH)
    @ResponseBody
    fun getTrainingsForUser(@RequestParam userId: String): Flux<TrainingApiDto>{
        return trainingService.getTrainingsForUser(userId)
                .doOnNext { println("onNext: Training $it to be returned to consumer") }
                .map { it.map() }
                .doOnSubscribe { println("Return Trainings dtos to consumer") };
    }

    @PostMapping(TRAININGS_PATH)
    fun createTraining(@RequestBody trainingApiDto: TrainingApiDto): Mono<TrainingApiDto> {
        return trainingService.createOrUpdateTraining(trainingApiDto.map())
                .map { it.map() }
                .doOnSuccess { println("Training $it created") }
                .doOnSubscribe { println("Creating training $it") }
    }

    @DeleteMapping("$TRAININGS_PATH/{id}")
    fun deleteTraining(@PathVariable id: String): Mono<Void>{
        return trainingService.deleteTraining(id)
                .doOnSuccess { println("Training $it deleted") }
                .doOnSubscribe { println("Deleting training $it") }
    }

    @PutMapping(TRAININGS_PATH)
    fun updateTraining(@RequestBody trainingApiDto: TrainingApiDto): Mono<ResponseEntity<Training>> {
        return trainingService.createOrUpdateTraining(trainingApiDto.map())
                .map { ResponseEntity<Training>(it, HttpStatus.OK) }
                .doOnSuccess { println("Training $trainingApiDto updated") }
                .doOnSubscribe { println("Updating training $trainingApiDto") }
    }
}