package com.example.idleProject.ui.mypage

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class SavePointAdapter (private var list: MutableList<SavePointData>): RecyclerView.Adapter<SavePointAdapter.ListItemViewHolder> () {

    // inner class로 ViewHolder 정의
    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!) {

        var savePointContents: TextView = itemView!!.findViewById(R.id.save_point_contents)
        var savePoint: TextView = itemView!!.findViewById(R.id.save_point)
        var savePointDate: TextView = itemView!!.findViewById(R.id.save_point_date)

        // onBindViewHolder의 역할을 대신한다.
        fun bind(data: SavePointData, position: Int) {
            savePointContents.text = data.getData1()
            savePoint.text = data.getData2()
            savePointDate.text = data.getData3()
        }
    }

    // ViewHolder에게 item을 보여줄 View로 쓰일 item_data_list.xml를 넘기면서 ViewHolder 생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_my_save_point, parent, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    // ViewHolder의 bind 메소드를 호출한다.
    override fun onBindViewHolder(holder: SavePointAdapter.ListItemViewHolder, position: Int) {
        holder.bind(list[position], position)
    }

}