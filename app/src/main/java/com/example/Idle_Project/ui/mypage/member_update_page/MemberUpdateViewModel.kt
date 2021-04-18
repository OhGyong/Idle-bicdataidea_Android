package com.example.Idle_Project.ui.mypage.member_update_page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MemberUpdateViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "회원정보수정 화면"
    }
    val text: LiveData<String> = _text
}