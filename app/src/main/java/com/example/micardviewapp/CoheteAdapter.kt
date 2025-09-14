package com.example.micardviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * El Adaptador. Es el corazón del RecyclerView.
 * Recibe una lista de objetos Cohete y sabe cómo mostrarlos en la pantalla.
 */
class CoheteAdapter(private val listaCohetes: List<Cohete>) : RecyclerView.Adapter<CoheteAdapter.CoheteViewHolder>() {

    /**
     * El ViewHolder. Es como un "cajón" que contiene las vistas de UNA SOLA tarjeta.
     * Guarda las referencias a los TextViews para no tener que buscarlos cada vez.
     */
    class CoheteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombreTextView: TextView = itemView.findViewById(R.id.tvNombreCohete)
        val descripcionTextView: TextView = itemView.findViewById(R.id.tvDescripcionCohete)
    }

    /**
     * Se llama cuando el RecyclerView necesita crear un nuevo "cajón" (ViewHolder).
     * Infla (crea) el diseño de nuestra tarjeta desde el archivo XML.
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoheteViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_cohete, parent, false)
        return CoheteViewHolder(itemView)
    }

    /**
     * Se llama para mostrar los datos en una posición específica.
     * Toma los datos del cohete en la 'position' y los pone en los TextViews del "cajón".
     */
    override fun onBindViewHolder(holder: CoheteViewHolder, position: Int) {
        val coheteActual = listaCohetes[position]
        holder.nombreTextView.text = coheteActual.nombre
        holder.descripcionTextView.text = coheteActual.descripcion
    }

    /**
     * Le dice al RecyclerView cuántos elementos hay en total en la lista.
     */
    override fun getItemCount() = listaCohetes.size
}
