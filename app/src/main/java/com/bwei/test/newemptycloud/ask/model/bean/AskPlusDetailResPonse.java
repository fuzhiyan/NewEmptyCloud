package com.bwei.test.newemptycloud.ask.model.bean;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/15.
 * time:
 * author:付智焱
 */

public class AskPlusDetailResPonse implements Serializable {

    /**
     * success : true
     * model : {"aid":468,"sid":"xkycs","title":"热门评论容易出现么？","tag":"","description":"","imgUrl":"http://img.newaircloud.com/xkycs/upload/201707/10/85bdf628-319f-4446-8969-f25fa00160e3.jpg","beginTime":"2017-06-30 00:00:00","endTime":"2017-07-28 00:00:00","authorID":4165208,"authorName":"test","authorTitle":"test","authorDesc":"stes","authorFace":"","askTime":"","orderID":0,"publishStatus":1,"askCount":1,"interestCount":3,"readCount":0,"isFollow":0}
     */

    public boolean success;
    public ModelBean model;

    public static AskPlusDetailResPonse objectFromData(String str) {

        return new Gson().fromJson(str, AskPlusDetailResPonse.class);
    }

    public static class ModelBean implements Serializable {
        /**
         * aid : 468
         * sid : xkycs
         * title : 热门评论容易出现么？
         * tag :
         * description :
         * imgUrl : http://img.newaircloud.com/xkycs/upload/201707/10/85bdf628-319f-4446-8969-f25fa00160e3.jpg
         * beginTime : 2017-06-30 00:00:00
         * endTime : 2017-07-28 00:00:00
         * authorID : 4165208
         * authorName : test
         * authorTitle : test
         * authorDesc : stes
         * authorFace :
         * askTime :
         * orderID : 0
         * publishStatus : 1
         * askCount : 1
         * interestCount : 3
         * readCount : 0
         * isFollow : 0
         */

        public int aid;
        public String sid;
        public String title;
        public String tag;
        public String description;
        public String imgUrl;
        public String beginTime;
        public String endTime;
        public int authorID;
        public String authorName;
        public String authorTitle;
        public String authorDesc;
        public String authorFace;
        public String askTime;
        public int orderID;
        public int publishStatus;
        public int askCount;
        public int interestCount;
        public int readCount;
        public int isFollow;

        public static ModelBean objectFromData(String str) {

            return new Gson().fromJson(str, ModelBean.class);
        }
    }
}
