package com.example.notesapp_v26.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey
    val id:Int,
    val noteTitle:String,
    val notDesc:String
)
