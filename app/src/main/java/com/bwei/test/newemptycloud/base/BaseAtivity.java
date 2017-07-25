package com.bwei.test.newemptycloud.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/14.
 * time:
 * author:付智焱
 *
 * 抽取Activity的基类，定义抽象方法。让其他Activity继承
 */

public abstract class BaseAtivity extends Activity {

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        unbinder = ButterKnife.bind(this);

        initView();
        initData();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (unbinder != null){
            unbinder.unbind();
        }

    }

    public abstract int getLayoutID();
    public abstract void initView();
    public abstract void initData();

}
