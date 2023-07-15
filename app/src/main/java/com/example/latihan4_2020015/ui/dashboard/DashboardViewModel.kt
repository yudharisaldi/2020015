package com.example.latihan4_2020015.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Ini Isi Dari Dashboard Yakk..."
    }
    val text: LiveData<String> = _text
}