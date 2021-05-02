package com.example.idleProject.ui.mypage

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.idleProject.R

class MemberUpdatePageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_member_update_page, container, false)

        val spinner: Spinner = view.findViewById(R.id.sign_up_state)
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.state_array,
            R.layout.tab_layout
        ).also { adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        // 키보드 내리기
        var imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (view.findViewById<ConstraintLayout>(R.id.member_upate_layout)).setOnClickListener {
            imm.hideSoftInputFromWindow(view?.getWindowToken(), 0)
        }

        return view
    }
}