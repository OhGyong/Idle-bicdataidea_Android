package com.example.Idle_Project.ui.notice_cs_page

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import com.example.Idle_Project.R
import com.example.Idle_Project.ui.notice_cs_page.view.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Notice_Cs_Page_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Notice_Cs_Page_Fragment : Fragment() {

    var index = 0
//    var cs_title: TextView =

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            it.getInt(
                "index"
            )
            index=it.getInt("index")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_notice_cs_view, container, false)

        val fragmentManager = (activity as FragmentActivity).supportFragmentManager
        val sectionsPagerAdapter = SectionsPagerAdapter(requireContext(), fragmentManager)

        val viewPager: ViewPager = root.findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter

        val tabs: TabLayout = root.findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)


        // tab button에 customview 세팅
        for (i in 0 until tabs.tabCount) {
            val view_tabs = sectionsPagerAdapter.getTabView(i)

            // index=0 공지사항이 눌린 경우, index=1 문의게시판이 눌린 경우
            if(i == 0 && index == 0){
                view_tabs.setBackgroundColor(0xFF8345F1.toInt())
                (view_tabs as TextView).setTextColor(Color.WHITE)
            }else if(i == 0 && index == 1){
                view_tabs.setBackgroundColor(0xFFECEAEA.toInt())
                (view_tabs as TextView).setTextColor(Color.BLACK)

            }
            else if(i == 1 && index == 0){
                view_tabs.setBackgroundColor(0xFFECEAEA.toInt())
                (view_tabs as TextView).setTextColor(Color.BLACK)
            }else if( i == 1 && index == 1){
                view_tabs.setBackgroundColor(0xFF8345F1.toInt())
                (view_tabs as TextView).setTextColor(Color.WHITE)
            }
            tabs.getTabAt(i)?.customView = view_tabs
        }

        // tab select시 select된 버튼의 색상을 바꿔주는 리스너
        tabs.addOnTabSelectedListener(
            object : TabLayout.OnTabSelectedListener {
                override fun onTabReselected(p0: TabLayout.Tab?) {
                }
                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    if (tab?.customView is TextView) {
//                        tab?.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                        tab.customView?.setBackgroundColor(0xFFECEAEA.toInt())
                        (tab.customView as TextView).setTextColor(Color.BLACK)
                    }
                }
                override fun onTabSelected(tab: TabLayout.Tab) {
                    if (tab.customView is TextView) {
                        //(tab.customView as TextView).background = ColorDrawable(Color.RED)
                        tab.customView?.setBackgroundColor(0xFF8345F1.toInt())
                        (tab.customView as TextView).setTextColor(Color.WHITE)
                    }
                }
            })
        return root
    }
}