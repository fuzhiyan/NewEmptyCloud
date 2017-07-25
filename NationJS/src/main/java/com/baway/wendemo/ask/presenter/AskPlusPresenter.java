package com.baway.wendemo.ask.presenter;

import com.baway.wendemo.ask.model.AskPlusService;
import com.baway.wendemo.ask.model.bean.AskPlusRequest;
import com.baway.wendemo.ask.view.IConfigView;
import com.baway.wendemo.core.net.CallBackLister;

import retrofit2.Call;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 14:10
 */

public class AskPlusPresenter implements IAskPlusPresent {

    private IConfigView configView;
    public String sid;
    public String rowNumber;
    public String lastID;
    private Call<String> call;

    public AskPlusPresenter() {

    }

    public AskPlusPresenter(String sid, String rowNumber, String lastID, IConfigView configView) {
        this.sid = sid;
        this.rowNumber = rowNumber;
        this.lastID = lastID;
        this.configView = configView;
    }

    @Override
    public void start() {
        loadData(0+"", rowNumber, lastID);
    }

    @Override
    public void loadData(String sid, String rowNumber, String lastID) {
        AskPlusService.getInstace().getConfig(sid, rowNumber, lastID, new CallBackLister<AskPlusRequest>() {
            @Override
            public void onNetStart() {
                configView.showOrHidePregress(true);
            }

            @Override
            public void onNetSuccess(AskPlusRequest askRequestBean) {
                if (configView != null) {
                    configView.showOrHidePregress(false);
                    if (askRequestBean != null) {
                        configView.refreshView(askRequestBean);
                    } else {
                        configView.showOrHideErrorView(true);
                    }
                }
            }

            @Override
            public void onNetField(AskPlusRequest askRequestBean) {
                if (askRequestBean != null) {
                    configView.showOrHidePregress(false);
                }
            }
        });
    }

    @Override
    public void detachView() {
        if (configView != null) {
            configView = null;
        }
        if (call != null && call.isCanceled()) {
            call.cancel();
            call=null;
        }
    }

}
