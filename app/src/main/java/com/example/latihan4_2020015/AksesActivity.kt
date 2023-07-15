package com.example.latihan4_2020015

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.latihan4_2020015.databinding.ActivityAksesBinding

class AksesActivity : AppCompatActivity() {
    lateinit var binding: ActivityAksesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAksesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBinding.setOnClickListener{
            Toast.makeText(this,"Ingin Mengunakan View Binding", Toast.LENGTH_SHORT).show()
        }
    }
}