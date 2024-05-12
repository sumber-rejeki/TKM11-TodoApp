package com.example.todoapp_erdiansyah

import java.time.Instant
import java.util.Date

data class Todo (var id : Int, var title : String, var createdAt : Date)

fun getFakeTodo() : List<Todo>{
    return listOf<Todo>(
        Todo(1, "First todo", Date.from(Instant.now())),
        Todo(2, "Second todo", Date.from(Instant.now())),
        Todo(3, "This is my Third todo", Date.from(Instant.now())),
        Todo(4, "This will be my fourth todo so that i can use it in UI", Date.from(Instant.now()))
    );
}
