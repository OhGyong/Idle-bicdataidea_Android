package com.example.idleProject.ui.mypage

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class InterAnnoData(
    private var interAnnoNum: String? = null,
    private var interAnnoTitle: String? = null
){
    fun getData1(): String? {
        return interAnnoNum
    }

    fun setData1(name: String) {
        this.interAnnoNum = interAnnoNum
    }

    fun getData2(): String? {
        return interAnnoTitle
    }

    fun setData2(address: String) {
        this.interAnnoTitle = interAnnoTitle
    }

}

class MemberInterAnnopageFragment : Fragment() {

    var interAnnoList: ArrayList<InterAnnoData> = arrayListOf(
        InterAnnoData("9", "글자 크기 14인 TextView의 길이가 어느정도인지 테스트하는 중 입니다."),
        InterAnnoData("8", "관심사업 제목8"),
        InterAnnoData("7", "관심사업 제목7"),
        InterAnnoData("6", "관심사업 제목6"),
        InterAnnoData("5", "관심사업 제목5"),
        InterAnnoData("4", "관심사업 제목4"),
        InterAnnoData("3", "관심사업 제목3"),
        InterAnnoData("2", "관심사업 제목2"),
        InterAnnoData("1", "관심사업 제목1")
    )

    private lateinit var interAnnoListAdapter: InterAnnoPageAdapter
    private var interAnnoListView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = inflater.inflate(R.layout.fragment_member_interanno_page, container, false)
        interAnnoListView = root.findViewById(R.id.interAnnoRecycler)

        // 키보드 내리기
        var imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (root.findViewById<ConstraintLayout>(R.id.interanno_layout)).setOnClickListener {
            imm.hideSoftInputFromWindow(root?.getWindowToken(), 0)
        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        interAnnoListAdapter = InterAnnoPageAdapter(interAnnoList)
        interAnnoListView?.adapter = interAnnoListAdapter
    }
}