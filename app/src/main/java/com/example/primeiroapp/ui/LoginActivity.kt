package com.example.primeiroapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.primeiroapp.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar!!.hide()

        val criarConta = findViewById<TextView>(R.id.tv_criar_conta)

        criarConta.setOnClickListener {
            val abrirActivityLogin =
                    Intent(this, NovoUsuarioActivity::class.java)

            startActivity(abrirActivityLogin)
        }

    }
}