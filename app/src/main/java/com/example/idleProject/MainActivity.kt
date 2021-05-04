package com.example.idleProject

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import com.example.idleProject.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private var STATUS: String = "" //
    var tabLastStatus: Int = 0 //

    private lateinit var navView: NavigationView
    private lateinit var drawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 바인딩 선언
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        //키보드를 내리기 위한 설정
        val imm: InputMethodManager =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        // 헤더 레이아웃 클릭시 키보드 내리기
        val titleLayout: ConstraintLayout = findViewById(R.id.title_name)
        titleLayout.setOnClickListener {
            imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
        }

        // nav_drawer
        drawer = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)

        var drawerMenu = ArrayList<Int>()
        for (i:Int in 0 until binding.menuLayout.childCount){
            val view = binding.menuLayout.getChildAt(i)
            drawerMenu.add(view.id)
            println("drawerTextId[$i] : " + view.id)
        }

        // 이동한 nav_page destination 값 가져오기
        findNavController(R.id.nav_host_fragment).addOnDestinationChangedListener { controller, destination, arguments ->
            tabLastStatus = destination.id
            when(tabLastStatus){
                drawerMenu[0]->{
                    (binding.navHome).setTextColor(0xFFBB86FC.toInt())
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(Color.BLACK)
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(Color.BLACK)
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[1]->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(0xFFBB86FC.toInt())
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(Color.BLACK)
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(Color.BLACK)
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[2]->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(0xFFBB86FC.toInt())
                    (binding.navNoticePage1).setTextColor(Color.BLACK)
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(Color.BLACK)
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[3]+1->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(0xFFBB86FC.toInt())
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(Color.BLACK)
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[4]+2->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(0xFFBB86FC.toInt())
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(Color.BLACK)
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[5]+17->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(0xFFBB86FC.toInt())
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(Color.BLACK)
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[6]->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(Color.BLACK)
                    (binding.navContactPage).setTextColor(0xFFBB86FC.toInt())
                    (binding.navMemberUpdatePage1).setTextColor(Color.BLACK)
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[7]+2->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(Color.BLACK)
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(0xFFBB86FC.toInt())
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[8]+1->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(Color.BLACK)
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(0xFFBB86FC.toInt())
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[9]+3->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(Color.BLACK)
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(0xFFBB86FC.toInt())
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[10]+4->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(Color.BLACK)
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(0xFFBB86FC.toInt())
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[11]+5->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(Color.BLACK)
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(0xFFBB86FC.toInt())
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[12]->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(Color.BLACK)
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(Color.BLACK)
                    (binding.navSignInPage).setTextColor(0xFFBB86FC.toInt())
                    (binding.navAboutPage).setTextColor(Color.BLACK)
                }
                drawerMenu[13]->{
                    (binding.navHome).setTextColor(Color.BLACK)
                    (binding.navIdeaPage).setTextColor(Color.BLACK)
                    (binding.navAnnoPage).setTextColor(Color.BLACK)
                    (binding.navNoticePage1).setTextColor(Color.BLACK)
                    (binding.navContactPage).setTextColor(Color.BLACK)
                    (binding.navMemberUpdatePage1).setTextColor(Color.BLACK)
                    (binding.navSignInPage).setTextColor(Color.BLACK)
                    (binding.navAboutPage).setTextColor(0xFFBB86FC.toInt())
                }
            }
            println("이동한 nav_page id : $tabLastStatus")
            println("현재 위치 : $STATUS")
        }

        // drawer에 있는 textview 값들 리스트에 저장


        (binding.navHome).setTextColor(0xFFBB86FC.toInt()) // 시작할 때 drawer 홈 색 변경

        // 타이틀 홈 화면 이동
        val main1: TextView = findViewById(R.id.main1)
        main1.setOnClickListener {
            imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
            if (tabLastStatus == drawerMenu[0]) {
                drawer.closeDrawer(navView)
            } else {
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home, Bundle().apply {
                })
                STATUS = "HOME"
            }
        }
        val main2: TextView = findViewById(R.id.main2)
        main2.setOnClickListener {
            imm.hideSoftInputFromWindow(currentFocus?.windowToken, 0)
            if (tabLastStatus == drawerMenu[0]) {
                drawer.closeDrawer(navView)
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
            if (STATUS == "HOME" || tabLastStatus == drawerMenu[0]) {
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
            drawer.closeDrawer(navView)

            // nav_host_fragment -> layout/content_main.xml 파일(메인에 프래그먼트 띄우는 부분)
            if (STATUS == "HOME" || tabLastStatus == drawerMenu[0]) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "HOME"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_home, Bundle().apply {
                })
            }
        }
        // 아이디어 플랫폼 화면
        (binding.navIdeaPage).setOnClickListener {
            if (STATUS == "IDEA" || tabLastStatus == drawerMenu[1]) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "IDEA"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_idea_page, Bundle().apply {
                })
                drawer.closeDrawer(navView)
            }
        }
        // 공고정보 게시판 화면
        (binding.navAnnoPage).setOnClickListener {
            if (STATUS == "ANNO" || tabLastStatus == drawerMenu[2]) {
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
            if (STATUS == "NOTICE" || tabLastStatus+1 == drawerMenu[3]) {
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
            if (STATUS == "NOTICE" || tabLastStatus+2 == drawerMenu[4]) {
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
            if (STATUS == "CS" || tabLastStatus+17 == drawerMenu[5]) {
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
            if (STATUS == "CONTACT" || tabLastStatus == drawerMenu[6]) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "CONTACT"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_contact_page)
                drawer.closeDrawer(navView)
            }
        }
        // 회원정보수정 화면1 (마이페이지 버튼)
        (binding.navMemberUpdatePage1).setOnClickListener {
            if (STATUS == "MEMBER_UPDATE" || tabLastStatus+2 == drawerMenu[7]) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "MEMBER_UPDATE"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_mypage)
                drawer.closeDrawer(navView)
            }
        }
        // 회원정보수정 화면2 (회원정보수정 버튼)
        (binding.navMemberUpdatePage2).setOnClickListener {
            if (STATUS == "MEMBER_UPDATE" || tabLastStatus+1 == drawerMenu[8]) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "MEMBER_UPDATE"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_mypage)
                drawer.closeDrawer(navView)
            }
        }
        // 포인트현황 화면
        (binding.navMemberPointPage).setOnClickListener {
            if (STATUS == "MEMBER_POINT" || tabLastStatus+3 == drawerMenu[9]) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "MEMBER_POINT"
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
            if (STATUS == "MEMBER_IDEA" || tabLastStatus+4 == drawerMenu[10]) {
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
            if (STATUS == "MEMBER_ANNO" || tabLastStatus+5 == drawerMenu[11]) {
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
            if (STATUS == "LOGIN" || tabLastStatus == drawerMenu[12]) {
                drawer.closeDrawer(navView)
            } else {
                STATUS = "LOGIN"
                findNavController(R.id.nav_host_fragment).navigate(R.id.nav_sign_in_page)
                drawer.closeDrawer(navView)
            }
        }
        // 정보 화면(footer)
        (binding.navAboutPage).setOnClickListener {
            if (STATUS == "ABOUT" || tabLastStatus == drawerMenu[13]) {
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

        // drawer가 열려있을 때 뒤로가기 클릭 시 drawer 닫아주기
        if(drawer.isDrawerOpen(navView)){
            drawer.closeDrawer(navView)
        }else{
            super.onBackPressed()
        }


    }
}