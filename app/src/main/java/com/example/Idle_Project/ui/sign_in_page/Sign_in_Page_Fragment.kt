package com.example.Idle_Project.ui.sign_in_page

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.Idle_Project.R

class Sign_in_Page_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root = inflater.inflate(R.layout.fragment_sign_in_page, container, false)

        val sign_up_bt: Button = root.findViewById(R.id.sign_up_go_bt)
        sign_up_bt.setOnClickListener {
            println("111111")
        }

        return root
    }
}