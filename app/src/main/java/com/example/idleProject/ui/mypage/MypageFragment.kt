package com.example.idleProject.ui.mypage

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

class MypageFragment : Fragment() {

    // 1. activity_main.xml 에 존재하는 viewPager2 뷰 객체 초기화를 액티비티 lifecycle에 맞게 지연시킴
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
        val root = inflater.inflate(R.layout.fragment_mypage, container, false)

        // 2. 초기화 지연시킨 viewPager2 객체를 여기서 초기화함
        viewPager2 = root.findViewById(R.id.viewPager2_mypage)

        // 3. viewPager2 뷰 객체에 어댑터 적용하기
        viewPager2.adapter = MypageViewPageAdapter(this)

        // 타이틀 이름
        val myPageTitleName: TextView = root.findViewById(R.id.mypage_title_name)

        val tabs: TabLayout = root.findViewById(R.id.tabs_mypage)
        TabLayoutMediator(tabs, viewPager2) { tab, position ->
            tab.customView =
                LayoutInflater.from(context).inflate(R.layout.tab_layout, null) as TextView
            run {

                //선택한 항목으로 타이틀 이름 변경 및 선택한 항목으로 이동
                viewPager2.setCurrentItem(index)
                when(index){
                    1-> myPageTitleName.setText("포인트현황")
                    2-> myPageTitleName.setText("내아이디어")
                    3-> myPageTitleName.setText("관심사업")
                    else-> myPageTitleName.setText("회원정보수정")

                }
                // 선택한 항목의 탭 색 변경
                when (index) {
                    1 ->
                        if (position == 0) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "회원정보수정"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        } else if (position == 1) {
                            tab.customView?.setBackgroundColor(0xFF8345F1.toInt())
                            (tab.customView as TextView).text = "포인트현황"
                            (tab.customView as TextView).setTextColor(Color.WHITE)
                        } else if (position == 2) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "내아이디어"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        } else if (position == 3) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "관심사업"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        }

                    2 ->
                        if (position == 0) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "회원정보수정"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        } else if (position == 1) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "포인트현황"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        } else if (position == 2) {
                            tab.customView?.setBackgroundColor(0xFF8345F1.toInt())
                            (tab.customView as TextView).text = "내아이디어"
                            (tab.customView as TextView).setTextColor(Color.WHITE)
                        } else if (position == 3) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "관심사업"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        }

                    3 ->
                        if (position == 0) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "회원정보수정"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        } else if (position == 1) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "포인트현황"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        } else if (position == 2) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "내아이디어"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        } else if (position == 3) {
                            tab.customView?.setBackgroundColor(0xFF8345F1.toInt())
                            (tab.customView as TextView).text = "관심사업"
                            (tab.customView as TextView).setTextColor(Color.WHITE)
                        }

                    else ->
                        if (position == 0) {
                            tab.customView?.setBackgroundColor(0xFF8345F1.toInt())
                            (tab.customView as TextView).text = "회원정보수정"
                            (tab.customView as TextView).setTextColor(Color.WHITE)
                        } else if (position == 1) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "포인트현황"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        } else if (position == 2) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "내아이디어"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        } else if (position == 3) {
                            tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                            (tab.customView as TextView).text = "관심사업"
                            (tab.customView as TextView).setTextColor(Color.BLACK)
                        }
                }
            }
        }.attach()

        tabs.addOnTabSelectedListener(
            object : TabLayout.OnTabSelectedListener {
                override fun onTabReselected(p0: TabLayout.Tab?) {
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    if (tab?.customView is TextView) {
                        tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                        (tab.customView as TextView).setTextColor(Color.BLACK)
                    }
                }

                override fun onTabSelected(tab: TabLayout.Tab) {
                    if (tab?.customView is TextView) {
                        tab.customView?.setBackgroundColor(0xFF8345F1.toInt())
                        (tab.customView as TextView).setTextColor(Color.WHITE)
                        when((tab.customView as TextView).text){
                            "회원정보수정"->myPageTitleName.setText("회원정보수정")
                            "포인트현황"->myPageTitleName.setText("포인트현황")
                            "내아이디어"->myPageTitleName.setText("내아이디어")
                            "관심사업"->myPageTitleName.setText("관심사업")
                        }
                    }
                }
            })

        // 키보드 내리기
        var imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (root.findViewById<ConstraintLayout>(R.id.mypage_header)).setOnClickListener {
            imm.hideSoftInputFromWindow(root?.getWindowToken(), 0)
        }

        return root
    }
}