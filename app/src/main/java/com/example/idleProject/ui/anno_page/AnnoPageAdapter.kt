package com.example.idleProject.ui.anno_page

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class AnnoPageAdapter(private var list: MutableList<AnnoData>): RecyclerView.Adapter<AnnoPageAdapter.ListItemViewHolder> () {

    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!){

        var annoNum: TextView = itemView!!.findViewById(R.id.anno_num)
        var annoTitle: TextView = itemView!!.findViewById(R.id.anno_title)

        fun bind(data: AnnoData, position: Int){
            annoNum.text=data.getData1()
            annoTitle.text=data.getData2()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.recycler_anno, parent, false)
        return ListItemViewHolder(root)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(list[position], position)
    }
}