package com.example.idleProject.ui.idea_page

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


class RankData(
    private var memberRank: String? = null,
    private var memberName: String? = null,
    private var savePoint: String? = null
) {
    fun getData1(): String? {
        return memberRank
    }

    fun setData1(name: String) {
        this.memberRank = memberRank
    }

    fun getData2(): String? {
        return memberName
    }

    fun setData2(address: String) {
        this.memberName = memberName
    }

    fun getData3(): String? {
        return savePoint
    }

    fun setData3(type: String) {
        this.savePoint = savePoint
    }
}

class IdeaData(
    private var ideaTitle: String? = null,
    private var ideaDate: String? = null
) {
    fun getData1(): String? {
        return ideaTitle
    }

    fun setData1(name: String) {
        this.ideaTitle = ideaTitle
    }

    fun getData2(): String? {
        return ideaDate
    }

    fun setData2(address: String) {
        this.ideaDate = ideaDate
    }
}

class IdeaPageFragment : Fragment() {

    var rankList: ArrayList<RankData> = arrayListOf(
        RankData("1", "오기용", "91,500P"),
        RankData("2", "김영조", "59,000P"),
        RankData("3", "배산하", "38,500P"),
        RankData("4", "김진호", "12,500P"),
        RankData("5", "김호연", "8,000P"),
        RankData("6", "서서울", "8,000P"),
        RankData("7", "임유빈", "8,000P"),
        RankData("8", "이상혁", "8,000P"),
        RankData("9", "송태진", "8,000P"),
        RankData("10", "박도현", "8,000P")
    )

    var ideaList: ArrayList<IdeaData> = arrayListOf(
        IdeaData("아이디어 제안 1asdasdasdasdasdasdasdasdasdasdasdsadasdasd", "2021-04-27"),
        IdeaData("아이디어 제안 2", "2021-04-27"),
        IdeaData("아이디어 제안 3", "2021-04-28"),
        IdeaData("아이디어 제안 4", "2021-04-28"),
        IdeaData("아이디어 제안 5", "2021-04-28"),
        IdeaData("아이디어 제안 6", "2021-04-28"),
        IdeaData("아이디어 제안 7", "2021-04-29"),
        IdeaData("아이디어 제안 8", "2021-04-29"),
        IdeaData("아이디어 제안 9", "2021-04-29")
    )

    // RecyclerView.adapter에 지정할 Adapter
    private lateinit var rankListAdapter: RankAdapter
    private var rankListView: RecyclerView? = null;

    private lateinit var ideaListAdapter: IdeaAdapter
    private var ideaListView: RecyclerView? = null;


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_idea_page, container, false)
        rankListView=root.findViewById(R.id.rank_recycler)
        ideaListView=root.findViewById(R.id.ideaRecyler)

        // 아이디어 등록버튼 눌렀을 때 처리, 아이디어 등록 페이지로 이동
        val ideaRegistBt: Button = root.findViewById<Button>(R.id.ideaRegistPageBt)
        ideaRegistBt.setOnClickListener {
            findNavController().navigate(R.id.nav_idea_regist_page)
        }

        // 키보드 내리기
        var imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (root.findViewById<ConstraintLayout>(R.id.idea_page_layout)).setOnClickListener {
            imm.hideSoftInputFromWindow(view?.getWindowToken(), 0)
        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Fragment에서 전달받은 list를 넘기면서 ListAdapter 생성
        rankListAdapter = RankAdapter(rankList)
        ideaListAdapter = IdeaAdapter(ideaList)
        // RecyclerView.adapter에 지정
        rankListView?.adapter = rankListAdapter
        ideaListView?.adapter = ideaListAdapter
    }
}
