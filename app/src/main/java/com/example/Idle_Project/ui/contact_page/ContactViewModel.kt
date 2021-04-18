package com.example.Idle_Project.ui.contact_page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "고객센터 화면"
    }
    val text: LiveData<String> = _text
}