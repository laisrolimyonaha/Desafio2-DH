package com.example.desafio2_dh.model

data class Cervejaria(
        val cervejariaName: String,
        val cervejariaAddress: String,
        val cervejariaClosingTime: String,
        val cervejariaImage: Int,
        val cervejariaMenu:List<Bebidas>)