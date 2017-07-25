package com.bwei.test.newemptycloud.core.net;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Administrator on 2017/7/14.
 * time:
 * author:付智焱
 */

public interface BaseService {

    @GET
    public Call<String> getBase(@Url String url);
}
