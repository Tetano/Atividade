package com.example.vinicius.atividade

class Pessoa(val nome: String, val idade: Int, val peso: Float, val altura: Float){
    fun CalcIMC(peso: Float, altura: Float,idade: Int){
        val retorno: Float
        retorno = peso/(altura*altura);

    }
}