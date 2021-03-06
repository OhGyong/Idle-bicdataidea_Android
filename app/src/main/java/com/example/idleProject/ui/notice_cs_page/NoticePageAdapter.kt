package com.example.idleProject.ui.notice_cs_page

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class NoticePageAdapter(private var list: MutableList<NoticeData>): RecyclerView.Adapter<NoticePageAdapter.ListItemViewHolder> () {

    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!){

        var noticeNum: TextView = itemView!!.findViewById(R.id.notice_num)
        var noticeTitle: TextView = itemView!!.findViewById(R.id.notice_title)

        fun bind(data: NoticeData, position: Int){
            noticeNum.text = data.getData1()
            noticeTitle.text = data.getData2()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_notice, parent, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(list[position], position)
    }
}