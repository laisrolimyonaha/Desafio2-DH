package com.example.desafio2_dh.data

import com.example.desafio2_dh.R
import com.example.desafio2_dh.model.Bebidas
import com.example.desafio2_dh.model.Cervejaria

fun getData(): List<Cervejaria>{

    val bebida = Bebidas(
        "Delirium Argentum",
        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
        R.drawable.delirium,
        49.90)

    val listBebidas = mutableListOf<Bebidas>()
    for (i in 1..10) {listBebidas.add(bebida)}

    val elixirMaltado = Cervejaria(
        "Elixir Maltado",
        "Av. Pres. Castelo Branco, 199, Londrina",
        "23:30",
        R.drawable.elixirmaltado,
        listBebidas.toList())

    val hoppers = Cervejaria(
        "Cervejaria Hopper's",
        "R. Goiás - Centro, Londrina",
        "00:00",
        R.drawable.hoppers,
        listBebidas.toList())

    val nacaoBretta = Cervejaria(
        "Nação Breta",
        "Av. Me. Leônia Milito, 1400, Londrina ",
        "00:00",
        R.drawable.nacaobretta,
        listBebidas.toList())

    val dropTheHop = Cervejaria(
            "Drop The Hop",
            "Av. Me. Leônia Milito, 1900, Londrina",
            "00:00",
            R.drawable.dropthehop,
            listBebidas.toList())

    val cervejariaList = listOf<Cervejaria>(elixirMaltado,hoppers,nacaoBretta,dropTheHop)

    return cervejariaList

}
