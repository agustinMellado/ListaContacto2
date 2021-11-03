package com.example.listacontacto2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListaFragment : Fragment(), RecyclerViewAdapter.ClickListener {
    private lateinit var adapter: RecyclerViewAdapter
    val listaContacto: ArrayList<Contacto> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_lista, container, false)
        builDisplayData()
        //declaro el inicializador de diseño
        initRecyclerView(view)

        return view
    }

    //C
    private fun initRecyclerView(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        //

        adapter = RecyclerViewAdapter(listaContacto, this)
        recyclerView.adapter = adapter

    }
    //Agregamos datos manualmente a la lista de contactos
    private fun builDisplayData() {
        listaContacto.add(
            Contacto(
                "agustin",
                "hola como estas",
                "14:40pm",
                "299499023",
                imagenId = R.drawable.icon_user_a,
                "av alem"
            )
        )
        listaContacto.add(
            Contacto(
                "carla",
                "Conectate ",
                "8:40am",
                "29949223",
                imagenId = R.drawable.icon_user_a,
                "roca 122"
            )
        )
        listaContacto.add(
            Contacto(
                "facu",
                "jsjsjs",
                "22:00pm",
                "299499066",
                imagenId = R.drawable.icon_user_a,
                "1200"
            )
        )
        listaContacto.add(
            Contacto(
                "nico",
                "hola como estas",
                "20:21pm",
                "299493333",
                imagenId = R.drawable.icon_user_a,
                "venezuela"
            )
        )
        listaContacto.add(
            Contacto(
                "antonella",
                "hola como estas?",
                "09:00am",
                "299234023",
                imagenId = R.drawable.icon_user_a,
                "naciones unidas"
            )
        )
        listaContacto.add(
            Contacto(
                "ester",
                "ey",
                "13:40pm",
                "299424023",
                imagenId = R.drawable.icon_user_a,
                "mengelle"
            )
        )
        listaContacto.add(
            Contacto(
                "juan",
                "asdas",
                "15:40pm",
                "299429023",
                imagenId = R.drawable.icon_user_a,
                "m. estrada"
            )
        )
        listaContacto.add(
            Contacto(
                "abi",
                "jsjs",
                "14:40pm",
                "299499023",
                imagenId = R.drawable.icon_user_a,
                "f. oro"
            )
        )

    }

  /*  companion object {

        fun newInstance() =
            ListaFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }*/
}