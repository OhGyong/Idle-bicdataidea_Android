package com.example.Idle_Project.ui.notice_cs_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.Idle_Project.R

class CsData(
    private var cs_num: String? = null,
    private var cs_title: String? = null
){
    fun getData1(): String? {
        return cs_num
    }

    fun setData1(name: String) {
        this.cs_num = cs_num
    }

    fun getData2(): String? {
        return cs_title
    }

    fun setData2(address: String) {
        this.cs_title = cs_title
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
        csListView=view.findViewById(R.id.cs_recycler)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        csListAdapter = CsPageAdapter(csList)
        csListView?.adapter = csListAdapter
    }
}