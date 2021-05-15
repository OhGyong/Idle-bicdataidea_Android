# TabLayout의 background 색상 변경 시 문제 해결

탭이 있는 페이지에서 해당 fragment에 있는 곳에 보라색의 탭 색깔 그 외의 fragment에는 회색의 탭 색깔을 부여하려고 했다.

xml파일에서 background를 white로 지정하고 탭 이동시마다 kt파일에서 색을 변경

![image](https://user-images.githubusercontent.com/52282493/118356189-03a54880-b5af-11eb-9421-821fa1fc2f42.png)

kt 파일 : https://github.com/OhGyong/Idle_Project_Android/blob/master/app/src/main/java/com/example/idleProject/ui/mypage/MypageFragment.kt

TabLayout의 textView의 라인만 배경이 변경하는 문제 </br>

https://user-images.githubusercontent.com/52282493/118355416-dfe00380-b5aa-11eb-90ad-6af5f6a96590.mp4


## 해결

MypageFragment.kt에서 설정한 background 설정은 모두 지워주고 </br>
xml 파일을 수정해준다. </br>
- drawable 파일에 탭의 색을 지정해줄 파일을 생성 -> tab_background_color.xml
- android:drawable 로 색을 지정할 때 Color값으로 지정해서 주면 안됌 - > tab_selected_draw.xml, tab_not_selected_draw.ml 생성

![image](https://user-images.githubusercontent.com/52282493/118361043-93092680-b5c4-11eb-8566-4fb5f11f0fa0.png)
![image](https://user-images.githubusercontent.com/52282493/118361071-ac11d780-b5c4-11eb-973d-108b6df647c8.png)
![image](https://user-images.githubusercontent.com/52282493/118361099-c8157900-b5c4-11eb-9634-7cb7b47ffb0f.png)
![image](https://user-images.githubusercontent.com/52282493/118361108-d368a480-b5c4-11eb-9a79-8626afc8dc48.png)




https://user-images.githubusercontent.com/52282493/118360457-99969e80-b5c2-11eb-9fc3-448ec339d7bc.mp4



