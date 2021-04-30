package com.example.idleProject.ui.mypage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        InterAnnoData("9", "관심사업 제목9"),
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
        val view: View = inflater.inflate(R.layout.fragment_member_interanno_page, container, false)
        interAnnoListView = view.findViewById(R.id.interAnnoRecycler)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        interAnnoListAdapter = InterAnnoPageAdapter(interAnnoList)
        interAnnoListView?.adapter = interAnnoListAdapter
    }
}