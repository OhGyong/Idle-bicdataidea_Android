package com.example.Idle_Project.ui.anno_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.Idle_Project.R
import com.example.Idle_Project.ui.idea_page.IdeaData

// 리스트 클래스 선언
class AnnoData(
    private var anno_num: String? = null,
    private var anno_title: String? = null
){
    fun getData1(): String? {
        return anno_num
    }

    fun setData1(name: String) {
        this.anno_num = anno_num
    }

    fun getData2(): String? {
        return anno_title
    }

    fun setData2(address: String) {
        this.anno_title = anno_title
    }
}

class Anno_Page_Fragment : Fragment() {

    // 리스트에 값 삽입
    var annoList: ArrayList<AnnoData> = arrayListOf(
        AnnoData("9", "공고정보 제목9"),
        AnnoData("8", "공고정보 제목8"),
        AnnoData("7", "공고정보 제목7"),
        AnnoData("6", "공고정보 제목6"),
        AnnoData("5", "공고정보 제목5"),
        AnnoData("4", "공고정보 제목4"),
        AnnoData("3", "공고정보 제목3"),
        AnnoData("2", "공고정보 제목2"),
        AnnoData("1", "공고정보 제목1")
    )

    // 어댑터 연결, 리사이클러뷰에 연결을 위한 변수 선언
    private lateinit var annoListAdapter: AnnoAdapter
    private var annoListView: RecyclerView? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_anno_page, container, false)
        annoListView=root.findViewById(R.id.anno_recycler) // 데이터가 위치할 리사이클러 뷰 위치 연결
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        annoListAdapter = AnnoAdapter(annoList)
        annoListView?.adapter = annoListAdapter
    }
}