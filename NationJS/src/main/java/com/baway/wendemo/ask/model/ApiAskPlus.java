package com.baway.wendemo.ask.model;

import com.baway.wendemo.Constants;
import com.baway.wendemo.core.net.ApiGenerator;
import com.baway.wendemo.core.net.BaseService;

import retrofit2.Call;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 11:12
 */

public class ApiAskPlus {

    private static volatile ApiAskPlus instance = null;
    private BaseService baseService;

    public ApiAskPlus() {
        baseService = ApiGenerator.getBaseNetService();
    }

    public static ApiAskPlus getInstance() {
        if (instance == null) {
            synchronized (ApiAskPlus.class) {
                if (instance == null) {
                    instance = new ApiAskPlus();
                }
            }
        }
        return instance;
    }

    //获取问答
    public Call<String> getConfigFromServer(String sid, String rowNumber, String lastID) {
        if (baseService == null) {
            baseService = ApiGenerator.getBaseNetService();
        }
        return baseService.baseGetRequest(getConfigUrl(sid, rowNumber, lastID));
    }

    //http://h5.newaircloud.com/api/getAskBarPlusList?sid=xkycs&rowNumber=0&lastID=0
    public String getConfigUrl(String curPage, String rowNumber, String lastID) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Constants.BASEURL).append(Constants.ASKBARPLUS_PATH)
                .append("curPage=").append(curPage);
        return stringBuffer.toString();
    }
}
