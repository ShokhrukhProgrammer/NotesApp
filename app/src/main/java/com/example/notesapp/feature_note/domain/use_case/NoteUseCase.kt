package com.example.notesapp.feature_note.domain.use_case

data class NoteUseCase(
    val getNotes: GetNotesUseCase,
    val deleteNotes: DeleteNotesUseCase
)
