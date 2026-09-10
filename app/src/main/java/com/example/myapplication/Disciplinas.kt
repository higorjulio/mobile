package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class Disciplinas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_disciplinas)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val botaoVoltar = findViewById<Button>(R.id.buttonVoltar)
        botaoVoltar.setOnClickListener {
            finish()
        }

        val botaoProgramacao = findViewById<MaterialButton>(R.id.btnProgramacao)
        val botaoBancoDados = findViewById<MaterialButton>(R.id.btnBancoDados)
        val botaoEngSoftware = findViewById<MaterialButton>(R.id.btnEngSoftware)
        val botaoDevWeb = findViewById<MaterialButton>(R.id.btnDevWeb)
        val botaoDevMobile = findViewById<MaterialButton>(R.id.btnDevMobile)
        val botaoIA = findViewById<MaterialButton>(R.id.btnIA)

        botaoProgramacao.setOnClickListener { abrirDetalhes("Programação") }
        botaoBancoDados.setOnClickListener { abrirDetalhes("Banco de Dados") }
        botaoEngSoftware.setOnClickListener { abrirDetalhes("Engenharia de Software") }
        botaoDevWeb.setOnClickListener { abrirDetalhes("Desenvolvimento Web") }
        botaoDevMobile.setOnClickListener { abrirDetalhes("Desenvolvimento Mobile") }
        botaoIA.setOnClickListener { abrirDetalhes("Inteligência Artificial") }
    }
    private fun abrirDetalhes(nomeDisciplina: String){
        val intent = Intent(this, DetalhesDisciplinaActivity::class.java)

//        cria uma """variavel""" nova
        intent.putExtra("NOME_DISCIPLINA", nomeDisciplina)
        startActivity(intent)
    }
}