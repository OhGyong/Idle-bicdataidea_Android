package com.example.idleProject.ui.sign_up_page

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.idleProject.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SignUpPageFragment : Fragment() {

    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_sign_up_page, container, false)

        var choiceState = 0;

        // SignUpAgreeFragment 에서 얻은 선택 약관 체크 여부
        arguments.let {
            it?.getInt("choiceState")
            choiceState = it!!.getInt("choiceState")
        }

        // spinner data 넣기, (시도를 선택해주세요 처리)
        val spinner: Spinner = root.findViewById(R.id.sign_up_state_spinner)
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
        (root.findViewById<ConstraintLayout>(R.id.sign_up_layout)).setOnClickListener {
            imm.hideSoftInputFromWindow(view?.getWindowToken(), 0)
        }



        /**
         * API 연결
         */
        var data: SignUpPageData? = null;

        val retrofit = Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val dataService: SignUpPageInterface = retrofit.create(SignUpPageInterface::class.java);
        dataService.signUpPageInterface().enqueue(object : Callback<SignUpPageData>{
            override fun onFailure(call: Call<SignUpPageData>, t: Throwable) {
                println("에러에러에러");
            }

            override fun onResponse(call: Call<SignUpPageData>, response: Response<SignUpPageData>) {
                if(response == null){
                    println("빈값");
                }
                data = response.body();
            }
        })
        return root
    }
}

class insertSpinner(){

}