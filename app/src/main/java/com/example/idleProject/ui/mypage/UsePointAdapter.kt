package com.example.idleProject.ui.mypage

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class UsePointAdapter (private var list: MutableList<UsePointData>): RecyclerView.Adapter<UsePointAdapter.ListItemViewHolder> () {

    // inner class로 ViewHolder 정의
    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!) {

        var usePointContents: TextView = itemView!!.findViewById(R.id.use_point_contents)
        var usePoint: TextView = itemView!!.findViewById(R.id.use_point)
        var usePointDate: TextView = itemView!!.findViewById(R.id.use_point_date)

        // onBindViewHolder의 역할을 대신한다.
        fun bind(data: UsePointData, position: Int) {
            Log.d("ListAdapter", "===== ===== ===== ===== bind ===== ===== ===== =====")
            Log.d("ListAdapter", data.getData1()+" "+data.getData2()+" "+data.getData3())
            usePointContents.text = data.getData1()
            usePoint.text = data.getData2()
            usePointDate.text = data.getData3()
        }
    }

    // ViewHolder에게 item을 보여줄 View로 쓰일 item_data_list.xml를 넘기면서 ViewHolder 생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_my_use_point, parent, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    // ViewHolder의 bind 메소드를 호출한다.
    override fun onBindViewHolder(holder: UsePointAdapter.ListItemViewHolder, position: Int) {
        Log.d("ListAdapter", "===== ===== ===== ===== onBindViewHolder ===== ===== ===== =====")
        holder.bind(list[position], position)
    }

}