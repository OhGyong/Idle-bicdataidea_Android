package com.example.Idle_Project.ui.login_page

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.Idle_Project.R
import com.example.Idle_Project.ui.mypage.member_anno_page.MemberAnnoViewModel

class Login_Page_Fragment : Fragment() {

    private lateinit var login_page_model: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        login_page_model =
            ViewModelProvider(this).get(LoginViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_anno_page, container, false)
        val textView: TextView = root.findViewById(R.id.text_anno)
        login_page_model.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}