package com.example.idleProject.ui.contact_page

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
import com.example.idleProject.databinding.FragmentContactPageBinding
import com.example.idleProject.databinding.FragmentCsRegistPageBinding

class ContactPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<FragmentContactPageBinding>(inflater, R.layout.fragment_contact_page, container, false)

        val mEditor = binding.editorContactRegist

        mEditor.setPlaceholder("내용을 작성하세요")

        binding.actionUndo.setOnClickListener {
            mEditor.undo() // 되돌리기
        }
        binding.actionRedo.setOnClickListener {
            mEditor.redo() // 되돌리기 취소
        }
        binding.actionBold.setOnClickListener {
            mEditor.setBold() // 진하게
        }
        binding.actionUnderline.setOnClickListener {
            mEditor.setUnderline() // 밑줄
        }
        binding.actionItalic.setOnClickListener {
            mEditor.setItalic() // 기울임
        }
        binding.actionHead.setOnClickListener {
            mEditor.setHeading(1) // 헤더
        }
        binding.actionStrikethrough.setOnClickListener {
            mEditor.setStrikeThrough() // 글씨 가운데 줄 긋기
        }
        binding.actionListBullet.setOnClickListener {
            mEditor.setBullets() // 들여쓰기 점
        }
        binding.actionSubScription.setOnClickListener {
            mEditor.setBlockquote() // 들여쓰기
        }

        // 키보드 내리기
        val imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (binding.contactLayout).setOnClickListener {
            imm.hideSoftInputFromWindow(view?.getWindowToken(), 0)
        }

        return binding.root
    }
}