package com.bwei.test.newemptycloud;

import android.app.Application;

/**
 * Created by Administrator on 2017/7/14.
 * time:
 * author:付智焱
 */

public class MyApplaction extends Application {
    public static MyApplaction myApplaction;

//    public MyApplaction(MyApplaction myApplaction) {
//        this.myApplaction = myApplaction;
//    }

    @Override
    public void onCreate() {
        super.onCreate();
         myApplaction=this;
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
