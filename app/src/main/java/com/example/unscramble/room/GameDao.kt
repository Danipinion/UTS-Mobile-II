package com.example.unscramble.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GameDao {
    @Query("SELECT * FROM correct_answers")
    fun getAllCorrectAnswers(): List<Game>

    @Insert
    suspend fun insert(vararg answer: Game)
}