package com.bwei.test.newemptycloud.ask.presrnter;

import com.bwei.test.newemptycloud.ask.model.AskService;
import com.bwei.test.newemptycloud.ask.model.bean.AskPlusListResponse;
import com.bwei.test.newemptycloud.ask.view.IAskView;
import com.bwei.test.newemptycloud.core.net.CallBackListener;

import retrofit2.Call;

/**
 * Created by Administrator on 2017/7/14.
 * time:
 * author:付智焱
 */

public class AskPresenter implements IAskPresenter {

    public String sid;
    public String rowNumber;
    public String lastID;
    private IAskView iAskPlusView;
    private Call<String> call;

    private AskPresenter(){

    }
    public AskPresenter(String sid, String rowNumber, String lastID, IAskView iAskPlusView){

        this.sid = sid;
        this.rowNumber = rowNumber;
        this.lastID = lastID;
        this.iAskPlusView = iAskPlusView;

    }



    @Override
    public void start() {
        loadAskPlusList(sid, rowNumber, lastID);
    }

    @Override
    public void detachView() {
        if (iAskPlusView != null){
            iAskPlusView = null;
        }
        if (call != null && call.isCanceled()){
            call.cancel();
            call = null;
        }
    }

    public void loadAskPlusList(String sid, String rowNumber, String lastID){
        AskService.getIntence().getApiList(sid, rowNumber, lastID, new CallBackListener<AskPlusListResponse>() {
            @Override
            public void onNetStart() {
                showOrHideLoading(true);
            }

            @Override
            public void onSuccess(AskPlusListResponse askPlusListResponse) {
                showOrHideLoading(false);
                if (iAskPlusView != null){
                    iAskPlusView.refresh(askPlusListResponse);
                }
            }

            @Override
            public void onFailed(AskPlusListResponse askPlusListResponse) {
                showOrHideLoading(false);
            }
        });
    }

    private void showOrHideLoading(boolean flag){

        if (iAskPlusView != null){
            iAskPlusView.showOrHindLoad(flag);
        }
    }



    @Override
    public void loadDada(String sid, String aid, String uid) {

    }
}
