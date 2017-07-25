package com.baway.wendemo.ask.model;

import com.baway.wendemo.AppConstants;
import com.baway.wendemo.MyApplication;
import com.baway.wendemo.ask.model.bean.AskPlusRequest;
import com.baway.wendemo.core.net.CallBackLister;
import com.baway.wendemo.utils.ACache;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 11:53
 */

public class AskPlusService {
    private static volatile AskPlusService instance;
    private ACache aCache;

    public AskPlusService() {
        aCache = ACache.get(MyApplication.instance);
    }

    public static AskPlusService getInstace() {
        if (instance == null) {
            synchronized (AskPlusService.class) {
                if (instance == null) {
                    instance = new AskPlusService();
                }
            }
        }
        return instance;
    }

    public Call getConfig(String sid, String rowNumber, String lastID, final CallBackLister<AskPlusRequest> callBackLister) {
        callBackLister.onNetStart();
        boolean isCallBack = false;
        AskPlusRequest bean = (AskPlusRequest) aCache.getAsObject(AppConstants.ASKBARPLUS_LIST_KEY);
        if (bean != null) {
            callBackLister.onNetSuccess(bean);
            isCallBack = true;
        }
        Call<String> call = ApiAskPlus.getInstance().getConfigFromServer(sid, rowNumber, lastID);
        final boolean finalIsCallBack = isCallBack;
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response != null && response.isSuccessful()) {
                    if (response.body() != null) {
                        AskPlusRequest askRequestBean = AskPlusRequest.objectFromData(response.body().toString());

                        if (!finalIsCallBack) {
                            callBackLister.onNetSuccess(askRequestBean);
                        }
                        aCache.put(AppConstants.ASKBARPLUS_LIST_KEY, askRequestBean);
                    } else {
                        if (!finalIsCallBack) {
                            callBackLister.onNetField(null);
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                callBackLister.onNetField(null);
            }
        });
        return call;
    }

}
