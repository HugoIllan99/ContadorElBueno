package com.example.proyectoelbueno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class SegundaActivity2 : AppCompatActivity() {

    lateinit var primerBoton: Button
    lateinit var segundoBoton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda2)
        //Inicializar las variables
        primerBoton = findViewById(R.id.actividad_dos_boton_uno)
        segundoBoton = findViewById(R.id.actividad_dos_boton_dos)

       primerBoton.setOnClickListener(View.OnClickListener {
            val miInten = Intent(this,MainActivity::class.java)
           startActivity(miInten)
       })

        segundoBoton.setOnClickListener(View.OnClickListener {
            val miInten = Intent(this,TercerActivity::class.java)
            startActivity(miInten)
        })
    }
}