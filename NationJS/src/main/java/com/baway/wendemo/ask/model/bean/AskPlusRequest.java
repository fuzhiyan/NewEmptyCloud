package com.baway.wendemo.ask.model.bean;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.List;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 14:04
 */

public class AskPlusRequest implements Serializable {

    public boolean success;
    public boolean notFind;
    public String msg;
    public List<ListBean> list;

    public static AskPlusRequest objectFromData(String str) {

        return new Gson().fromJson(str, AskPlusRequest.class);
    }

    public static AskPlusRequest objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), AskPlusRequest.class);
        } catch (JSONException e) {
            return JSON.parseObject(str, AskPlusRequest.class);
        }

    }

    public static class ListBean implements Serializable {

        public int aid;
        public String title;

        public static ListBean objectFromData(String str) {

            return new Gson().fromJson(str, ListBean.class);
        }
        public static ListBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                return new Gson().fromJson(jsonObject.getString(str), ListBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
