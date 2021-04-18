package com.example.Idle_Project.ui.logout_page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LogoutViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "로그아웃 화면"
    }
    val text: LiveData<String> = _text
}