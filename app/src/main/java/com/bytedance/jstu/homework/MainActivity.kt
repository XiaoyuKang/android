package com.bytedance.jstu.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.annotation.SuppressLint


class MainActivity : AppCompatActivity() {
    @SuppressLint("CI_ByteDanceKotlinRules_Not_Allow_findViewById_Invoked_IN_UI")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.kangxiaoyu_test)
        tv.setOnClickListener(
            tv.text = "Hello SJTU"
            Log.d("MainActivity","World")
        )
        Log.d("MainActivity","Hello")
    }
}