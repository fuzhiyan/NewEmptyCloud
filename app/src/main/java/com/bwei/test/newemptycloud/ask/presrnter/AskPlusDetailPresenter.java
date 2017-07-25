package com.bwei.test.newemptycloud.ask.presrnter;

import com.bwei.test.newemptycloud.ask.model.AskService;
import com.bwei.test.newemptycloud.ask.model.bean.AskPlusDetailResPonse;
import com.bwei.test.newemptycloud.ask.view.IAskView;
import com.bwei.test.newemptycloud.core.net.CallBackListener;

import retrofit2.Call;

/**
 * Created by Administrator on 2017/7/15.
 * time:
 * author:付智焱
 */

public class AskPlusDetailPresenter implements IAskPresenter {

    IAskView iAskView;
    Call<String> call;

    public AskPlusDetailPresenter(IAskView iAskView){
        this.iAskView=iAskView;
    }
    @Override
    public void start() {


    }

    @Override
    public void detachView() {
        if(iAskView!=null){
            iAskView=null;
        }

        if (call != null && call.isCanceled()) {
            call.cancel();
            call=null;
        }
    }


    @Override
    public void loadDada(String sid, String aid, String uid) {

        call = AskService.getIntence().getAskDetail(sid, aid, uid, new CallBackListener<AskPlusDetailResPonse>() {
            @Override
            public void onNetStart() {

                showOrHindProgress(true);
            }

            @Override
            public void onSuccess(AskPlusDetailResPonse result) {

                showOrHindProgress(false);
                if(iAskView!=null){
                    iAskView.refresh(result);
                }
            }

            @Override
            public void onFailed(AskPlusDetailResPonse result) {

            }
        });
    }
    public void showOrHindProgress(boolean flag){
        if(iAskView!=null){

            iAskView.showOrHindLoad(flag);
        }
    }
}
