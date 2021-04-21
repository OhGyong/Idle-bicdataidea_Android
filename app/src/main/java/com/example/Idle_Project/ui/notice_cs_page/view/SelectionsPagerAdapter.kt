package com.example.Idle_Project.ui.notice_cs_page.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.Idle_Project.R
import com.example.Idle_Project.ui.notice_cs_page.Notice_Cs_Page_Fragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }

    // PagerAdapter에서 선언되어서
    // tab button에 동일한 customview를 반환해주는 함수
    fun getTabView(position: Int): View {
        val v: TextView = LayoutInflater.from(context).inflate(R.layout.tab_layout, null) as TextView
        v.text = getPageTitle(position)
        print((position))
        return v
    }
}