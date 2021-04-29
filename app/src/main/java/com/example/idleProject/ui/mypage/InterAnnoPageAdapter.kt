package com.example.idleProject.ui.mypage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class InterAnnoPageAdapter(private var list: MutableList<InterAnnoData>): RecyclerView.Adapter<InterAnnoPageAdapter.ListItemViewHolder> () {

    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!){

        var interAnnoNum: TextView = itemView!!.findViewById(R.id.interAnnoNum)
        var interAnnoTitle: TextView = itemView!!.findViewById(R.id.interAnnoTitle)
        var interAnnoDate: TextView = itemView!!.findViewById(R.id.interAnnoDate)

        fun bind(data: InterAnnoData, position: Int){
            interAnnoNum.text = data.getData1()
            interAnnoTitle.text = data.getData2()
            interAnnoDate.text = data.getData3()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_interanno, parent, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(list[position], position)
    }
}