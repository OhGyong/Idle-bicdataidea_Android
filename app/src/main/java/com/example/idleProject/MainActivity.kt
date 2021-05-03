package com.example.idleProject

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.getSystemService
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import com.example.idleProject.databinding.ActivityMainBinding
import com.example.idleProject.databinding.FragmentContactPageBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    var STATUS: String = "" //
    var tabLastStatus: Int = 0 //

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 선언
        var binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        //키보드를 내리기 위한 설정
        var imm: InputMethodManager =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        // 헤더 레이아웃 클릭시 키보드 내리기
        var titleLayout: ConstraintLayout = findViewById(R.id.title_name)
        titleLayout.setOnClickListener {
            imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
        }

        // nav_drawer
        val drawer: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        // 이동한 nav_page 값 가져오기
        findNavController(R.id.nav_host_fragment).addOnDestinationChangedListener { controller, destination, arguments ->
            tabLastStatus = destination.id
        }

        // 타이틀 홈 화면 이동
        val main1: TextView = findViewById(R.id.main1)
        main1.setOnClickListener {
            imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
            if (tabLastStatus == 2131231033) {
            } else {
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home, Bundle().apply {
                })
                STATUS = "HOME"
            }
        }
        val main2: TextView = findViewById(R.id.main2)
        main2.setOnClickListener {
            imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
            if (tabLastStatus == 2131231033) {
            } else {
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home, Bundle().apply {
                })
                STATUS = "HOME"
            }
        }
        // nav의 헤더를 따로 불러줘야함
        val navHeader = navView.getHeaderView(0)
        navHeader.findViewById<LinearLayout>(R.id.nav_header).setOnClickListener {
            imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
            if (STATUS == "HOME" || tabLastStatus == 2131231033) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "HOME"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home, Bundle().apply {
                })
                drawer.closeDrawer(navView)
            }
        }

        // nav_drawer 열기
        val navIcon: ImageView = findViewById(R.id.nav_icon)
        navIcon.setOnClickListener {
            imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
            drawer.openDrawer(navView)
        }

        /*
        * 각 페이지 fragment 띄우기
        * */
        // 홈 화면
        (binding.navHome).setOnClickListener {
            // nav_host_fragment -> layout/content_main.xml 파일(메인에 프래그먼트 띄우는 부분)
            if (STATUS == "HOME" || tabLastStatus == 2131231033) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "HOME"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home, Bundle().apply {
                })
                drawer.closeDrawer(navView)
            }
        }
        // 아이디어 플랫폼 화면
        (binding.navIdeaPage).setOnClickListener {
            if (STATUS == "IDEA" || tabLastStatus == 2131231037) {
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
        (binding.navAnnoPage).setOnClickListener {
            if (STATUS == "ANNO" || tabLastStatus == 2131231028) {
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
        (binding.navNoticePage1).setOnClickListener {
            if (STATUS == "NOTICE" || tabLastStatus == 2131231046) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "NOTICE"
                findNavController(R.id.nav_host_fragment).navigate(
                    R.id.nav_notice_cs_page,
                    Bundle().apply {
                        this.putInt("index", 0)
                    })
                drawer.closeDrawer(navView)
            }
        }
        // 공지사항 화면2 (공지사항 버튼)
        (binding.navNoticePage2).setOnClickListener {
            if (STATUS == "NOTICE" || tabLastStatus == 2131231034) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "NOTICE"
                findNavController(R.id.nav_host_fragment).navigate(
                    R.id.nav_notice_cs_page,
                    Bundle().apply {
                        this.putInt("index", 0)
                    })
                drawer.closeDrawer(navView)
            }
        }
        // 문의게시판 화면
        (binding.navCsPage).setOnClickListener {
            if (STATUS == "CS" || tabLastStatus == 2131231034) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "CS"
                findNavController(R.id.nav_host_fragment).navigate(
                    R.id.nav_notice_cs_page,
                    Bundle().apply {
                        this.putInt("index", 1)
                    })
                drawer.closeDrawer(navView)
            }
        }
        // 고객센터 화면
        (binding.navContactPage).setOnClickListener {
            if (STATUS == "CONTACT" || tabLastStatus == 2131231017) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "CONTACT"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_contact_page)
                drawer.closeDrawer(navView)
            }
        }
        // 회원정보수정 화면1 (마이페이지 버튼)
        val navMemberUpdatePage1: TextView = findViewById(R.id.nav_member_update_page1)
        (binding.navMemberUpdatePage1).setOnClickListener {
            if (STATUS == "MEMBER_UPDATE" || tabLastStatus == 2131231033) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "MEMBER_UPDATE"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_mypage)
                drawer.closeDrawer(navView)
            }
        }
        // 회원정보수정 화면2 (회원정보수정 버튼)
        (binding.navMemberUpdatePage2).setOnClickListener {
            if (STATUS == "MEMBER_UPDATE" || tabLastStatus == 2131231033) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "MEMBER_UPDATE"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_mypage)
                drawer.closeDrawer(navView)
            }
        }
        // 포인트현황 화면
        (binding.navMemberPointPage).setOnClickListener {
            if (STATUS == "MEMBER_POINT" || tabLastStatus == 2131231033) {
                drawer.closeDrawer(navView)
            } else {
                STATUS == "MEMBER_POINT"
                findNavController(R.id.nav_host_fragment).navigate(
                    R.id.nav_mypage,
                    Bundle().apply {
                        this.putInt("index", 1)
                    }
                )
                drawer.closeDrawer(navView)
            }
        }
        // 내 아이디어 화면
        (binding.navMemberIdeaPage).setOnClickListener {
            if (STATUS == "MEMBER_IDEA" || tabLastStatus == 2131231033) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "MEMBER_IDEA"
                findNavController(R.id.nav_host_fragment).navigate(
                    R.id.nav_mypage,
                    Bundle().apply {
                        this.putInt("index", 2)
                    }
                )
                drawer.closeDrawer(navView)
            }
        }
        // 관심 사업 화면
        (binding.navMemberAnnoPage).setOnClickListener {
            if (STATUS == "MEMBER_ANNO" || tabLastStatus == 2131231033) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "MEMBER_ANNO"
                findNavController(R.id.nav_host_fragment).navigate(
                    R.id.nav_mypage,
                    Bundle().apply {
                        this.putInt("index", 3)
                    }
                )
                drawer.closeDrawer(navView)
            }
        }
        // 로그인 화면
        (binding.navSignInPage).setOnClickListener {
            if (STATUS == "LOGIN" || tabLastStatus == 2131231038) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "LOGIN"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_sign_in_page)
                drawer.closeDrawer(navView)
            }
        }
        // 정보 화면(footer)
        (binding.navAboutPage).setOnClickListener {
            if (STATUS == "ABOUT" || tabLastStatus == 2131231027) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "ABOUT"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_about_page)
                drawer.closeDrawer(navView)
            }
        }
        // 로그아웃 버튼
        (binding.navSignOutPage).setOnClickListener {
            drawer.closeDrawer(navView)
        }
    }

    override fun onBackPressed() {
        STATUS = ""
        super.onBackPressed()
    }
}