package com.example.Idle_Project.ui.mypage.member_idea_page

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.Idle_Project.R
import com.example.Idle_Project.ui.contact_page.ContactViewModel

class Member_Idea_Page_Fragment : Fragment() {

    private lateinit var member_point_page_model: MemberIdeaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        member_point_page_model =
            ViewModelProvider(this).get(MemberIdeaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_anno_page, container, false)
        val textView: TextView = root.findViewById(R.id.text_anno)
        member_point_page_model.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}