package com.example.unscramble.repository

import com.example.unscramble.room.Game
import com.example.unscramble.room.GameDao
import kotlinx.coroutines.flow.Flow

class GameRepositry(private val gameDao: GameDao) {
    fun getAllAnswers(): Flow<List<Game>> = gameDao.getAllCorrectAnswers()

    suspend fun insertAnswer(answer: String) {
        gameDao.insert(Game(_id = 0, answer = answer))
    }

    suspend fun deleteAllAnswers() {
        gameDao.deleteAll()
    }
}