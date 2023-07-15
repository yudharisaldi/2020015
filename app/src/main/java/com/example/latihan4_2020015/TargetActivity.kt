package com.example.latihan4_2020015

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
        val tvhasil = findViewById<TextView>(R.id.tvhasil)
        val nama = intent.getStringExtra("Extra_Nama")
        val usia = intent.getIntExtra("Extra_Usia",0)
        val asal = intent.getStringExtra("Extra_Asal")
        val email = intent.getStringExtra("Extra_Email")
        val nohp = intent.getIntExtra("Extra_Nohp",0)
        val singkat = intent.getStringExtra("Extra_Singkat")

        val hasilData = "Nama           :$nama \n" +
                "Usia           :$usia \n" +
                "Asal           :$asal \n" +
                "Email          :$email \n" +
                "No Hp          :$nohp \n" +
                "Singkat           :$singkat"
        tvhasil.text =  hasilData
    }
}