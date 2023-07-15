package com.example.latihan4_2020015.ui.keranjang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KeranjangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ini Isi Dari Keranjang Yakkk..."
    }
    val text: LiveData<String> = _text
}