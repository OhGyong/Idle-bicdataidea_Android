package com.example.idleProject.ui.notice_cs_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
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
        CsData("9", "문의게시판 제목9"),
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
        val view: View = inflater.inflate(R.layout.fragment_cs_page, container, false)
        csListView=view.findViewById(R.id.csRecycler)

        //문의게시판 등록버튼 눌렀을 때
        val csRegistPageBt: Button = view.findViewById<Button>(R.id.cs_regist_page_bt)
        csRegistPageBt.setOnClickListener {
            findNavController().navigate(R.id.nav_cs_regist_page)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        csListAdapter = CsPageAdapter(csList)
        csListView?.adapter = csListAdapter
    }
}