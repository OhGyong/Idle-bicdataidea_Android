package com.example.Idle_Project.ui.sign_in_page

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.Idle_Project.R

class Sign_in_Page_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.fragment_sign_in_page, container, false)

        // 회원가입 버튼
        val sign_up_bt: Button = root.findViewById(R.id.sign_up_go_bt)
        sign_up_bt.setOnClickListener {
            findNavController().navigate(R.id.nav_sign_up_agree_page)
        }

        // 비밀번호찾기 버튼
        val find_password_bt: Button = root.findViewById(R.id.find_password_bt)
        find_password_bt.setOnClickListener {
            findNavController().navigate(R.id.nav_find_password_page)
        }

        return root
    }
}