package com.example.Idle_Project.ui.idea_page

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
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

class Idea_Page_Fragment : Fragment() {

    var dataList: ArrayList<RankData> = arrayListOf(
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

    // RecyclerView.adapter에 지정할 Adapter
    private lateinit var listAdapter: Rank_Adapter
    private var listView: RecyclerView? = null;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_idea_page, container, false)
        listView=root.findViewById(R.id.rank_recycler)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Fragment에서 전달받은 list를 넘기면서 ListAdapter 생성
        listAdapter = Rank_Adapter(dataList)
        // RecyclerView.adapter에 지정
        listView?.adapter = listAdapter
    }

}
