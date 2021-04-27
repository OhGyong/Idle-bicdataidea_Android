package com.example.Idle_Project.ui.idea_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.Idle_Project.R


class RankData(
    private var member_rank: String? = null,
    private var member_name: String? = null,
    private var save_point: String? = null
) {
    fun getData1(): String? {
        return member_rank
    }

    fun setData1(name: String) {
        this.member_rank = member_rank
    }

    fun getData2(): String? {
        return member_name
    }

    fun setData2(address: String) {
        this.member_name = member_name
    }

    fun getData3(): String? {
        return save_point
    }

    fun setData3(type: String) {
        this.save_point = save_point
    }
}

class IdeaData(
    private var idea_title: String? = null,
    private var idea_date: String? = null
) {
    fun getData1(): String? {
        return idea_title
    }

    fun setData1(name: String) {
        this.idea_title = idea_title
    }

    fun getData2(): String? {
        return idea_date
    }

    fun setData2(address: String) {
        this.idea_date = idea_date
    }
}

class IdeaPageFragment : Fragment() {

    var rankList: ArrayList<RankData> = arrayListOf(
        RankData("  1", "오기용", "91,500P"),
        RankData("  2", "김영조", "59,000P"),
        RankData("  3", "배산하", "38,500P"),
        RankData("  4", "김진호", "12,500P"),
        RankData("  5", "김호연", "8,000P"),
        RankData("  6", "서서울", "8,000P"),
        RankData("  7", "임유빈", "8,000P"),
        RankData("  8", "이상혁", "8,000P"),
        RankData("  9", "송태진", "8,000P"),
        RankData("10", "박도현", "8,000P")
    )

    var ideaList: ArrayList<IdeaData> = arrayListOf(
        IdeaData("아이디어 제안 1", "2021-04-27"),
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
        ideaListView=root.findViewById(R.id.idea_recycler)

        // 아이디어 등록버튼 눌렀을 때 처리, 아이디어 등록 페이지로 이동
        val idea_regist_bt: Button = root.findViewById<Button>(R.id.idea_regist_bt)
        idea_regist_bt.setOnClickListener {
            findNavController().navigate(R.id.nav_idea_regist_page)
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
