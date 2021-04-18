package com.example.Idle_Project.ui.login_page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "로그인 화면"
    }
    val text: LiveData<String> = _text
}