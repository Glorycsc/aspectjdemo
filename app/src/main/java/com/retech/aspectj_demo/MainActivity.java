package com.retech.aspectj_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.retech.mylibrary.NeedPermissions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getName(new PermissionResult() {
            @Override
            public void onDenied() {

            }

            @Override
            public void onGranted() {

            }
        });
        getPermission();
    }

    @MyAnnotation(getArgs = {"hhhhh", "rrrrrrrrr"})
    public void getName(PermissionResult permissionResult) {
        Log.e("glz", "my name is chen");
    }

    @NeedPermissions("ssd")
    public void getPermission() {
        Log.e("glz", "permissionssssss");
    }

    public void getAge(String... name) {
        int a = 10;
        int b = 11;
        int c = a > b ? a : b;
    }
}
