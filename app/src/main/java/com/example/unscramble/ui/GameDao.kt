package com.example.unscramble.ui

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GameDao {
    @Query("SELECT * FROM correct_answers")
    suspend fun getAllCorrectAnswers(): List<Game>

    @Insert
    suspend fun insert(vararg answer: Game)
}