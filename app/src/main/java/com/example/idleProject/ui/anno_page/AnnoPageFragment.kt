package com.example.idleProject.ui.anno_page

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

// 리스트 클래스 선언
class AnnoData(
    private var annoNum: String? = null,
    private var annoTitle: String? = null
){
    fun getData1(): String? {
        return annoNum
    }

    fun setData1(name: String) {
        this.annoNum = annoNum
    }

    fun getData2(): String? {
        return annoTitle
    }

    fun setData2(address: String) {
        this.annoTitle = annoTitle
    }
}

class AnnoPageFragment : Fragment() {

    // 리스트에 값 삽입
    var annoList: ArrayList<AnnoData> = arrayListOf(
        AnnoData("9", "글자 크기 16인 TextView의 길이가 어느정도인지 테스트하는 중 입니다."),
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
    private lateinit var annoListAdapter: AnnoPageAdapter
    private var annoListView: RecyclerView? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_anno_page, container, false)
        annoListView=root.findViewById(R.id.annoRecycler) // 데이터가 위치할 리사이클러 뷰 위치 연결

        // 키보드 내리기
        var imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (root.findViewById<ConstraintLayout>(R.id.anno_page_layout)).setOnClickListener {
            imm.hideSoftInputFromWindow(view?.getWindowToken(), 0)
        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        annoListAdapter = AnnoPageAdapter(annoList)
        annoListView?.adapter = annoListAdapter
    }
}