package com.example.Idle_Project.ui.contact_page

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.Idle_Project.R
import com.example.Idle_Project.ui.anno_page.AnnoViewModel

class Contact_Page_Fragment : Fragment() {

    private lateinit var contact_page_model: ContactViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        contact_page_model =
            ViewModelProvider(this).get(ContactViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_contact_page, container, false)
//        val textView: TextView = root.findViewById(R.id.text_anno)
//        contact_page_model.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }
}