package com.example.idleProject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import java.lang.Exception

class SplashActivity : Activity() {

    val DURATION:Long = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        }, DURATION)

//        try {
//            Thread.sleep(2000);
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            finish()
//        }catch (e:Exception){
//            return;
//        }
    }
}

