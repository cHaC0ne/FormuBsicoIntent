package com.example.proyectofromulariobascico

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.proyectofromulariobascico.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.bEnviar.setOnClickListener {
            checkValue()
        }
    }

    fun checkValue() {

        if (b.etMail.text.isNotEmpty() and
            b.etPass.text.isNotEmpty() and
            b.etTelf.text.isNotEmpty()) {
            val myIntent = Intent(this, ResultActivity::class.java) //muestro el Intent al que quiero ir que es al resulta activity
            myIntent.putExtra("i_Mail", b.etMail.text)
            myIntent.putExtra("i_Pass", b.etPass.text)
            myIntent.putExtra("i_Telf", b.etTelf.text)
            startActivity(myIntent)
            Toast.makeText(this, "TODO CORRECTO", Toast.LENGTH_LONG).show()
        } else {
            mensajako("Todos los campos tienen que estar rellenos")
        }
    }
    fun mensajako(string: String){
        Toast.makeText(this, string, Toast.LENGTH_LONG).show() // creo una funcion que se llame como quiero para no tener que hacer tantos Toast
    }
}