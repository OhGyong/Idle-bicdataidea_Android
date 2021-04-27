package com.example.Idle_Project.ui.mypage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.Idle_Project.R
import com.example.Idle_Project.ui.notice_cs_page.NoticeData
import com.example.Idle_Project.ui.notice_cs_page.NoticePageAdapter

class MyIdeaData(
    private var myidea_title: String? = null,
    private var myidea_date: String? = null
){
    fun getData1(): String? {
        return myidea_title
    }

    fun setData1(name: String) {
        this.myidea_title = myidea_title
    }

    fun getData2(): String? {
        return myidea_date
    }

    fun setData2(address: String) {
        this.myidea_date = myidea_date
    }
}

class MemberMyIdeaPageFragment : Fragment() {

    var myideaList: ArrayList<MyIdeaData> = arrayListOf(
        MyIdeaData("내 아이디어 제목9", "2021-05-02"),
        MyIdeaData("내 아이디어 제목8", "2021-05-02"),
        MyIdeaData("내 아이디어 제목7", "2021-05-02"),
        MyIdeaData("내 아이디어 제목6", "2021-04-29"),
        MyIdeaData("내 아이디어 제목5", "2021-04-28"),
        MyIdeaData("내 아이디어 제목4", "2021-04-28"),
        MyIdeaData("내 아이디어 제목3", "2021-04-27"),
        MyIdeaData("내 아이디어 제목2", "2021-04-27"),
        MyIdeaData("내 아이디어 제목1", "2021-04-27")
    )

    private lateinit var myideaListAdapter: MyIdeaPageAdapter
    private var myideaListView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_member_myidea_page, container, false)
        myideaListView = view.findViewById(R.id.myidea_recycler)

        // 아이디어 등록버튼 눌렀을 때 처리, 아이디어 등록 페이지로 이동
        val idea_regist_bt: Button = view.findViewById<Button>(R.id.idea_regist_bt)
        idea_regist_bt.setOnClickListener {
            findNavController().navigate(R.id.nav_idea_regist_page)
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        myideaListAdapter = MyIdeaPageAdapter(myideaList)
        myideaListView?.adapter = myideaListAdapter
    }
}