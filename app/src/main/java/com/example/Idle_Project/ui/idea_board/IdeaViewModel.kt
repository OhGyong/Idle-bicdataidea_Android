package com.example.Idle_Project.ui.idea_board

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class IdeaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "아이디어 플랫폼 화면"
    }
    val text: LiveData<String> = _text
}