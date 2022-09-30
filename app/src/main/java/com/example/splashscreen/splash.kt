package com.example.splashscreen

import android.os.Bundle
import android.view.View
import android.view.View.BaseSavedState
import android.view.View.OnCreateContextMenuListener
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity

class splash:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topAnimation=AnimationUtils.loadAnimation(this,R.anim.zalego)


    }

    }
