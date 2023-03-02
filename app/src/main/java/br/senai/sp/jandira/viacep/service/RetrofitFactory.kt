package br.senai.sp.jandira.viacep.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitFactory {

    val URL = "https://viacep.com.br/ws/"

    val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()//para construir de fato nossa conversao

    fun retrofitService(): CepRetrofitService {
        return retrofitFactory.create(CepRetrofitService::class.java)
    }

}