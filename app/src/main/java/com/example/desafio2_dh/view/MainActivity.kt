package com.example.desafio2_dh.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio2_dh.R
import com.example.desafio2_dh.adapter.CervejariaAdapter
import com.example.desafio2_dh.data.getData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cervejaria_recicler_view by lazy { findViewById<RecyclerView>(R.id.main_activity_recycler_view) }

        val cervejariaList = getData()

        cervejaria_recicler_view.layoutManager = LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false)

        cervejaria_recicler_view.adapter = CervejariaAdapter(cervejariaList)

    }

}