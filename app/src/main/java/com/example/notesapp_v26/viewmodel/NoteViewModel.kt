package com.example.notesapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.notesapp_v26.model.Note
import com.example.notesapp_v26.repository.NotesRepository
import kotlinx.coroutines.launch

class NoteViewModel(app:Application,private val notesRepository: NotesRepository): AndroidViewModel(app){
    fun addNote(note: Note) =
        viewModelScope.launch {
            notesRepository.insertNote(note)
        }

    fun updateNote(note: Note) =
        viewModelScope.launch {
            notesRepository.updateNote(note)
        }

    fun deleteNote(note: Note) =
        viewModelScope.launch {
            notesRepository.deleteNote(note)
        }

    fun getAllNotes() = notesRepository.getAllNotes()

}