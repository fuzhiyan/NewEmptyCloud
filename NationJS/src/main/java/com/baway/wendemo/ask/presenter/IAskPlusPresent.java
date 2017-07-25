package com.baway.wendemo.ask.presenter;

import com.baway.wendemo.base.IbasePresent;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 14:10
 */

public interface IAskPlusPresent extends IbasePresent{

    void loadData(String sid, String rowNumber, String lastID);

}
