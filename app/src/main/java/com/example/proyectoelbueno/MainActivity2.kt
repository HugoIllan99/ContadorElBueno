package com.example.proyectoelbueno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    //Declaracion de variables
    var contador = 0
    lateinit var btnIncrementar:Button
    lateinit var btnDecrementar:Button
    lateinit var primerBoton: Button
    lateinit var tvContador:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //Inicializacion de varibales

        btnIncrementar =findViewById(R.id.btnIncrementar)
        primerBoton =findViewById(R.id.actividad_dos_boton_uno)
        btnDecrementar = findViewById(R.id.btnDecrementar)
        tvContador = findViewById(R.id.tvNumero)

        btnIncrementar.setOnClickListener {
            contador ++
            tvContador.text = "$contador"
            Log.d("contador","$contador")
        }

        btnDecrementar.setOnClickListener {
            contador --
            tvContador.text = "$contador"
            Log.d("contador","$contador")
        }
        primerBoton.setOnClickListener(View.OnClickListener {
            val miInten = Intent(this,MainActivity::class.java)
            startActivity(miInten)
        })
    }
}