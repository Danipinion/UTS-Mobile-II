package com.example.unscramble.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("correct_answers")
data class Game (
    @PrimaryKey(autoGenerate = true) val _id: Int,
    @ColumnInfo(name = "correct_answer") val answer: String
)