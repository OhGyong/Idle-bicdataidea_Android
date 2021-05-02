package com.example.idleProject.ui.sign_up_page

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.idleProject.R

class Sign_up_Agree_Fragement : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_sign_up_agree, container, false)

        //스크롤 처리 때문에 추가했는데 없어도 돌아감
        var textView: TextView = root.findViewById(R.id.textview_signup1)
        textView.setMovementMethod(ScrollingMovementMethod())

        var signUpAgreeBt: Button = root.findViewById(R.id.sign_up_agree_bt)
        signUpAgreeBt.setOnClickListener{
            findNavController().navigate(R.id.nav_sign_up_page)
        }
        return root
    }
}