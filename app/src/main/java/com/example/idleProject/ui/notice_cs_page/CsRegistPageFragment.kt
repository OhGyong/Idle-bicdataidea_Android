package com.example.idleProject.ui.notice_cs_page

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.example.idleProject.R
import com.example.idleProject.databinding.FragmentCsRegistPageBinding
import com.example.idleProject.databinding.FragmentIdeaRegistPageBinding

class CsRegistPageFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentCsRegistPageBinding>(inflater, R.layout.fragment_cs_regist_page, container, false)

        var mEditor = binding.editorCsRegist

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

        // 키보드 내리기
        var imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (binding.csRegistLayout).setOnClickListener {
            imm.hideSoftInputFromWindow(view?.getWindowToken(), 0)
        }

        return binding.root
    }
}