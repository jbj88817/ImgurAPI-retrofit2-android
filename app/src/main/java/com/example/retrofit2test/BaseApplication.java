package com.example.retrofit2test;

import android.app.Application;

import com.example.retrofit2test.api.OAuthUtil;


public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // ensure the shared pref is initialized with the Global Context
        OAuthUtil.initSharedPref(this);
    }
}
