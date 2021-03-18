package com.example.desafio2_dh.view

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio2_dh.R
import com.example.desafio2_dh.adapter.CervejariaPrincipalAdapter
import com.example.desafio2_dh.data.Data

class CervejariaPrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cervejaria_principal)

        val cervejaria_principal_recycler_view by lazy { findViewById<RecyclerView>(R.id.cervejaria_principal_recycler_view) }
        val cervejaria_principal_image by lazy { findViewById<ImageView>(R.id.cervejaria_principal_image) }
        val cervejaria_principal_name by lazy { findViewById<TextView>(R.id.cervejaria_principal_name) }
        val arrowBack by lazy { findViewById<ImageButton>(R.id.cervejaria_back_button) }

        val cervejaria = intent.extras
        val name = cervejaria?.getString("NAME")
        val image = cervejaria?.getInt("IMAGE")

        image?.let {cervejaria_principal_image.setImageResource(it) }
        cervejaria_principal_name.text = name!!


        val resObject = Data.data().find { it.cervejariaName.equals(name)}
        val bebidaList = resObject?.cervejariaMenu


        cervejaria_principal_recycler_view.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        cervejaria_principal_recycler_view.adapter = bebidaList?.let {CervejariaPrincipalAdapter(it) }

        arrowBack.setOnClickListener { onBackPressed() }

    }
}