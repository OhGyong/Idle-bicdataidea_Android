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
        for (i in 0..tabs.tabCount) {
            tabs.getTabAt(i)?.customView = sectionsPagerAdapter.getTabView(i)
        }

        // tab select시 select된 버튼의 색상을 바꿔주는 리스너
        tabs.addOnTabSelectedListener(
            object : TabLayout.OnTabSelectedListener {
                override fun onTabReselected(p0: TabLayout.Tab?) {
                }
                override fun onTabUnselected(tab: TabLayout.Tab?) {
                    if (tab?.customView is TextView) {
                        (tab.customView as TextView).background = ColorDrawable(Color.BLACK)
                    }
                }
                override fun onTabSelected(tab: TabLayout.Tab) {
                    if (tab.customView is TextView) {
                        (tab.customView as TextView).background = ColorDrawable(Color.RED)
                    }
                }
            })
        return root
    }
}