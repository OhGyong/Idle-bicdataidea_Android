package com.example.Idle_Project.ui.mypage.member_point_page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MemberPointViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "포인트현황 화면"
    }
    val text: LiveData<String> = _text
}