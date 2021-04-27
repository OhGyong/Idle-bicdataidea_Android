package com.example.Idle_Project.ui.mypage

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MypageViewPageAdapter(fragmentActivity: MypageFragment) :
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
            return MemberUpdatePageFragment()
        } else if (position == 1) {
            return MemberPointPageFragment()
        } else if (position == 2) {
            return MemberMyideaPageFragment()
        } else {
            return MemberInterannopageFragment()
        }
    }
}