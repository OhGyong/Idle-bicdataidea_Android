package com.example.Idle_Project

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.textclassifier.ConversationAction
import android.widget.*
import androidx.appcompat.app.ActionBar
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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class MainActivity : AppCompatActivity() {

    var STATUS: String = ""
    var LAST_STATUS: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val toolbar: Toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)

        val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        findNavController(R.id.nav_host_fragment).addOnDestinationChangedListener { controller, destination, arguments ->
            Log.e("dest", "${destination.id}")
            LAST_STATUS = destination.id
        }

        // 타이틀 홈 화면 이동
        val main1: TextView = findViewById(R.id.main1)
        main1.setOnClickListener {
            if (LAST_STATUS == 2131231033) {
            } else {
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home, Bundle().apply {
                })
                STATUS = "HOME"
            }
        }
        val main2: TextView = findViewById(R.id.main2)
        main2.setOnClickListener {
            if (LAST_STATUS == 2131231033) {
            } else {
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home, Bundle().apply {
                })
                STATUS = "HOME"
            }
        }
        val nav_view: NavigationView = findViewById(R.id.nav_view) // drawer 헤드 부분 불러와서 사용해야함
        val nav_header = nav_view.getHeaderView(0)
        nav_header.findViewById<LinearLayout>(R.id.nav_header).setOnClickListener {
            if (STATUS == "HOME" || LAST_STATUS == 2131231033) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "HOME"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home, Bundle().apply {
                })
                drawer.closeDrawer(navView)
            }
        }

        // nav_drawer 열기
        val nav_icon: ImageView = findViewById(R.id.nav_icon)
        nav_icon.setOnClickListener {
            drawer.openDrawer(navView)
        }

        /*
        * 각 페이지 fragment 띄우기
        * */
        // 홈 화면
        val navHome: TextView = findViewById(R.id.nav_home)
        navHome.setOnClickListener {
            // nav_host_fragment -> layout/content_main.xml 파일(메인에 프래그먼트 띄우는 부분)
            if (STATUS == "HOME" || LAST_STATUS == 2131231033) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "HOME"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home, Bundle().apply {
                })
                drawer.closeDrawer(navView)
            }
        }
        // 아이디어 플랫폼 화면
        val navIdea_page: TextView = findViewById(R.id.nav_idea_page)
        navIdea_page.setOnClickListener {
            if (STATUS == "IDEA" || LAST_STATUS == 2131231037) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "IDEA"
                findNavController(R.id.nav_host_fragment).navigate(
                    R.id.nav_idea_page,
                    Bundle().apply {
                    })
                drawer.closeDrawer(navView)
            }
        }
        // 공고정보 게시판 화면
        val navAnno_page: TextView = findViewById(R.id.nav_anno_page)
        navAnno_page.setOnClickListener {
            if (STATUS == "ANNO" || LAST_STATUS == 2131231028) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "ANNO"
                findNavController(R.id.nav_host_fragment).navigate(
                    R.id.nav_anno_page,
                    Bundle().apply {
                    })
                drawer.closeDrawer(navView)
            }
        }
        // 공지사항 화면1 (게시판 버튼)
        val navNotice_page1: TextView = findViewById(R.id.nav_notice_page1)
        navNotice_page1.setOnClickListener {
            if (STATUS == "NOTICE" || LAST_STATUS == 2131231046) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "NOTICE"
                findNavController(R.id.nav_host_fragment).navigate(
                    R.id.nav_notice_cs_view,
                    Bundle().apply {
                        this.putInt("index", 0)
                    })
                drawer.closeDrawer(navView)
            }
        }
        // 공지사항 화면2 (공지사항 버튼)
        val navNotice_page2: TextView = findViewById(R.id.nav_notice_page2)
        navNotice_page2.setOnClickListener {
            if (STATUS == "NOTICE" || LAST_STATUS == 2131231046) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "NOTICE"
                findNavController(R.id.nav_host_fragment).navigate(
                    R.id.nav_notice_cs_view,
                    Bundle().apply {
                        this.putInt("index", 0)
                    })
                drawer.closeDrawer(navView)
            }
        }
        // 문의게시판 화면
        val navCs_page: TextView = findViewById(R.id.nav_cs_page)
        navCs_page.setOnClickListener {
            if (STATUS == "CS" || LAST_STATUS == 2131231046) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "CS"
                findNavController(R.id.nav_host_fragment).navigate(
                    R.id.nav_notice_cs_view,
                    Bundle().apply {
                        this.putInt("index", 1)
                    })
                drawer.closeDrawer(navView)
            }
        }
        // 고객센터 화면
        val navContact_page: TextView = findViewById(R.id.nav_contact_page)
        navContact_page.setOnClickListener {
            if (STATUS == "CONTACT" || LAST_STATUS == 2131231029) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "CONTACT"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_contact_page)
                drawer.closeDrawer(navView)
            }
        }
        // 회원정보수정 화면1 (마이페이지 버튼)
        val nav_member_update_page1: TextView = findViewById(R.id.nav_member_update_page1)
        nav_member_update_page1.setOnClickListener {
            if (STATUS == "MEMBER_UPDATE") {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "MEMBER_UPDATE"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_mypage)
                drawer.closeDrawer(navView)
            }
        }
        // 회원정보수정 화면2 (회원정보수정 버튼)
        val nav_member_update_page2: TextView = findViewById(R.id.nav_member_update_page2)
        nav_member_update_page2.setOnClickListener {
            if (STATUS == "MEMBER_UPDATE") {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "MEMBER_UPDATE"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_mypage)
                drawer.closeDrawer(navView)
            }
        }
        // 포인트현황 화면
        val nav_member_point_page: TextView = findViewById(R.id.nav_member_point_page)
        nav_member_point_page.setOnClickListener {
            if (STATUS == "MEMBER_POINT") {
                drawer.closeDrawer(navView)
            } else {
                STATUS == "MEMBER_POINT"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_mypage)
                drawer.closeDrawer(navView)
            }
        }
        // 내 아이디어 화면
        val nav_member_idea_page: TextView = findViewById(R.id.nav_member_idea_page)
        nav_member_idea_page.setOnClickListener {
            if (STATUS == "MEMBER_IDEA") {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "MEMBER_IDEA"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_mypage)
                drawer.closeDrawer(navView)
            }
        }
        // 관심 사업 화면
        val nav_member_anno_page: TextView = findViewById(R.id.nav_member_anno_page)
        nav_member_anno_page.setOnClickListener {
            if (STATUS == "MEMBER_ANNO") {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "MEMBER_ANNO"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_mypage)
                drawer.closeDrawer(navView)
            }
        }
        // 로그인 화면
        val nav_login_page: TextView = findViewById(R.id.nav_login_page)
        nav_login_page.setOnClickListener {
            if (STATUS == "LOGIN" || LAST_STATUS == 2131231038) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "LOGIN"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_login_page)
                drawer.closeDrawer(navView)
            }
        }
        // 정보 화면(footer)
        val nav_about_page: TextView = findViewById(R.id.nav_about_page)
        nav_about_page.setOnClickListener {
            if (STATUS == "ABOUT" || LAST_STATUS == 2131231027) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "ABOUT"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_about_page)
                drawer.closeDrawer(navView)
            }
        }

        // 로그아웃 버튼
        val nav_logout_page: TextView = findViewById(R.id.nav_logout_page)
        nav_logout_page.setOnClickListener {
            findNavController(R.id.nav_host_fragment).navigate(R.id.nav_logout_page)
            drawer.closeDrawer(navView)
        }
    }

    override fun onBackPressed() {
        STATUS = ""

        super.onBackPressed()
    }
}