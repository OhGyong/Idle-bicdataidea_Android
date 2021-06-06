package com.example.idleProject.ui.sign_up_page

import retrofit2.Call
import retrofit2.http.POST

interface SignUpPageInterface {
    @POST("/members/idle/signup/fillout")
    fun signUpPageInterface(): Call<SignUpPageData>
}