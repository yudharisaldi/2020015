package com.example.latihan4_2020015.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ini Isi Dari Home Yakkk...."
    }
    val text: LiveData<String> = _text
}