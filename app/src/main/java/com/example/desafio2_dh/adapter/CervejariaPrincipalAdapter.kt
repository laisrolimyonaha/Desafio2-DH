package com.example.desafio2_dh.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio2_dh.R
import com.example.desafio2_dh.adapter.viewHolder.CervejariaPrincipalViewHolder
import com.example.desafio2_dh.model.Bebidas
import com.example.desafio2_dh.view.BebidasDetalhesActivity

class CervejariaPrincipalAdapter(val bebidaList: List<Bebidas>): RecyclerView.Adapter<CervejariaPrincipalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CervejariaPrincipalViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_cervejaria_principal, parent, false)
        return CervejariaPrincipalViewHolder(view)
    }
    override fun onBindViewHolder(holder: CervejariaPrincipalViewHolder, position: Int) {

        val image = holder.bebidaImage
        image.setImageResource(bebidaList[position].bebidaImage)

        val name = holder.bebidaName
        name.text = bebidaList[position].bebidaName

        val meal = holder.itemView
        meal.setOnClickListener {
            Log.i("CLICk", "${name.text} bebida selecionada")
            val intent = Intent(it.context, BebidasDetalhesActivity::class.java)

            intent.putExtra("NAME", bebidaList[position].bebidaName)
            intent.putExtra("IMAGE", bebidaList[position].bebidaImage)
            intent.putExtra("DESC", bebidaList[position].bebidaDescription)
            intent.putExtra("PRICE", bebidaList[position].bebidaPrice)

            it.context.startActivity(intent)
        }

    }

    override fun getItemCount() = bebidaList.size
}