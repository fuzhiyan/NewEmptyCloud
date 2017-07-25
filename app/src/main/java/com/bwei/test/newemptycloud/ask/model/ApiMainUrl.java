package com.bwei.test.newemptycloud.ask.model;

import com.bwei.test.newemptycloud.core.net.BaseService;
import com.bwei.test.newemptycloud.core.net.Generator;

import retrofit2.Call;

/**
 * Created by Administrator on 2017/7/14.
 * time:
 * author:付智焱
 */

public class ApiMainUrl {
    public static volatile ApiMainUrl instance;

    private BaseService baseService;

    public ApiMainUrl() {

        baseService=Generator.getBaseNetServer();

    }

    public static ApiMainUrl getInstance() {
        if (instance == null) {

            synchronized (ApiMainUrl.class) {

                if (instance == null) {
                    instance = new ApiMainUrl();
                }
            }
        }

        return instance;
    }

    public Call<String> getAskFromServe(String sid,String rowNuber,String lastID){

        //上面通过单利提取出来baseService=Generator.getBaseNetServer();
        if(baseService==null){

            baseService=Generator.getBaseNetServer();
        }
        return baseService.getBase(getBaseUrl(sid,rowNuber,lastID));
    }

    public Call<String> getAskDetail(String sid,String aid,String uid){

        //上面通过单利提取出来baseService=Generator.getBaseNetServer();
        if(baseService==null){

            baseService=Generator.getBaseNetServer();
        }
        return baseService.getBase(getAskDetailUrl(sid,aid,uid));
    }

//    http://h5.newaircloud.com/api/getAskBarPlusList?sid=xkycs&rowNumber=0&lastID=0
    public String getBaseUrl(String sid,String rowNuber,String lastID){

        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("http://h5.newaircloud.com/api/")
                .append("getAskBarPlusList?sid=")
                .append(sid)
                .append("&rowNumber=")
                .append(rowNuber)
                .append("&lastID=")
                .append(lastID);

        System.out.println(stringBuffer);
        return  stringBuffer.toString();
    }
    //获取问答详情页

    public String getAskDetailUrl(String sid, String aid, String uid){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("http://h5.newaircloud.com/api/")
                .append("getAskBarPlusDetail?sid=")
                .append(sid)
                .append("&aid=")
                .append(aid)
                .append("&uid=")
                .append(uid);

        System.out.println(stringBuffer);
        return  stringBuffer.toString();


    }
}
