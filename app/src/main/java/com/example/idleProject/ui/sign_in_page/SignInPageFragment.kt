package com.example.idleProject.ui.sign_in_page

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.ScrollView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.example.idleProject.R

class SignInPageFragment : Fragment() {

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
        val findPasswordBt: Button = root.findViewById(R.id.find_password_bt)
        findPasswordBt.setOnClickListener {
            findNavController().navigate(R.id.nav_find_password_page)
        }

        // 키보드 내리기
        var imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (root.findViewById<ConstraintLayout>(R.id.sign_in_layout)).setOnClickListener {
            imm.hideSoftInputFromWindow(view?.getWindowToken(), 0)
        }

        return root
    }
}