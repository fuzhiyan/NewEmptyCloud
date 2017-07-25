package com.baway.wendemo.ask;

import android.os.Bundle;
import android.view.View;

import com.baway.wendemo.AppConstants;
import com.baway.wendemo.R;
import com.baway.wendemo.ask.model.bean.UserInfo;
import com.baway.wendemo.base.BaseActivity;
import com.baway.wendemo.utils.ACache;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/23 10:11
 */

public class LoginActivity extends BaseActivity {
    @Override
    public int getLayoutID() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void getExtras(Bundle bundle) {

    }

    public void onLoginUserListener(View v) {
        UserInfo info = new UserInfo("yuwentao", "666");
        ACache.get(this).put(AppConstants.CACHE_USERINFO_KEY, info);
        setResult(AppConstants.RESULT_CODE_KEY);
        this.finish();
    }
}
