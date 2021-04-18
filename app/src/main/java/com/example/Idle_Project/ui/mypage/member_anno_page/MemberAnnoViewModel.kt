package com.example.Idle_Project.ui.mypage.member_anno_page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MemberAnnoViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "관심 사업 화면"
    }
    val text: LiveData<String> = _text
}