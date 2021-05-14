package com.example.idleProject.ui.notice_cs_page

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.idleProject.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class NoticeCsPageFragment : Fragment() {

    private lateinit var viewPager2: ViewPager2

    // drawer에서 선택한 페이지
    var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            it.getInt(
                "index"
            )
            index = it.getInt("index")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_notice_cs_page, container, false)

        // 2. 초기화 지연시킨 viewPager2 객체를 여기서 초기화함
        viewPager2 = root.findViewById(R.id.viewPager2_notice_cs)

        // 3. viewPager2 뷰 객체에 어댑터 적용하기
        viewPager2.adapter = NoticeCsViewPageAdapter(this)

        // 타이틀 이름
        val noticeCsTitle: TextView = root.findViewById(R.id.notice_cs_title)

        val tabs: TabLayout = root.findViewById(R.id.tabs_notice_cs)
        TabLayoutMediator(tabs, viewPager2) { tab, position ->
            tab.customView =
                LayoutInflater.from(context).inflate(R.layout.tab_layout, null) as TextView
            run {

                //선택한 항목으로 타이틀 이름 변경 및 선택한 항목으로 이동
                viewPager2.setCurrentItem(index)
                when (index) {
                    0 -> noticeCsTitle.setText("공지사항")

                    1 -> noticeCsTitle.setText("문의게시판");
                }

                // 선택한 항목의 탭 색 변경
                when (index) {
                    /*
                    * index=0 공지사항, index=1 문의게시판 (선택되었을 경우만 값 정해짐)
                    * position=0 공지사항, position=1 문의게시판 (정해져있는 값)`
                    * white가 선택된 값, 동시변경을 위해서 이렇게 작성
                    * */
                    0 ->
                        if (position == 0) {
                            (tab.customView as TextView).text = "공지사항"
                            (tab.customView as TextView).setTextColor(Color.WHITE)
                        } else if (position == 1) {
                            (tab.customView as TextView).text = "문의게시판"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        }
                    1 ->
                        if (position == 0) {
                            (tab.customView as TextView).text = "공지사항"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        } else if (position == 1) {
                            (tab.customView as TextView).text = "문의게시판"
                            (tab.customView as TextView).setTextColor(Color.WHITE)
                        }
                }
            }
        }.attach()

        // 탭 이동시 색 변경
        tabs.addOnTabSelectedListener(
            object : TabLayout.OnTabSelectedListener {
                override fun onTabReselected(p0: TabLayout.Tab?) {
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    if (tab?.customView is TextView) {
                        (tab.customView as TextView).setTextColor(Color.BLACK)
                    }
                }

                override fun onTabSelected(tab: TabLayout.Tab) {
                    if (tab?.customView is TextView) {
                        (tab.customView as TextView).setTextColor(Color.WHITE)
                        when ((tab.customView as TextView).text) {
                            "공지사항" -> noticeCsTitle.setText("공지사항")
                            "문의게시판" -> noticeCsTitle.setText("문의게시판")
                        }
                    }
                }
            }
          )


        // 키보드 내리기
        var imm: InputMethodManager =
            context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (root.findViewById<ConstraintLayout>(R.id.notice_cs_header)).setOnClickListener {
            imm.hideSoftInputFromWindow(root?.getWindowToken(), 0)
        }


        return root
    }
}