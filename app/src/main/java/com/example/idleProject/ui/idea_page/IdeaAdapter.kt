package com.example.idleProject.ui.idea_page

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

// 리스트 데이터를 넘겨받아야 한다.
class IdeaAdapter (private var list: MutableList<IdeaData>): RecyclerView.Adapter<IdeaAdapter.ListItemViewHolder> () {

    // inner class로 ViewHolder 정의
    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!) {

        var ideaTitle: TextView = itemView!!.findViewById(R.id.idea_title)
        var ideaDate: TextView = itemView!!.findViewById(R.id.idea_date)

        // onBindViewHolder의 역할을 대신한다.
        fun bind(data: IdeaData, position: Int) {
            ideaTitle.text = data.getData1()
            ideaDate.text = data.getData2()
        }
    }

    // ViewHolder에게 item을 보여줄 View로 쓰일 item_data_list.xml를 넘기면서 ViewHolder 생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_idea, parent, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    // ViewHolder의 bind 메소드를 호출한다.
    override fun onBindViewHolder(holder: IdeaAdapter.ListItemViewHolder, position: Int) {
        holder.bind(list[position], position)
    }

}