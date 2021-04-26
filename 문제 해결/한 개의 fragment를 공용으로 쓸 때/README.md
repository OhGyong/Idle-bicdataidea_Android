# 두 페이지를 하나의 fragment로 이용할 때 문제점
 게시판에서 공지사항과 문의게시판의 내용이 같기 때문에 하나의 fragment를 이용해서 표현하려고 했다.
 하나의 fragment로 두 페이지를 나타낼 수 있었지만 문제점이 있었다.
 
 https://user-images.githubusercontent.com/52282493/116109496-cb1cf800-a6ef-11eb-9a7a-0d96f88816c9.mp4
 
 처음 게시물 페이지로 이동시 문제가 없지만 다른 페이지로 이동 후 들어가면 text가 없어지고 tab의 이동도 이상해졌다.</br>
 04/26 main/java/ui/notice_cs_page  |  res/layout/fragment_notice_cs_page, fragment_notice_cs_view
 
 
 https://user-images.githubusercontent.com/52282493/116109729-06b7c200-a6f0-11eb-9f76-73441774d2f4.mp4
 
 각 페이지 별로 fragment를 만들어서 해결
 
 
