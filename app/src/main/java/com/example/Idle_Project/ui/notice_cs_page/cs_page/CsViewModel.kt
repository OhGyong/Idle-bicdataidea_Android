package com.example.Idle_Project.ui.notice_cs_page.cs_page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CsViewModel : ViewModel() {

    private  val _text = MutableLiveData<String>().apply {
        value = "문의게시판 화면"
    }
    val text: LiveData<String> = _text
}