package com.safiribytes.usermvvmkt
import retrofit2.Call
import retrofit2.http.GET

class ApiService {
    interface  JsonPlaceholderApi{
        @GET("/users")
        fun getUsers(): Call<List<User>>
    }
}