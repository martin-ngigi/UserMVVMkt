package com.safiribytes.usermvvmkt

import android.annotation.SuppressLint
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.safiribytes.usermvvmkt.User
import com.safiribytes.usermvvmkt.ApiService

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val userList: MutableList<User> = mutableListOf()
    private  lateinit var adapter: UserAdapter
    private  lateinit var jsonPlaceholderApi: ApiService.JsonPlaceholderApi

//    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = UserAdapter(userList)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewUsers)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        // Initialize your Retrofit instance
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        jsonPlaceholderApi = retrofit.create(ApiService.JsonPlaceholderApi::class.java)
        val call: Call<List<User>> = jsonPlaceholderApi.getUsers()
        call.enqueue(object : Callback<List<User>>{
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                // Handle success
                if(response.isSuccessful){
                    System.out.println("---> SUCCESS")
                    userList.addAll(response.body()!!)
                    adapter.notifyDataSetChanged()
                }
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                // Handle failure
                System.out.println("---> FAILED")
            }

        })
    }
}