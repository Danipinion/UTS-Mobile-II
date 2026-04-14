package com.example.unscramble.di

import android.content.Context
import androidx.room.Room
import com.example.unscramble.room.GameDao
import com.example.unscramble.room.GameDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object GameModule {
    @Provides
    @Singleton
    fun provideGameDatabase(@ApplicationContext context: Context): GameDb = Room.databaseBuilder(context,
        GameDb::class.java, "game_db").fallbackToDestructiveMigration().build()

    @Provides
    fun provideGameDao(gameDatabase: GameDb): GameDao = gameDatabase.gameDao()

    @Provides
    fun provideGameRepo(gameDao: GameDao): gameRepository
}