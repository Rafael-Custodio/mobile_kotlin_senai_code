package com.senai.vsconnect_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.senai.vsconnect_kotlin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    //É uma propriedade privada  como o nome binding do tipo ActivityLoginBinding
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        binding.btnEntrar.setOnClickListener { it:View
        val mainIntent = Intent(this@LoginActivity, MainActivity::class.java)

            startActivity(mainIntent)

            finish()

        }
    }
}