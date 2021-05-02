package com.example.idleProject.ui.mypage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class MyIdeaPageAdapter(private var list: MutableList<MyIdeaData>): RecyclerView.Adapter<MyIdeaPageAdapter.ListItemViewHolder> () {

    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!){

        var myIdeaTitle: TextView = itemView!!.findViewById(R.id.myIdeaTitle)
        var myIdeaDate: TextView = itemView!!.findViewById(R.id.myIdeaDate)

        fun bind(data: MyIdeaData, position: Int){
            myIdeaTitle.text = data.getData1()
            myIdeaDate.text = data.getData2()
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