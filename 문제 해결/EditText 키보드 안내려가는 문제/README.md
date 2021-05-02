# hideSoftInputFromWindow를 사용했지만 키보드가 안내려가는 문제

EditText 등 키보드가 올라온 상태에서 다른 레이아웃을 클릭했을 때 키보드가 내려가도록 하려한다.</br>
`hideSoftInputFromWindow`를 사용해서 키보드를 내려줘야 한다.

**MainActivity에 작성했을 경우**</br>
`
        var view: View? = this.getCurrentFocus();
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0)
        }
`
https://user-images.githubusercontent.com/52282493/116803593-1e5dd300-ab54-11eb-8754-2987d2144871.mp4

