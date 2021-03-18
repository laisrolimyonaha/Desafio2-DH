package com.example.desafio2_dh.adapter.viewHolder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio2_dh.R

class CervejariaPrincipalViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val bebidaImage by lazy { itemView.findViewById<ImageView>(R.id.bebida_image)}
    val bebidaName by lazy { itemView.findViewById<TextView>(R.id.bebida_name) }
}