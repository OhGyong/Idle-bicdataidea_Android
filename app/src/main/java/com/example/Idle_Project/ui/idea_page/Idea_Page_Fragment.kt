package com.example.Idle_Project.ui.idea_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.Idle_Project.R

class Idea_Page_Fragment : Fragment() {

    private lateinit var idea_page_model: IdeaViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        idea_page_model =
                ViewModelProvider(this).get(IdeaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_idea_page, container, false)
        val textView: TextView = root.findViewById(R.id.text_idea)
        idea_page_model.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}