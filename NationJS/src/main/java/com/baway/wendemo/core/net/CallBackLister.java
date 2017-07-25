package com.baway.wendemo.core.net;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 11:10
 */

public interface CallBackLister<T> {

    void onNetStart();

    void onNetSuccess(T t);

    void onNetField(T t);

}
