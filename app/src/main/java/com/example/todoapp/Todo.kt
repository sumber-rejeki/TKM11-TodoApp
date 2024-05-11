package com.example.todoapp

import java.time.Instant
import java.util.Date


data class Todo(
    var id: Int,
    var title: String,
    var createdAt: Date
)


fun getFakeTodo(): List<Todo>{
    return listOf<Todo>(
        Todo(1, "Makan", Date.from(Instant.now())),
        Todo(2, "Tidur", Date.from(Instant.now())),
        Todo(3, "Makan", Date.from(Instant.now())),
        Todo(4, "Tidur", Date.from(Instant.now())),
    )
}
