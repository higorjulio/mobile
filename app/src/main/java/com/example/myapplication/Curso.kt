package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Curso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_curso)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val botaoVoltar = findViewById<Button>(R.id.buttonVoltar)
        botaoVoltar.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val botaoDisciplinas = findViewById<Button>(R.id.buttonDisciplinas)
        botaoDisciplinas.setOnClickListener {
            val intent = Intent(this, Disciplinas::class.java)
            startActivity(intent)
        }
    }
}