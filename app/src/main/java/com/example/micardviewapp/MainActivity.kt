package com.example.micardviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Buscamos el RecyclerView en nuestro layout por su ID.
        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewCohetes)

        // 2. Creamos la lista de datos de ejemplo que queremos mostrar.
        val listaDeCohetes = listOf(
            Cohete("Falcon 9", "El caballo de batalla de SpaceX, reutilizable y potente."),
            Cohete("Starship", "El futuro de los viajes interplanetarios, diseñado para Marte."),
            Cohete("Saturno V", "El legendario cohete que llevó a la humanidad a la Luna."),
            Cohete("Ariane 5", "El lanzador pesado de la Agencia Espacial Europea."),
            Cohete("Atlas V", "Un cohete versátil utilizado por la NASA y el Departamento de Defensa de EE.UU."),
            Cohete("Soyuz", "El cohete más fiable de la historia, de fabricación rusa."),
            Cohete("New Shepard", "El cohete suborbital de Blue Origin para el turismo espacial."),
            Cohete("Electron", "Un pequeño lanzador de Rocket Lab para satélites pequeños.")
        )

        // 3. Creamos una instancia de nuestro Adaptador y le pasamos la lista de datos.
        val adaptador = CoheteAdapter(listaDeCohetes)

        // 4. Conectamos todo. Le decimos al RecyclerView:
        //    a) Cómo debe organizar los elementos (en una lista vertical).
        //    b) Cuál es el adaptador que debe usar para gestionar los datos y las vistas.
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adaptador
    }
}
