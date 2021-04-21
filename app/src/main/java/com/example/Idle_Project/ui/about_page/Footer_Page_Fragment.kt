package com.example.Idle_Project.ui.about_page

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.Idle_Project.R
import com.example.Idle_Project.ui.anno_page.AnnoViewModel


class Footer_Page_Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_footer_page, container, false)
        return root
    }
}