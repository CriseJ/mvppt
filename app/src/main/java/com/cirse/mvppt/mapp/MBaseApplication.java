package com.cirse.mvppt.mapp;

import android.app.Application;
import android.content.Context;

/**
 * 注释：
 * ===========================
 * Author by Jack
 * on 2018/8/2 11:30
 */
public class MBaseApplication extends Application {

    private Context mApplicationContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationContext = getApplicationContext();


    }
}
