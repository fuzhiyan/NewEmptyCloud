package com.baway.wendemo.core.net;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 11:08
 */

public interface BaseService {
    @GET
    Call<String> baseGetRequest(@Url String url);
}
