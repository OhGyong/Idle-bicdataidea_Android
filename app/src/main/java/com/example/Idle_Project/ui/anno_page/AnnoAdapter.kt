package com.example.Idle_Project.ui.anno_page

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Idle_Project.R

class AnnoAdapter(private var list: MutableList<AnnoData>): RecyclerView.Adapter<AnnoAdapter.ListItemViewHolder> () {

    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!){

        var anno_num: TextView = itemView!!.findViewById(R.id.anno_num)
        var anno_title: TextView = itemView!!.findViewById(R.id.anno_title)

        fun bind(data: AnnoData, position: Int){
            anno_num.text=data.getData1()
            anno_title.text=data.getData2()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_anno, parent, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(list[position], position)
    }
}