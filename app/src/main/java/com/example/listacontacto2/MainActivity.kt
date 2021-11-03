package com.example.listacontacto2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declaro e inicializo la lista para despues mostrar el fragmento
        val lista: Fragment = ListaFragment()
        /*val transation = supportFragmentManager.beginTransaction()
        transation.replace(R.id.contenedor, fragment)
        transation.commit()*/
        supportFragmentManager.beginTransaction().replace(R.id.contenedor,lista).commit()
    }
}