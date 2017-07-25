package com.baway.wendemo.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 11:19
 */

public abstract class BaseActivity extends Activity {

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());

        unbinder = ButterKnife.bind(this);

        initView();
        getExtras(getIntent().getExtras());
        initData();
    }

    public abstract int getLayoutID();

    public abstract void initView();

    public abstract void initData();

    public abstract void getExtras(Bundle bundle);

    @Override
    protected void onDestroy() {
        super.onDestroy();

        unbinder.unbind();

    }
}
