package com.example.idleProject.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.idleProject.R

class HomeFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        // 홈에서 아이디어 플랫폼으로 이동하는 뷰
        val homeToIdea: ConstraintLayout = root.findViewById(R.id.homeToidea_bt)
        homeToIdea.setOnClickListener {
            findNavController().navigate(R.id.nav_idea_page)
        }

        // 홈에서 공고정보 게시판으로 이동하는 뷰
        val homeToAnno: ConstraintLayout = root.findViewById(R.id.homeToanno_bt)
        homeToAnno.setOnClickListener {
            findNavController().navigate(R.id.nav_anno_page)
        }
        return root
    }
}