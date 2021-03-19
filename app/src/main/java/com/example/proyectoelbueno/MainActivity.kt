package com.example.proyectoelbueno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //Declaracion de las variables
    lateinit var primerBoton:Button
    lateinit var segundoBoton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("mi_app","Estoy en el metodo onCreate")

        //Inicializar las variables
        primerBoton = findViewById(R.id.primer_boton)
        segundoBoton = findViewById(R.id.segundo_boton)

        primerBoton.setOnClickListener(View.OnClickListener {
            val miInten = Intent(this,MainActivity2::class.java)
            startActivity(miInten)
        })

        segundoBoton.setOnClickListener(View.OnClickListener {
            val miInten = Intent(this,TercerActivity::class.java)
            startActivity(miInten)
        })
    }

}