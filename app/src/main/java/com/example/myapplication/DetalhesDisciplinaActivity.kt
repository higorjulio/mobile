package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetalhesDisciplinaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes_disciplina)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nomeDisciplina = intent.getStringExtra("NOME_DISCIPLINA") ?: "Disciplina sem nome"

        val textViewNomeDisciplina = findViewById<TextView>(R.id.textViewNomeDisciplina)
        textViewNomeDisciplina.text = nomeDisciplina

        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)
        buttonVoltar.setOnClickListener {
            finish()
        }
        val buttonHome = findViewById<Button>(R.id.buttonHome)
        buttonHome.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            //limpa todas as telas e volta pra home, evitando consumir memoria ram
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }
    }
}