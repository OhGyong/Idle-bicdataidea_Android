package com.example.Idle_Project.ui.notice_cs_page.notice_page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NoticeViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply {
        value = "공지사항 화면"
    }
    val text: LiveData<String> = _text
}