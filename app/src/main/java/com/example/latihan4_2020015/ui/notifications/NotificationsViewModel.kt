package com.example.latihan4_2020015.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ini Isi Dari Notifikasi Yakkk...."
    }
    val text: LiveData<String> = _text
}