package com.example.primeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = findViewById<Button>(R.id.button_calcular)

        val edPeso = findViewById<EditText>(R.id.edit_text_peso)

       val edAltura = findViewById<EditText>(R.id.edit_text_altura)

        val textResultado = findViewById<TextView>(R.id.edit_text_view_resultado)

       btnCalcular.setOnClickListener {
            val peso = edPeso.text.toString().toInt()
           val altura = edAltura.text.toString().toDouble()

           val imc = calculaImc(peso, altura)

           textResultado.text = String.format("%.1f", imc)



        }
    }

}