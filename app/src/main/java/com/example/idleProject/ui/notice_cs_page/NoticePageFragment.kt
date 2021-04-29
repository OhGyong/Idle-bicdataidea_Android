package com.example.idleProject.ui.notice_cs_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class NoticeData(
    private var notice_num: String? = null,
    private var notice_title: String? = null,
    private var notice_date: String? = null
){
    fun getData1(): String? {
        return notice_num
    }

    fun setData1(name: String) {
        this.notice_num = notice_num
    }

    fun getData2(): String? {
        return notice_title
    }

    fun setData2(address: String) {
        this.notice_title = notice_title
    }
    fun getData3(): String? {
        return notice_date
    }

    fun setData3(address: String) {
        this.notice_date = notice_date
    }


}

class NoticePageFragment : Fragment() {

    var noticeList: ArrayList<NoticeData> = arrayListOf(
        NoticeData("9", "공지사항 제목9", "2021-04-29"),
        NoticeData("8", "공지사항 제목8", "2021-04-29"),
        NoticeData("7", "공지사항 제목7", "2021-04-29"),
        NoticeData("6", "공지사항 제목6", "2021-04-29"),
        NoticeData("5", "공지사항 제목5", "2021-04-29"),
        NoticeData("4", "공지사항 제목4", "2021-04-29"),
        NoticeData("3", "공지사항 제목3", "2021-04-29"),
        NoticeData("2", "공지사항 제목2", "2021-04-29"),
        NoticeData("1", "공지사항 제목1", "2021-04-29")
    )

    private lateinit var noticeListAdapter: NoticePageAdapter
    private var noticeListView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view: View = inflater.inflate(R.layout.fragment_notice_page, container, false)
        noticeListView = view.findViewById(R.id.notice_recycler)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        noticeListAdapter = NoticePageAdapter(noticeList)
        noticeListView?.adapter = noticeListAdapter
    }
}