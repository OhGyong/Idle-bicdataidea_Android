# hideSoftInputFromWindow를 사용했지만 키보드가 안내려가는 문제

EditText 등 키보드가 올라온 상태에서 다른 레이아웃을 클릭했을 때 키보드가 내려가도록 하려한다.</br>
`hideSoftInputFromWindow`를 사용해서 키보드를 내려줘야 한다.

**MainActivity에 작성했을 경우**</br>

```
        var view: View? = this.getCurrentFocus();
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0)
        }
```

https://user-images.githubusercontent.com/52282493/116803593-1e5dd300-ab54-11eb-8754-2987d2144871.mp4

키보드가 내려가지 않는다. 각 fragment 마다 따로 설정을 해야하나 싶어서 해당 fragment에서 시도를 해봤다.

**IdeaRegistPageFragment에 작성했을 경우**</br>
```
        val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view?.getWindowToken(), 0)
```

똑같이 안된다. view.getWindowToken() 부분에 view 대신 editText의 id를 넣으라는 말이 있어서 시도

```
        val imm = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow((binding.ideaRegistTitle).getWindowToken(), 0)
```

안된다.

**해당 fragment에서 id를 넣고 그 fragment를 클릭했을 때의 동작을 추가해준 경우**</br>
```
        var imm: InputMethodManager = context?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        (binding.ideaRegistScrollview).setOnClickListener {
            imm.hideSoftInputFromWindow(view?.getWindowToken(), 0)
        }
```

해결

https://user-images.githubusercontent.com/52282493/116804566-a0e99100-ab5a-11eb-96bf-12fafd09343b.mp4
