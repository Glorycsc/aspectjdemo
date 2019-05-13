package com.retech.myktapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getName()
    }

    @NeedPermission("sfs")
    fun getName() {
        val a = 10
        val b = 11
        val c = if (a > b) a else b
    }

}
