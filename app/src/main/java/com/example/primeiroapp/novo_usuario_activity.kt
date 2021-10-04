package com.example.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class novo_usuario_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_usuario)

        supportActionBar!!.title = "Perfil"



    }
}