package com.example.retrofitxml.network

import com.example.retrofitxml.data.ToDo
import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {

    @GET("/todos")
    suspend fun getTodos(): Response<List<ToDo>>
}