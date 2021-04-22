package com.example.Idle_Project.ui.mypage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class Mypage_ViewPageAdapter(fragmentActivity: Mypage_Fragment) :
    FragmentStateAdapter(fragmentActivity) {
    companion object {
        // 페이지 개수를 정적 변수로 선언
        private const val NUM_PAGES = 4
    }

    override fun getItemCount(): Int {
        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            return Member_Update_Page_Fragment()
        } else if (position == 1) {
            return Member_Point_Page_Fragment()
        } else if (position == 2) {
            return Member_Myidea_Page_Fragment()
        } else {
            return Member_Interanno_page_Fragment()
        }
    }
}