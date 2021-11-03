package com.example.listacontacto2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class RecyclerViewAdapter(val listaContacto:List<Contacto>, val clickListener: ClickListener): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.MyViewHolder {
        //Inflamos nuestro diseño con el item de contacto
       val view= LayoutInflater.from(parent.context).inflate(R.layout.item_contacto,parent,false)

       return MyViewHolder(view)

    }
    override fun getItemCount(): Int {
      return listaContacto.size
    }



    class MyViewHolder(view: View):RecyclerView.ViewHolder(view){
        var nombre: TextView
        var imagenId: CircleImageView
        var horaMensaje: TextView
        var mensaje: TextView

        init {
            nombre = view.findViewById(R.id.nombreContacto)
            imagenId= view.findViewById(R.id.imagenPerfil)
            horaMensaje= view.findViewById(R.id.horaMensaje)
            mensaje= view.findViewById(R.id.mensajeContacto)
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nombre.text=listaContacto.get(position).nombre
        holder.imagenId.setImageResource(R.drawable.icon_user_a)
        holder.horaMensaje.text= listaContacto.get(position).horaMensaje
        holder.mensaje.text=listaContacto.get(position).mensaje
        //cuando de clickee sobre un item
        holder.itemView.setOnClickListener{
            clickListener.onItemClick(listaContacto.get(position))
        }

    }
    //cuando el usuario haga click
    interface ClickListener{
        fun onItemClick(contacto: Contacto){

        }
    }

}