package com.bwei.test.newemptycloud.ask.model;

import com.bwei.test.newemptycloud.Constants;
import com.bwei.test.newemptycloud.MyApplaction;
import com.bwei.test.newemptycloud.ask.model.bean.AskPlusDetailResPonse;
import com.bwei.test.newemptycloud.ask.model.bean.AskPlusListResponse;
import com.bwei.test.newemptycloud.core.net.CallBackListener;
import com.bwei.test.newemptycloud.util.ACache;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/7/14.
 * time:
 * author:付智焱
 */

public class AskService {
    private static AskService instance = null;
    private ACache aCache;

    private AskService() {

        aCache = ACache.get(MyApplaction.myApplaction);

    }

    public static AskService getIntence() {

        if (instance == null) {

            synchronized (AskService.class) {

                if (instance == null) {

                    instance = new AskService();

                }

            }

        }

        return instance;

    }


    public Call<String> getApiList(String sid, String rowNuber, String lastID, final CallBackListener<AskPlusListResponse> callBackListener) {
        callBackListener.onNetStart();

        boolean isDataCallBack = false;

        AskPlusListResponse askPlusListResponse = (AskPlusListResponse) aCache.getAsObject(Constants.ASK_LIST_KEY);
        if (askPlusListResponse != null) {
            callBackListener.onSuccess(askPlusListResponse);
            isDataCallBack = true;
        }

        Call<String> call = ApiMainUrl.getInstance().getAskFromServe(sid, rowNuber, lastID);
        final boolean finalIsDataCallBack = isDataCallBack;
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {

                if (response != null && response.isSuccessful()) {

                    if (response.body() != null && response.body().length() > 0) {

                        AskPlusListResponse askPlusListResponse = AskPlusListResponse.objectFromData(response.body().toString());

                        if (!finalIsDataCallBack) {
                            callBackListener.onSuccess(askPlusListResponse);
                        }

                        aCache.put(Constants.ASK_LIST_KEY, askPlusListResponse);

                    }

                } else {

                    if (!finalIsDataCallBack) {
                        callBackListener.onFailed(null);
                    }

                }

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

                if (!finalIsDataCallBack) {
                    callBackListener.onFailed(null);
                }

            }
        });

        return call;


    }

    //
    public Call getAskDetail(String sid, String aid, String uid, final CallBackListener<AskPlusDetailResPonse> callBackListener) {


        callBackListener.onNetStart();
        boolean isDataDatial = false;
        AskPlusDetailResPonse detailKey =(AskPlusDetailResPonse) aCache.getAsObject(Constants.ASK_LIST_DETAIL_KEY);
        if (detailKey != null && !detailKey.equals("null") && !"".equals(detailKey)) {

            callBackListener.onSuccess(detailKey);
            isDataDatial = true;
        }
        Call<String> call = ApiMainUrl.getInstance().getAskDetail(sid, aid, uid);
        final boolean finalIsDataDatial = isDataDatial;
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {

                if (response != null && response.isSuccessful()) {
                    if (response.body() != null && response.body().toString().length() > 0) {
                        AskPlusDetailResPonse askPlusDetailResPonse=AskPlusDetailResPonse.objectFromData(response.body().toString());

                        if (!finalIsDataDatial) {
                            //返回数据给P层
                            callBackListener.onSuccess(askPlusDetailResPonse);
                        }

                        aCache.put(Constants.ASK_LIST_DETAIL_KEY, askPlusDetailResPonse);
                    }


                } else {
                    callBackListener.onFailed(null);
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });

        return call;
    }

}
