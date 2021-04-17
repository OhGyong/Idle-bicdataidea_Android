package com.example.Idle_Project.ui.notice_cs_board.cs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.Idle_Project.R
import com.example.Idle_Project.ui.anno_board.AnnoViewModel

class Cs_Board_Fragment : Fragment() {

    private lateinit var cs_board_model: CsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cs_board_model =
            ViewModelProvider(this).get(CsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_anno_board, container, false)
        val textView: TextView = root.findViewById(R.id.text_anno)
        cs_board_model.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}