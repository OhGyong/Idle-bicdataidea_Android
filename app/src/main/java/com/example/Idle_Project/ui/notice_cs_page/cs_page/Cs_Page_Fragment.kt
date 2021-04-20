package com.example.Idle_Project.ui.notice_cs_page.cs_page

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.Idle_Project.R

class Cs_Page_Fragment : Fragment() {

    private lateinit var cs_page_model: CsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cs_page_model =
            ViewModelProvider(this).get(CsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_cs_page, container, false)
//        val textView: TextView = root.findViewById(R.id.text_anno)
//        cs_page_model.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }
}