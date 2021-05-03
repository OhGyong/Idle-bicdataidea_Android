package com.example.idleProject.ui.notice_cs_page

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class CsData(
    private var csNum: String? = null,
    private var csTitle: String? = null
){
    fun getData1(): String? {
        return csNum
    }

    fun setData1(name: String) {
        this.csNum = csNum
    }

    fun getData2(): String? {
        return csTitle
    }

    fun setData2(address: String) {
        this.csTitle = csTitle
    }
}

class CsPageFragment : Fragment() {

    var csList: ArrayList<CsData> = arrayListOf(
        CsData("9", "글자 크기 14인 TextView의 길이가 어느 정도인지 테스트해 보겠습니다."),
        CsData("8", "문의게시판 제목8"),
        CsData("7", "문의게시판 제목7"),
        CsData("5", "문의게시판 제목5"),
        CsData("6", "문의게시판 제목6"),
        CsData("4", "문의게시판 제목4"),
        CsData("3", "문의게시판 제목3"),
        CsData("2", "문의게시판 제목2"),
        CsData("1", "문의게시판 제목1")
    )

    private lateinit var csListAdapter: CsPageAdapter
    private var csListView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = inflater.inflate(R.layout.fragment_cs_page, container, false)
        csListView=root.findViewById(R.id.csRecycler)

        //문의게시판 등록버튼 눌렀을 때
        val csRegistPageBt: Button = root.findViewById<Button>(R.id.cs_regist_page_bt)
        csRegistPageBt.setOnClickListener {
            findNavController().navigate(R.id.nav_cs_regist_page)
        }

        // 키보드 내리기
        var imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (root.findViewById<ConstraintLayout>(R.id.cs_page_layout)).setOnClickListener {
            imm.hideSoftInputFromWindow(root?.getWindowToken(), 0)
        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        csListAdapter = CsPageAdapter(csList)
        csListView?.adapter = csListAdapter
    }
}