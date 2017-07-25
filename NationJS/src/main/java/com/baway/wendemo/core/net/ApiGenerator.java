package com.baway.wendemo.core.net;

import com.baway.wendemo.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 11:06
 */

public class ApiGenerator {

    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Constants.BASEURL)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();

    public static BaseService getBaseNetService() {
        return retrofit.create(BaseService.class);
    }

}
