package com.bwei.test.newemptycloud.core.net;

/**
 * Created by Administrator on 2017/7/14.
 * time:
 * author:付智焱
 */

public interface CallBackListener<T> {

    public void onNetStart();
    public void onSuccess(T t);
    public void onFailed(T t);

}
