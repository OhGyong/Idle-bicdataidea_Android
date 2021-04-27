package com.example.Idle_Project.ui.mypage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Idle_Project.R

class MyIdeaPageAdapter(private var list: MutableList<MyIdeaData>): RecyclerView.Adapter<MyIdeaPageAdapter.ListItemViewHolder> () {

    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!){

        var myidea_title: TextView = itemView!!.findViewById(R.id.myidea_title)
        var myidea_date: TextView = itemView!!.findViewById(R.id.myidea_date)

        fun bind(data: MyIdeaData, position: Int){
            myidea_title.text = data.getData1()
            myidea_date.text = data.getData2()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_myidea, parent, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.bind(list[position], position)
    }
}