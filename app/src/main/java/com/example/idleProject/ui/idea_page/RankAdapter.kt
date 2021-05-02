package com.example.idleProject.ui.idea_page

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

// 리스트 데이터를 넘겨받아야 한다.
class RankAdapter (private var list: MutableList<RankData>): RecyclerView.Adapter<RankAdapter.ListItemViewHolder> () {

    // inner class로 ViewHolder 정의
    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!) {

        var memberRank: TextView = itemView!!.findViewById(R.id.member_rank)
        var memberName: TextView = itemView!!.findViewById(R.id.member_rank_name)
        var savePoint: TextView = itemView!!.findViewById(R.id.member_save_point)

        // onBindViewHolder의 역할을 대신한다.
        fun bind(data: RankData, position: Int) {
            memberRank.text = data.getData1()
            memberName.text = data.getData2()
            savePoint.text = data.getData3()
        }
    }

    // ViewHolder에게 item을 보여줄 View로 쓰일 item_data_list.xml를 넘기면서 ViewHolder 생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_rank, parent, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    // ViewHolder의 bind 메소드를 호출한다.
    override fun onBindViewHolder(holder: RankAdapter.ListItemViewHolder, position: Int) {
        holder.bind(list[position], position)
    }

}