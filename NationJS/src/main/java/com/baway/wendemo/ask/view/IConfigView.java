package com.baway.wendemo.ask.view;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 14:13
 */

public interface IConfigView<T> {

    void showOrHidePregress(boolean flag);

    void showOrHideErrorView(boolean flag);

    void refreshView(T t);
}
