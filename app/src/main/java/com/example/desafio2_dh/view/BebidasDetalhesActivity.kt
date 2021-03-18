package com.example.desafio2_dh.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.desafio2_dh.R

class BebidasDetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bebida_detalhe)

        val bebidaName by lazy {findViewById<TextView>(R.id.bebida_detalhe_name)}
        val bebidaDesc by lazy {findViewById<TextView>(R.id.bebida_detalhe_description)}
        val bebidaImage by lazy {findViewById<ImageView>(R.id.bebida_detalhe_image)}
        val backButton by lazy {findViewById<ImageButton>(R.id.bebida_back_button)}

        val bebida = intent.extras
        val name = bebida?.getString("NOME")
        val image = bebida?.getInt("IMAGEM")
        val desc = bebida?.getString("DESCRIÇÃO")

        bebidaName.text = name
        bebidaDesc.text = desc
        bebidaImage.setImageResource(image!!)

        backButton.setOnClickListener {onBackPressed()}
    }
}