package com.example.Idle_Project.ui.idea_page

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.Idle_Project.R

class RankFragment : Fragment() {

    // RecyclerView.adapter에 지정할 Adapter
    private lateinit var listAdapter: Rank_Adapter

    private var listView: RecyclerView? = null;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.recycler_rank, container, false)
        listView=root.findViewById(R.id.rank_recycler)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var list: ArrayList<TestData> = requireActivity().intent!!.extras!!.get("DataList") as ArrayList<TestData>
        Log.e("FirstFragment", "Data List: ${list}")

        // Fragment에서 전달받은 list를 넘기면서 ListAdapter 생성
        listAdapter = Rank_Adapter(list)
        listView?.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        // RecyclerView.adapter에 지정
        listView?.adapter = listAdapter
    }
}