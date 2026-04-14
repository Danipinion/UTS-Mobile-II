package com.example.unscramble.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Game::class], version = 1)
abstract class GameDb : RoomDatabase() {
    abstract fun gameDao(): GameDao
}