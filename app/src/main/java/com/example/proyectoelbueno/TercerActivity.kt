package com.example.proyectoelbueno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TercerActivity : AppCompatActivity() {

    lateinit var primerBoton: Button
    lateinit var segundoBoton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercer)
        //Inicializar las variables
        primerBoton = findViewById(R.id.actividad_tres_boton_uno)
        segundoBoton = findViewById(R.id.actividad_tres_boton_dos)

        primerBoton.setOnClickListener (View.OnClickListener {
            val miInten = Intent(this,MainActivity::class.java)
            startActivity(miInten)
        } )
        segundoBoton.setOnClickListener(View.OnClickListener {
            val miInten = Intent(this,SegundaActivity2::class.java)
            startActivity(miInten)
        })
    }
}