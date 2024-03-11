package com.safiribytes.usermvvmkt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CreateUserActivity : AppCompatActivity() {

    private lateinit var fNameET: EditText
    private lateinit var lNameET: EditText
    private lateinit var emailET: EditText
    private lateinit var usernameET: EditText
    private lateinit var registerBtn: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)

        fNameET = findViewById(R.id.fNameET)
        lNameET = findViewById(R.id.lNameET)
        emailET = findViewById(R.id.emailET)
        usernameET = findViewById(R.id.usernameET)
        fNameET = findViewById(R.id.fNameET)
        registerBtn = findViewById(R.id.registerBtn)
    }
}