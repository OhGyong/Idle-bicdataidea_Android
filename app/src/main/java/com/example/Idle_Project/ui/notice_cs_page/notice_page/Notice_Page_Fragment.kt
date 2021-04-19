package com.example.Idle_Project.ui.notice_cs_page.notice_page

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.Idle_Project.R

class Notice_Page_Fragment : Fragment() {

    private lateinit var notice_page_model: NoticeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notice_page_model =
            ViewModelProvider(this).get(NoticeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notice_page, container, false)
//        val textView: TextView = root.findViewById(R.id.text_notice)
//        notice_page_model.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }
}