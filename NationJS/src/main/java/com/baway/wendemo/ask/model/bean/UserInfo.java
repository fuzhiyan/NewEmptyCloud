package com.baway.wendemo.ask.model.bean;

import java.io.Serializable;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/23 10:15
 */

public class UserInfo implements Serializable {
    public String userName;
    public String password;

    public UserInfo() {
    }

    public UserInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
