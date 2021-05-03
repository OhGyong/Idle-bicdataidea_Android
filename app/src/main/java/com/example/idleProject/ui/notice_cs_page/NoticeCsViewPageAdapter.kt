package com.example.idleProject.ui.notice_cs_page

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class NoticeCsViewPageAdapter(fragmentActivity: NoticeCsPageFragment) :
    FragmentStateAdapter(fragmentActivity) {
    companion object {
        // 페이지 개수를 정적 변수로 선언
        private const val NUM_PAGES = 2
    }

    override fun getItemCount(): Int {
        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            return NoticePageFragment()
        } else {
            return CsPageFragment()
        }
    }
}