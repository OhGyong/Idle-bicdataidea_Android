package com.example.idleProject.ui.notice_cs_page

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class CsPageAdapter(private var list: MutableList<CsData>): RecyclerView.Adapter<CsPageAdapter.ListItemViewHolder> () {

    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!){

        var csNum: TextView = itemView!!.findViewById(R.id.cs_num)
        var csTitle: TextView = itemView!!.findViewById(R.id.cs_title)

        fun bind(data: CsData, position: Int){
            csNum.text=data.getData1()
            csTitle.text=data.getData2()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_cs, parent, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(list[position], position)
    }
}