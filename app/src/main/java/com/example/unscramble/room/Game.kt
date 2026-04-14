package com.example.unscramble.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("correct_answers")
data class Game (
    @PrimaryKey(autoGenerate = true) val _id: Int,
    val answer: String
)