package com.bwei.test.newemptycloud.core.net;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.Url;

/**
 * Created by Administrator on 2017/7/14.
 * time:
 * author:付智焱
 */

public class Generator {

    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://h5test.newaircloud.com/api/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();

    //    BaseService service = retrofit.create(BaseService.class);
    public static BaseService getBaseNetServer() {
        return retrofit.create(BaseService.class);
    }

}


