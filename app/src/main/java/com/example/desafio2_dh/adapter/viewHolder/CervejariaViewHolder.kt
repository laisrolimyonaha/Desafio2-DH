package com.example.desafio2_dh.adapter.viewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio2_dh.R

class CervejariaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val imageCervejaria by lazy {itemView.findViewById<ImageView>(R.id.image_cervejaria)}
    val nameCervejaria by lazy {itemView.findViewById<TextView>(R.id.name_cervejaria)}
    val addressCervejaria by lazy {itemView.findViewById<TextView>(R.id.address_cervejaria)}
    val closingTimeCervejaria by lazy {itemView.findViewById<TextView>(R.id.closing_time_cervejaria)}
}