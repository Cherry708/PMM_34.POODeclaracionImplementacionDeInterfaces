package com.example.pmm_34poodeclaracionimplementaciondeinterfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultado0 = findViewById<TextView>(R.id.tvPunto10)
        val resultado1 = findViewById<TextView>(R.id.tvPunto11)

        val punto0 = PuntoEnEjeX(2)
        resultado0.text = punto0.toString()
        val punto1 = PuntoEnEjesXY(3,5)
        resultado1.text =punto1.toString()
    }
}
interface Punto {
    override fun toString(): String
}
class PuntoEnEjeX(val x: Int): Punto {
    override fun toString(): String {
        return "Punto en x:($x)"
    }
}
class PuntoEnEjesXY(val x: Int, val y: Int): Punto {
    override fun toString(): String {
        return "Puntos en X e Y: ($x,$y)"
    }
}
