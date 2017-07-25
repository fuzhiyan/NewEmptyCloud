package com.baway.wendemo;

import android.app.Application;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 11:26
 */

public class MyApplication extends Application {

    public static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);

    }
}
