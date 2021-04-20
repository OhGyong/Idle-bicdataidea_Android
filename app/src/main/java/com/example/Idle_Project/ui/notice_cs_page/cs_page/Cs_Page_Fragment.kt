package com.example.Idle_Project.ui.notice_cs_page.cs_page

import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.example.Idle_Project.R

class Cs_Page_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_cs_page, container, false)

        //위젯 연결
        val notice_btn: Button = root.findViewById(R.id.cs_bt1)
        val cs_btn: Button = root.findViewById(R.id.cs_bt2)

        //배경색 설정
        notice_btn.setBackgroundColor(0xFFECEAEA.toInt())
        cs_btn.setBackgroundColor(0xFF8345F1.toInt())

        //글자 색 설정
        cs_btn.setTextColor(Color.WHITE)

        //버튼 이벤트
        notice_btn.setOnClickListener {
            findNavController().navigate(R.id.nav_notice_page)
        }
        return root
    }
}