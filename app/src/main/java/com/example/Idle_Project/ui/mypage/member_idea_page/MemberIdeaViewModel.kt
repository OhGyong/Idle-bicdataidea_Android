package com.example.Idle_Project.ui.mypage.member_idea_page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MemberIdeaViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "내 아이디어 화면"
    }
    val text: LiveData<String> = _text
}