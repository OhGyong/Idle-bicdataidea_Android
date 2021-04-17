package com.example.Idle_Project.ui.anno_board

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AnnoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "공고정보 게시판 화면"
    }
    val text: LiveData<String> = _text
}