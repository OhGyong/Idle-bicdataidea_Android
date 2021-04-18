package com.example.Idle_Project.ui.anno_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.Idle_Project.R

class Anno_Page_Fragment : Fragment() {

    private lateinit var anno_page_model: AnnoViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        anno_page_model =
                ViewModelProvider(this).get(AnnoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_anno_page, container, false)
        val textView: TextView = root.findViewById(R.id.text_anno)
        anno_page_model.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}