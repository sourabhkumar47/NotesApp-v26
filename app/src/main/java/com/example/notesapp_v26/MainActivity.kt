package com.example.notesapp_v26

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.notesapp.database.NoteDatabase
import com.example.notesapp.viewmodel.NoteViewModel
import com.example.notesapp.viewmodel.NoteViewModelFactory
import com.example.notesapp_v26.repository.NotesRepository

class MainActivity : AppCompatActivity() {
private lateinit var noteViewModel: NoteViewModel

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    setUpViewModel()
}

private fun setUpViewModel() {
    val notesRepository = NotesRepository(NoteDatabase(this))
    val viewModelProviderFactory = NoteViewModelFactory(application, notesRepository)
    noteViewModel =
        ViewModelProvider(this, viewModelProviderFactory)[NoteViewModel::class.java]
}
}
