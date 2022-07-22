package com.example.retrofitxml.data

data class ToDo(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)