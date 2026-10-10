package com.example.taskmanager.domain.model

import android.R
import androidx.lifecycle.viewmodel.CreationExtras
import java.time.LocalDate

data class Task(
    val idTask: String,
    val title: String,
    val description: String,
    val dueDate: LocalDate,
    val creationDate: LocalDate,
    val status: TaskStatus,
    val assigneTo: String,
    val priority: TaskPriority,
    val notes: String
)
