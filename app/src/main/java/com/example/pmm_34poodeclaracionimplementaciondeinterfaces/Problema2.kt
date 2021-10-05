package com.example.pmm_34poodeclaracionimplementaciondeinterfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val cuadrado = Cuadrado(2)
        cuadrado.calcularPerimetro()
        cuadrado.calcularSuperficie()
        val rectangulo = Rectangulo(2,3)
        rectangulo.calcularPerimetro()
        rectangulo.calcularSuperficie()

        val tvCuadrado = findViewById<TextView>(R.id.tvCuadrado20)
        val tvRectangulo = findViewById<TextView>(R.id.tvRectangulo20)

        tvCuadrado.text = cuadrado.toString()
        tvRectangulo.text = rectangulo.toString()

    }
}
interface Figura {
    fun calcularSuperficie(): Int
    fun calcularPerimetro(): Int
    override fun toString():String
}

class Cuadrado(val lado0: Int): Figura {
    override fun calcularSuperficie(): Int {
        return lado0 * lado0
    }
    override fun calcularPerimetro(): Int{
        return lado0 * 4
    }
    override fun toString(): String {
        return "Cuadrado - superficie: ${calcularSuperficie()}, perímetro: ${calcularPerimetro()}"
    }

}
class Rectangulo(val lado0:Int, val lado1: Int): Figura {
    override fun calcularSuperficie(): Int {
        return lado0 * lado1
    }
    override fun calcularPerimetro(): Int {
        return (lado0 * 2) + (lado1 * 2)
    }
    override fun toString(): String {
        return "Rectángulo - superficie: ${calcularSuperficie()}, perímetro: ${calcularPerimetro()}"
    }
}
