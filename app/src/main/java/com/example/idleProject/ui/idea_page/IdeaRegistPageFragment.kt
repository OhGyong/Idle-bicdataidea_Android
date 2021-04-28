package com.example.idleProject.ui.idea_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.idleProject.R
import com.example.idleProject.databinding.FragmentIdeaRegistPageBinding

class IdeaRegistPageFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val root = inflater.inflate(R.layout.fragment_idea_regist_page, container, false)

        var binding = DataBindingUtil.inflate<FragmentIdeaRegistPageBinding>(inflater, R.layout.fragment_idea_regist_page, container, false)

        var mEditor = binding.editor

        mEditor.setPlaceholder("내용을 작성하세요")

        binding.actionUndo.setOnClickListener {
            mEditor!!.undo()
        }
        binding.actionRedo.setOnClickListener {
            mEditor!!.redo()
        }
        binding.actionBold.setOnClickListener {
            mEditor!!.setBold()
        }
        binding.actionUnderline.setOnClickListener {
            mEditor!!.setUnderline()
        }
        binding.actionItalic.setOnClickListener {
            mEditor!!.setItalic()
        }
        binding.actionHead.setOnClickListener {
            mEditor!!.setHeading(1)
        }
        binding.actionHead.setOnClickListener {
            mEditor!!.setHeading(1)
        }
        binding.actionStrikethrough.setOnClickListener {
            mEditor!!.setStrikeThrough()
        }
        binding.actionListBullet.setOnClickListener {
            mEditor!!.setBullets()
        }
        binding.actionSubScription.setOnClickListener {
            mEditor!!.setBlockquote()
        }

        return binding.root
    }
}