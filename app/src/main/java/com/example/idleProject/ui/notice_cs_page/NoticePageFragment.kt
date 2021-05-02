package com.example.idleProject.ui.notice_cs_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class NoticeData(
    private var noticeNum: String? = null,
    private var noticeTitle: String? = null
){
    fun getData1(): String? {
        return noticeNum
    }

    fun setData1(name: String) {
        this.noticeNum = noticeNum
    }

    fun getData2(): String? {
        return noticeTitle
    }

    fun setData2(address: String) {
        this.noticeTitle = noticeTitle
    }
}

class NoticePageFragment : Fragment() {

    var noticeList: ArrayList<NoticeData> = arrayListOf(
        NoticeData("9", "공지사항 제목9"),
        NoticeData("8", "공지사항 제목8"),
        NoticeData("7", "공지사항 제목7"),
        NoticeData("6", "공지사항 제목6"),
        NoticeData("5", "공지사항 제목5"),
        NoticeData("4", "공지사항 제목4"),
        NoticeData("3", "공지사항 제목3"),
        NoticeData("2", "공지사항 제목2"),
        NoticeData("1", "공지사항 제목1")
    )

    private lateinit var noticeListAdapter: NoticePageAdapter
    private var noticeListView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val root: View = inflater.inflate(R.layout.fragment_notice_page, container, false)
        noticeListView = root.findViewById(R.id.noticeRecycler)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        noticeListAdapter = NoticePageAdapter(noticeList)
        noticeListView?.adapter = noticeListAdapter
    }
}