package com.example.latihan4_2020015

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio)
        val btnsubmit= findViewById<Button>(R.id.btnsubmit)
        val edNama= findViewById<EditText>(R.id.edNama)
        val edUsia= findViewById<EditText>(R.id.edUsia)
        val edAsal= findViewById<EditText>(R.id.edAsal)
        val edEmail = findViewById<EditText>(R.id.edEmail)
        val edNohp= findViewById<EditText>(R.id.edNohp)
        val edSingkat= findViewById<EditText>(R.id.edSingkat)

        btnsubmit.setOnClickListener() {
            val nama = edNama.text.toString()
            val usia = edUsia.text.toString().toInt()
            val asal = edAsal.text.toString()
            val email = edEmail.text.toString()
            val nohp = edNohp.text.toString().toInt()
            val singkat = edSingkat.text.toString()


            Intent(this, TargetActivity::class.java).also {
                it.putExtra("Extra_Nama", nama)
                it.putExtra("Extra_Usia", usia)
                it.putExtra("Extra_Asal", asal)
                it.putExtra("Extra_Email", email)
                it.putExtra("Extra_Nohp", nohp)
                it.putExtra("Extra_Singkat", singkat)
                startActivity(it)
            }
        }
    }
}