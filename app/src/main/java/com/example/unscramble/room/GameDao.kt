package com.example.unscramble.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface GameDao {
    @Query("SELECT * FROM correct_answers")
    fun getAllCorrectAnswers(): Flow<List<Game>>

    @Insert
    suspend fun insert(answer: Game)

    @Query("DELETE FROM correct_answers")
    suspend fun deleteAll()
}