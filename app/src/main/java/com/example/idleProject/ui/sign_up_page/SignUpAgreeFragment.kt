package com.example.idleProject.ui.sign_up_page

import android.content.Context
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.idleProject.R

class SignUpAgreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_sign_up_agree, container, false)

        val checkBox1 : CheckBox = root.findViewById(R.id.sign_up_check1) // 체크박스 필수1
        val checkBox2 : CheckBox = root.findViewById(R.id.sign_up_check2) // 체크박스 필수2
        val checkBox3 : CheckBox = root.findViewById(R.id.sign_up_check3) // 체크박스 선택
        val signUpAgreeBt: Button = root.findViewById(R.id.sign_up_agree_bt) // 확인 버튼

        // 확인 클릭시 회원가입 페이지로 이동
        signUpAgreeBt.setOnClickListener{

            // 필수 요소들이 둘 다 체크되었을 경우 회원가입 페이지로 이동
            if(checkBox1.isChecked && checkBox2.isChecked){
                findNavController().navigate(R.id.nav_sign_up_page)
            }
            // 필수 요소들을 체크하지 않았을 경우 toast로 필수 요소 체크하라고 알림
            else{
                Toast.makeText(context, "필수 항목들을 체크하시기 바랍니다.", Toast.LENGTH_SHORT).show()
            }
        }

        return root
    }
}