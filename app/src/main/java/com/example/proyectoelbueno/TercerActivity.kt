package com.example.proyectoelbueno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TercerActivity : AppCompatActivity() {

    lateinit var primerBoton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercer)
        //Inicializar las variables
        primerBoton = findViewById(R.id.actividad_tres_boton_uno)


        primerBoton.setOnClickListener (View.OnClickListener {
            val miInten = Intent(this,MainActivity::class.java)
            startActivity(miInten)
        } )
    }
}