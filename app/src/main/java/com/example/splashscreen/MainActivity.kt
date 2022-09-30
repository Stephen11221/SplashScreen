package com.example.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.test.withTestContext



        class MainActivity:AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val topAnimation = AnimationUtils.loadAnimation(this, R.anim.zalego)


                Handler().postDelayed({
                    var intent = Intent(this@MainActivity, home::class.java)
                    startActivity(intent)
                    finish()

                }, 5009)
            }
        }