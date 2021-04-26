package com.example.Idle_Project.ui.idea_page

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Idle_Project.R

// 리스트 데이터를 넘겨받아야 한다.
class Rank_Adapter (private var list: MutableList<TestData>): RecyclerView.Adapter<Rank_Adapter.ListItemViewHolder> () {

    // inner class로 ViewHolder 정의
    inner class ListItemViewHolder(itemView: View?): RecyclerView.ViewHolder(itemView!!) {

        var data1Text: TextView = itemView!!.findViewById(R.id.data1Text)
        var data2Text: TextView = itemView!!.findViewById(R.id.data2Text)
        var data3Text: TextView = itemView!!.findViewById(R.id.data3Text)

        // onBindViewHolder의 역할을 대신한다.
        fun bind(data: TestData, position: Int) {
            Log.d("ListAdapter", "===== ===== ===== ===== bind ===== ===== ===== =====")
            Log.d("ListAdapter", data.getData1()+" "+data.getData2()+" "+data.getData3())
            data1Text.text = data.getData1()
            data2Text.text = data.getData2()
            data3Text.text = data.getData3()
        }
    }

    // ViewHolder에게 item을 보여줄 View로 쓰일 item_data_list.xml를 넘기면서 ViewHolder 생성
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_rank_data, parent, false)
        return ListItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    // ViewHolder의 bind 메소드를 호출한다.
    override fun onBindViewHolder(holder: Rank_Adapter.ListItemViewHolder, position: Int) {
        Log.d("ListAdapter", "===== ===== ===== ===== onBindViewHolder ===== ===== ===== =====")
        holder.bind(list[position], position)
    }

}