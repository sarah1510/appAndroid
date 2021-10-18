package com.example.primeiroapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.Toast
import java.util.*

class novo_usuario_activity : AppCompatActivity() {

    lateinit var editEmail: EditText
    lateinit var editSenha: EditText
    lateinit var editNome: EditText
    lateinit var editProfissao: EditText
    lateinit var editAltura: EditText
    lateinit var editDataNascimento: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_usuario)

        editEmail = findViewById(R.id.edit_email)
        editSenha = findViewById(R.id.edit_senha)
        editNome = findViewById(R.id.edit_nome)
        editProfissao = findViewById(R.id.edit_profissao)
        editAltura = findViewById(R.id.edit_altura)
        editDataNascimento = findViewById(R.id.et_data)



        supportActionBar!!.title = "Cadastro de novo usuário"


        //Criar um calendário
        val calendario = Calendar.getInstance()

        //Determinar os dados (dia, mês e ano) do calendário
        val ano = calendario.get(Calendar.YEAR)
        val mes = calendario.get(Calendar.MONTH)
        val dia = calendario.get(Calendar.DAY_OF_MONTH)

        //Abrir o componente DatePicker
        val etDataNascimento = findViewById<EditText>(R.id.et_data)

        etDataNascimento.setOnClickListener {
            val dp = DatePickerDialog(this,
                    DatePickerDialog.OnDateSetListener { view, _ano, _mes, _dia ->
                        etDataNascimento.setText("$_dia/${_mes + 1}/$_ano")
                        //poderia ser: (_dia + "/" + _mes + "/" + _ano)
                        //mas como isso é variável, pode colocar o $ antes
                    }, ano, mes, dia)

            dp.show()

        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_novo_usuario, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (validarCampos()){

        }
        return true
    }



    fun validarCampos(): Boolean {
        var valido = true

        if (editEmail.text.isEmpty()) {
            editEmail.error = "O campo é obrigatório"
            valido = false
        }

        if (editSenha.text.isEmpty()) {
            editSenha.error = "O campo é obrigatório"
            valido = false
        }

        if (editNome.text.isEmpty()) {
            editNome.error = "O campo é obrigatório"
            valido = false
        }

        if (editProfissao.text.isEmpty()) {
            editProfissao.error = "O campo é obrigatório"
            valido = false
        }

        if (editAltura.text.isEmpty()) {
            editAltura.error = "O campo é obrigatório"
            valido = false
        }

        if (editDataNascimento.text.isEmpty()) {
            editDataNascimento.error = "O campo é obrigatório"
            valido = false
        }


        return valido
        }

    //VERIFICAR A VALIDAÇÃO

 }

