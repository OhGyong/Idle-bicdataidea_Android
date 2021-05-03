package com.example.idleProject.ui.mypage

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class MyIdeaData(
    private var myIdeaTitle: String? = null,
    private var myIdeaDate: String? = null
){
    fun getData1(): String? {
        return myIdeaTitle
    }

    fun setData1(name: String) {
        this.myIdeaTitle = myIdeaTitle
    }

    fun getData2(): String? {
        return myIdeaDate
    }

    fun setData2(address: String) {
        this.myIdeaDate = myIdeaDate
    }
}

class MemberMyIdeaPageFragment : Fragment() {

    var myIdeaList: ArrayList<MyIdeaData> = arrayListOf(
        MyIdeaData("글자 크기 14인TextView의 길이가 어느정도인지 테스트하는 중 입니다.", "2021-05-02"),
        MyIdeaData("내 아이디어 제목8", "2021-05-02"),
        MyIdeaData("내 아이디어 제목7", "2021-05-02"),
        MyIdeaData("내 아이디어 제목6", "2021-04-29"),
        MyIdeaData("내 아이디어 제목5", "2021-04-28"),
        MyIdeaData("내 아이디어 제목4", "2021-04-28"),
        MyIdeaData("내 아이디어 제목3", "2021-04-27"),
        MyIdeaData("내 아이디어 제목2", "2021-04-27"),
        MyIdeaData("내 아이디어 제목1", "2021-04-27")
    )

    private lateinit var myIdeaListAdapter: MyIdeaPageAdapter
    private var myIdeaListView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = inflater.inflate(R.layout.fragment_member_myidea_page, container, false)
        myIdeaListView = root.findViewById(R.id.myIdeaRecycler)

        // 아이디어 등록버튼 눌렀을 때 처리, 아이디어 등록 페이지로 이동
        val ideaRegistBt: Button = root.findViewById<Button>(R.id.myIdeaRegistPageBt)
        ideaRegistBt.setOnClickListener {
            findNavController().navigate(R.id.nav_idea_regist_page)
        }

        // 키보드 내리기
        var imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (root.findViewById<ConstraintLayout>(R.id.myidea_layout)).setOnClickListener {
            imm.hideSoftInputFromWindow(root?.getWindowToken(), 0)
        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myIdeaListAdapter = MyIdeaPageAdapter(myIdeaList)
        myIdeaListView?.adapter = myIdeaListAdapter
    }
}