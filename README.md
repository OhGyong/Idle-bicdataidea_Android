![아이디어 플랫폼](https://user-images.githubusercontent.com/52282493/224542398-2e20c252-86f1-4d02-814f-e05f4df91023.png)

https://user-images.githubusercontent.com/52282493/136694378-72c76826-f29e-4bbf-8199-0364164fc16a.mp4 <br/>
(API 미연결)


---

# 안드로이드 진행상황

**프론트**
- 홈
- 아이디어 플랫폼
- 공고정보 게시판
- 게시판 - 공지사항, 문의게시판
- 마이페이지
- 로그인 - 회원가입, 비밀번호찾기

4월 5주차까지(30일까지) 각 화면 별 UI 끝내기 </br>
26,27일 : 내용등록 전 까지 화면 UI 마무리 </br>
28일 : 아이디어 등록, 문의게시판 등록 부분 마무리 </br>
29,30일 : 각 페이지 별로 기기 호환 맞는지 테스트 </br>
~ API 연결, JWT, FCM(파이어베이스 클라우드 메시지), 바인딩

5월 1주차 : JWT, API 수정<br/>
5월 2주차 : 회원가입 - 로그인<br/> 

### 2021
**05-15**
- 마이페이지 tab 레이아웃 배경 색 오류 수정
- 문제해결 파일에 정리

**05-14**
- 게시판 tab 레이아웃 배경 색 오류 수정

**05-09**
- splash 로딩화면 및 AppIcon 변경

**05-04**
- `로딩화면 안했다..`
- 퍼블 확인 수정 작업

**05-03**</br>
- `MainActivity 바인딩해주자`
- 아이디어 리스트 제목 글자 수 지정, constraintlayout으로 반응형
- java 파일 변수명 수정 
- drawer textview 해당 페이지에서 글씨 색상 변경


**04-30**</br>
- 모든 화면 반응형 마무리(app:layout_constraintWidth_percent 사용)

**04-29**</br>
- 문의게시판 내용 추가
- 홈화면 기기별 호환

**04-28**</br>
- 문의게시판 등록 추가
- `문의게시판 등록부분 끝내야함, 추가로 테두리 선 그려주자`
- 아이디어 등록 페이지에서 내용 부분, https://github.com/wasabeef/richeditor-android 사용 필요부분만 가져다 씀 


**04-27**</br>
- 아이디어 플랫폼, 공고정보게시판, 게시판 recyclerview 마무리 / 검색 edittext 및 이미지 추가
- 마이페이지 recyclerview 마무리 / 검색 edittext 및 이미지 추가
- `API 에서 값을 받아올 때 신경써야할 점`
- 아이디어 등록 페이지 및 UI 추가 `내용 작성 부분 WYSIWYG LIBARARY 사용하자`


**04-26**</br>
- 회원가입 이용약관 테두리 선 해결
- 고객센터 UI 추가
- `ANDROID WYSIWYG LIBRARY 사용해서 고객센터 내용 추가할 것`
- `Mypage 탭의 글씨 크기 변경 안됨(s에서 회원정보수정이 아래로 한칸 밀림)`
- `게시판 fragment 2개로 늘리자 -> 1개로 썼을때 문제를 해결 하기 어려움`
- RecyclerView 사용해서 게시판 부분 구현

**04-23**</br>
- 마이페이지 viewpager 적용
- 회원가입, 로그인 UI 추가
- `회원가입 textview 이용약관에서 스크롤이 안되는 현상 → NestedScrollView 사용 ( 스크롤이 되지만 테두리 선 문제)`

**04-22**</br>
- 뒤로가기 시 오류 처리 → onBackPressed() 사용
- `drawer header와 main header 크기 안맞음`
- `각 페이지 이미지 사이즈 늘리기`
- `view pager 에서 destination 값이 서로 같기 때문에 게시판이나 마이페이지에서 옮겨지지 않는다.`

**04-21**</br>
- 홈 화면에서 아이디어플랫폼, 공고정보게시판으로 이동, 게시판 부분 viewpager로 변환 탭 설정
- `현재 페이지에서 같은 페이지로 이동 불가능하게, 마이페이지도 viewpager로 변환, footer에 대한 drawer와 fragment 추가`
- 같은 페이지 이동 불가능 처리 `그래도 viewpager의 문제점이 남음(게시판 데이터 날라가는것도)`
- 정보 페이지(footer) 생성

**04-20**</br>
- 모든 페이지 UI 추가 및 보완/ 게시판 버튼 이벤트

**04-19**</br>
- 페이지 별 drawerLayout 마무리, home 화면 UI 추가

**04-16**</br>
- nav_drawerLayout 이해, 페이지 별 drawerLayout 이동
