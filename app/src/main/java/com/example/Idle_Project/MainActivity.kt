package com.example.Idle_Project

import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    //private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 상단 toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        /*
        * 각 페이지 fragment 띄우기
        * */
        // 홈 화면
        val navHome: TextView = findViewById(R.id.nav_home)
        navHome.setOnClickListener {
            // nav_host_fragment -> layout/content_main.xml 파일(메인에 프래그먼트 띄우는 부분)
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home, Bundle().apply {
            })
            drawer.closeDrawer(navView) // drawer 에서 항목 클릭 시 닫게 만들기
        }
        // 아이디어 플랫폼 화면
        val navIdea_board: TextView = findViewById(R.id.nav_idea_board)
        navIdea_board.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_idea_board, Bundle().apply {
            })
            drawer.closeDrawer(navView)
        }
        // 공고정보 게시판 화면
        val navAnno_board: TextView = findViewById(R.id.nav_anno_board)
        navAnno_board.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_anno_board, Bundle().apply {
            })
            drawer.closeDrawer(navView)
        }
        // 공지사항 화면1 (게시판 버튼)
        val navNotice_board1: TextView = findViewById(R.id.nav_notice_board1)
        navNotice_board1.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_notice_board, Bundle().apply {
            })
            drawer.closeDrawer(navView)
        }
        // 공지사항 화면2 (공지사항 버튼)
        val navNotice_board2: TextView = findViewById(R.id.nav_notice_board2)
        navNotice_board2.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_notice_board, Bundle().apply {
            })
            drawer.closeDrawer(navView)
        }
        // 문의게시판 화면
        val navCs_board: TextView = findViewById(R.id.nav_cs_board)
        navCs_board.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_cs_board, Bundle().apply {
            })
            drawer.closeDrawer(navView)
        }


    }
}