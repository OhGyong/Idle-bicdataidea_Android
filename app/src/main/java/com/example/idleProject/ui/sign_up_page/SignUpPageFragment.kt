package com.example.idleProject.ui.sign_up_page

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.idleProject.R
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SignUpPageFragment : Fragment() {

    var data: SignUpPageData? = null; // API 응답 data 변수
    var signUpGender: String? = null; // 남녀 성별 체크 변수

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_sign_up_page, container, false)

        var choiceState: Int; // signUpAgreeFragment에서 얻은 선택 약관 체크 여부 data 확인

        /**
         * signUpAgreeFragment에서 얻은 선택 약관 체크 여부 data 확인
         */
        arguments.let {
            it?.getInt("choiceState")
            choiceState = it!!.getInt("choiceState");
            println("이용약관 선택 값 : $choiceState");
        }

        /**
         * "시도를 선택해주세요" data 삽입, spinner 데이터 처리
         */
        val signUpStateSpinner: Spinner = root.findViewById(R.id.sign_up_state);
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.state_array,
            R.layout.tab_layout
        ).also { adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            signUpStateSpinner.adapter = adapter;
        }

        /**
         * 현재 fragment layout 클릭 시 올라온 키보드 내려가도록 처리
         */
        val imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager;
        (root.findViewById<ConstraintLayout>(R.id.sign_up_layout)).setOnClickListener {
            imm.hideSoftInputFromWindow(view?.getWindowToken(), 0)
        }

        /**
         * 회원가입에 들어갈 변수 선언
         */
        val signUpButton = root.findViewById<Button>(R.id.sign_up_bt); // 회원가입 버튼
        val signUpEmail = root.findViewById<TextView>(R.id.sign_up_email); // 이메일
        val signUpName = root.findViewById<TextView>(R.id.sign_up_name); // 이름
        val signUpPassword = root.findViewById<TextView>(R.id.sign_up_password); // 비밀번호
        val signUpPasswordCheck = root.findViewById<TextView>(R.id.sign_up_password_check); // 비밀번호 재확인
        val genderGroup = root.findViewById<RadioGroup>(R.id.gender_group); // 성별 라디오 그룹
        val signUpBirth = root.findViewById<TextView>(R.id.sign_up_birth); // 생년월일
        val signUpPhoneNum = root.findViewById<TextView>(R.id.sign_up_phone_num); // 전화번호
        val signUpCompany = root.findViewById<TextView>(R.id.sign_up_company); // 소속

        /**
         * 성별 체크 data 저장
         */
        genderGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.sign_up_man_check -> signUpGender = "남";
                R.id.sign_up_woman_check -> signUpGender = "여";
            }
        }

        /**
         * 회원가입 버튼 클릭 시 API 연결
         */
        signUpButton.setOnClickListener {
            println(signUpStateSpinner.selectedItem)
        }

        apiConnection();

        return root
    }


    /**
     * API 연결
     */
    fun apiConnection(){
        val retrofit = Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000") // AVD 환경
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val dataService: SignUpPageInterface = retrofit.create(SignUpPageInterface::class.java);
        dataService.signUpPageInterface().enqueue(object : Callback<SignUpPageData>{
            override fun onFailure(call: Call<SignUpPageData>, t: Throwable) {
                println("API 오류");
            }
            override fun onResponse(call: Call<SignUpPageData>, response: Response<SignUpPageData>) {
                if(response == null){
                    println("API 응답 DATA NULL");
                }
                data = response.body();
                println("API 응답 DATA : $data");
            }
        })
    }
}
