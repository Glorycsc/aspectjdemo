package com.retech.mylibrary;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Create by glorizz on 2019/1/8
 * Describe:
 */

@Aspect
public class Asp {

    @Before("@annotation(NeedPermissions)")
    public void onpermission(JoinPoint joinPoint ) {
        Context context = null;
        Object obj = joinPoint.getThis();
        if (obj instanceof Activity) {
            Log.e("glz","afesssssssssssssssssssssssssssssssssssssssss");

        }

        Log.d("glzzz", "glorypermissong");

    }
}
