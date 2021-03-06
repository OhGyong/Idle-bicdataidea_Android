package com.example.idleProject.ui.idea_page

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ScrollView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.getSystemService
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

        var binding = DataBindingUtil.inflate<FragmentIdeaRegistPageBinding>(inflater, R.layout.fragment_idea_regist_page, container, false)

        var mEditor = binding.editorIdeaRegist

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
        (binding.ideaRegistPageLayout).setOnClickListener {
            imm.hideSoftInputFromWindow(view?.getWindowToken(), 0)
        }

        return binding.root
    }
}