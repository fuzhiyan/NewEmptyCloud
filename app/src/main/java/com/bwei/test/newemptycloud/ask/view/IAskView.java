package com.bwei.test.newemptycloud.ask.view;

/**
 * Created by Administrator on 2017/7/14.
 * time:
 * author:付智焱
 */

public interface IAskView<T> {


    void showOrHindLoad(boolean flag);
    void refresh(T t);
    void showOrHindError(boolean flag);
}
