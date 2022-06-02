package com.example.proyectofromulariobascico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectofromulariobascico.databinding.ActivityMainBinding
import com.example.proyectofromulariobascico.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var b: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityResultBinding.inflate(layoutInflater)
        setContentView(b.root)
        val datos = intent.extras
        val mail = datos?.get("i_Mail").toString()
        val pass = datos?.get("i_Pass").toString()
        val telf = datos?.get("i_Telf").toString()
        b.tvEjemplo.text = "DATOS\n\nMail :\t$mail\nPassword :\t\t" +
                "$pass\nTelefono : \t$telf\n"
        b.bVolver.setOnClickListener {
            val myIntent = Intent(this, ResultActivity::class.java)
            startActivity(myIntent)
        }
    }
}