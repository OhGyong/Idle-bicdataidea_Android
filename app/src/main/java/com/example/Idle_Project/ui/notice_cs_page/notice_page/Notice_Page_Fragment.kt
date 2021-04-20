package com.example.Idle_Project.ui.notice_cs_page.notice_page

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.Idle_Project.R

class Notice_Page_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_notice_page, container, false)

        val cs_btn: Button = root.findViewById(R.id.notice_bt2)
        cs_btn.setOnClickListener {
            findNavController().navigate(R.id.nav_cs_page)
//            cs_btn.
        }

        return root
    }
}