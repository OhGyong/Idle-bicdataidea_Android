package com.example.Idle_Project.ui.sign_up_page

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.TextView
import com.example.Idle_Project.R

class Sign_up_Agree_Fragement : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_sign_up_agree, container, false)
        var textView: TextView = root.findViewById(R.id.textview_signup1)
        textView.setOnClickListener{
            println("터치")

        }
        textView.setMovementMethod(ScrollingMovementMethod())
        return root
    }
}