package com.retech.myktapplication

import android.util.Log
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before

/**
 *Create by glorizz on 2019/1/7
 *Describe:
 */
@Aspect
class AspectJXChen {

    val strArray = arrayListOf<String>("fse", "faefeaf", "bbbbb")


    @Before("execution(* android.app.Activity.on**(..))")
    fun onActivityMethodBefore(joinPoint: JoinPoint) {
        val key = joinPoint.signature.toString()
        Log.d("csc", "onActivityMethodBefore: $key")
    }


    @Around("@annotation(NeedPermission)")
    fun onann(joinPoint: JoinPoint) {
        val key = joinPoint.signature.toString()
        Log.d("csc", "neeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee: $key")
        val size =  strArray.size
        strArray.forEach {  }
        multiArgs("sfe", "sfe", "fae", "gegseg")
    }


    fun multiArgs(vararg ss: String) {
        println(ss.toString())
    }


}