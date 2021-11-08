package com.example.primeiroapp.utils

import android.content.Context

fun autenticar(email: String, senha: String, context: Context) : Boolean {

    //para abrir o arquivo
    //esse contexto é a activity
    val arquivo = context.getSharedPreferences(
            "usuario",Context.MODE_PRIVATE)

    return (email == arquivo.getString("email", "")
            && senha == arquivo.getString("senha", ""))


    //maneira mais compreensível
//    if (email == arquivo.getString("email", "")
//            && senha == arquivo.getString("senha", "")){
//        return true
//    } else {
//        return false
//    }


}