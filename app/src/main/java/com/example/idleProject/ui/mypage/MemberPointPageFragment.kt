package com.example.idleProject.ui.mypage

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.idleProject.R

class UsePointData(
    private var usePointContents: String? = null,
    private var usePoint: String? = null,
    private var usePointDate: String? = null
) {
    fun getData1(): String? {
        return usePointContents
    }

    fun setData1(name: String) {
        this.usePointContents = usePointContents
    }

    fun getData2(): String? {
        return usePoint
    }

    fun setData2(address: String) {
        this.usePoint = usePoint
    }

    fun getData3(): String? {
        return usePointDate
    }

    fun setData3(type: String) {
        this.usePointDate = usePointDate
    }
}

class SavePointData(
    private var savePointContents: String? = null,
    private var savePoint: String? = null,
    private var savePointDate: String? = null
) {
    fun getData1(): String? {
        return savePointContents
    }

    fun setData1(name: String) {
        this.savePointContents = savePointContents
    }

    fun getData2(): String? {
        return savePoint
    }

    fun setData2(address: String) {
        this.savePoint = savePoint
    }

    fun getData3(): String? {
        return savePointDate
    }

    fun setData3(type: String) {
        this.savePointDate = savePointDate
    }
}

class MemberPointPageFragment : Fragment() {

    var usePointList: ArrayList<UsePointData> = arrayListOf(
        UsePointData("상품권 교환9", "1000", "2021-04-29"),
        UsePointData("상품권 교환8", "5000", "2021-04-29"),
        UsePointData("상품권 교환7", "10000", "2021-04-29"),
        UsePointData("상품권 교환6", "1000", "2021-04-28"),
        UsePointData("상품권 교환5", "1000", "2021-04-28"),
        UsePointData("상품권 교환4", "5000", "2021-04-28"),
        UsePointData("상품권 교환3", "3000", "2021-04-27"),
        UsePointData("상품권 교환2", "4000", "2021-04-27"),
        UsePointData("상품권 교환1", "6000", "2021-04-27")
    )

    var savePointList: ArrayList<SavePointData> = arrayListOf(
        SavePointData("아이디어 등록9", "1000", "2021-04-29"),
        SavePointData("아이디어 등록8", "1000", "2021-04-29"),
        SavePointData("아이디어 등록7", "1000", "2021-04-29"),
        SavePointData("아이디어 등록6", "1000", "2021-04-28"),
        SavePointData("아이디어 등록5", "1000", "2021-04-28"),
        SavePointData("아이디어 등록4", "1000", "2021-04-28"),
        SavePointData("아이디어 등록3", "1000", "2021-04-27"),
        SavePointData("아이디어 등록2", "1000", "2021-04-27"),
        SavePointData("아이디어 등록1", "1000", "2021-04-27")
    )

    private lateinit var usePointListAdapter: UsePointAdapter
    private var usePointListView: RecyclerView? = null;

    private lateinit var savePointListAdapter: SavePointAdapter
    private var savePointListView: RecyclerView? = null;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_member_point_page, container, false)

        // 리스트를 어댑터와 연결
        usePointListView=view.findViewById(R.id.use_point_recycler)
        savePointListView=view.findViewById(R.id.save_point_recycler)

        // 처음 들어갈때 사용내역과 적립내역 안보이도록 설정
        val mypoint_state_layout: ConstraintLayout = view.findViewById(R.id.mypoint_state_layout)
        val usepointLayout: ConstraintLayout = view.findViewById(R.id.use_point_list_layout)
        val savepointLayout: ConstraintLayout = view.findViewById(R.id.save_point_list_layout)
        usepointLayout.visibility = View.GONE
        savepointLayout.visibility = View.GONE

        // 현황, 사용내역, 적립내역 버튼 변수 위젯에 연결
        val pointStateTextView:TextView = view.findViewById(R.id.textview_pointstate)
        val usePointListTextView:TextView = view.findViewById(R.id.textview_use_point_list)
        val savePointListTextView:TextView = view.findViewById(R.id.textview_save_point_list)

        // 현황 클릭 시, 현황만 보이도록 / 현황 검정색 나머지 옅은 회색
        pointStateTextView.setOnClickListener {
            mypoint_state_layout.visibility = View.VISIBLE
            usepointLayout.visibility = View.GONE
            savepointLayout.visibility = View.GONE

            pointStateTextView.setTextColor(Color.BLACK)
            usePointListTextView.setTextColor(0XFFDAD8D8.toInt())
            savePointListTextView.setTextColor(0XFFDAD8D8.toInt())
        }
        // 사용내역 클릭 시, 사용내역만 보이도록 / 사용내역 검정색 나머지 옅은 회색
        usePointListTextView.setOnClickListener {
            mypoint_state_layout.visibility = View.GONE
            usepointLayout.visibility = View.VISIBLE
            savepointLayout.visibility = View.GONE

            pointStateTextView.setTextColor(0XFFDAD8D8.toInt())
            usePointListTextView.setTextColor(Color.BLACK)
            savePointListTextView.setTextColor(0XFFDAD8D8.toInt())
        }
        // 적립내역 클릭 시, 적립내역만 보이도록 / 적립내역 검정색 나머지 옅은 회색
        savePointListTextView.setOnClickListener {
            mypoint_state_layout.visibility = View.GONE
            usepointLayout.visibility = View.GONE
            savepointLayout.visibility = View.VISIBLE

            pointStateTextView.setTextColor(0XFFDAD8D8.toInt())
            usePointListTextView.setTextColor(0XFFDAD8D8.toInt())
            savePointListTextView.setTextColor(Color.BLACK)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Fragment에서 전달받은 list를 넘기면서 ListAdapter 생성
        usePointListAdapter = UsePointAdapter(usePointList)
        savePointListAdapter = SavePointAdapter(savePointList)
        // RecyclerView.adapter에 지정
        usePointListView?.adapter = usePointListAdapter
        savePointListView?.adapter = savePointListAdapter
    }
}