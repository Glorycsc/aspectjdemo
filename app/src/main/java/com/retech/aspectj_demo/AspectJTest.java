package com.retech.aspectj_demo;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Create by glorizz on 2019/1/4
 * Describe:
 */
@Aspect
public class AspectJTest {
    public static final String TAG = "glz";

    @Before("execution(* android.app.Activity.on**(..))")
    public void onActivityMethodBefore(JoinPoint joinPoint) throws Throwable {
        String key = joinPoint.getSignature().toString();
        Log.d(TAG, "onActivityMethodBefore: " + key);
    }

    //    @Before("execution(*com.retech.aspectj_demo.MyAnnotation * *(..))")
//    public void loggerMylog() {
//        Log.e(MY, "this is my annotation");
//    }


//    @Around("execution(* *.*(..)) && @annotation(myAnnotation)")
//    public void setMyAnnotation(MyAnnotation myAnnotation) {
//        myAnnotation
//        Log.e()
//        Log.e("glz","ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
//    }

    @Around("@annotation(myAnnotation)")
    public void onAnnotationOptioned(ProceedingJoinPoint joinPoint, MyAnnotation myAnnotation) {
        Context context = null;
        Object obj = joinPoint.getThis();

//        Log.e("glz", myAnnotation.value());
        Log.e("glzzzzz", myAnnotation.getArgs()[0]);
        Log.e("glzzzzz", myAnnotation.getArgs()[1]);
        Log.e("glz", "" + joinPoint.getArgs().length);
        if (obj instanceof Activity) {
            Log.e("glz", "this is an activity");

        }
        String[] ss = {"aa", "aadd"};
        String s = "ccc";
        String sb = s == "" ? s : ss;
//        printVarArgs(myAnnotation.getArgs());
        printVarArgs(s.equals("") ? ss : s);
        Log.d("glzzz", "glory");

    }


//    @Before("@annotation(NeedPermissions)")
//    public void onpermission(JoinPoint joinPoint) {
//        Context context = null;
//        Object obj = joinPoint.getThis();
//        if (obj instanceof Activity) {
//            Log.e("glz","afesssssssssssssssssssssssssssssssssssssssss");
//
//        }
//
//        Log.d("glzzz", "glorypermissong");
//
//    }


    public void printVarArgs(String... args) {
        Log.e("glzzzzz", "可以接收数组的数据");
    }
}
