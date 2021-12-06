package com.example.primeiroapp.repository

import android.content.Context
import com.example.primeiroapp.model.Pesagem

class PesagemRepository (var context: Context){

    //retorna uma lista de pesagem
    fun getListaPesagem(): List<Pesagem> {
        val listaPesagem = mutableListOf<Pesagem>()


        // *** Preencher a lista de pesagem
        val dados =
                context
                        .getSharedPreferences(
                                "usuario",
                            Context.MODE_PRIVATE)


//guardar as datas e pesos em uma variavel
        val pesosString = dados.getString("pesagem", "")
        //60;62;70;65;67
        val pesos = pesosString!!.split(";").toTypedArray()

        val datasString = dados.getString("data_pesagem", "")
        //2021-11-29;2021-11-29;2021-11-29;2021-11-29;2021-12-06

        val datas = datasString!!.split(";").toTypedArray()

//interação com a,listagem
        // *** Criar lista de pesagem
        for (i in 0 until pesos.size){
            // .. = até (de 0 até 3)
            val pesagem = Pesagem(datas[i], pesos[i].toInt())

            //adicionando o objeto para a lista
            listaPesagem.add(pesagem)

        }
        return listaPesagem
    }

}