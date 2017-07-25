package com.bwei.test.newemptycloud;

import android.widget.TextView;

import com.bwei.test.newemptycloud.ask.model.bean.AskPlusDetailResPonse;
import com.bwei.test.newemptycloud.ask.presrnter.AskPlusDetailPresenter;
import com.bwei.test.newemptycloud.ask.view.IAskView;
import com.bwei.test.newemptycloud.base.BaseAtivity;

import butterknife.BindView;

/**
 * Created by Administrator on 2017/7/15.
 * time:
 * author:付智焱
 */

public class AskPlusDetailActivity extends BaseAtivity implements IAskView<AskPlusDetailResPonse> {
    @BindView(R.id.askactivity_detail)
    TextView textView;

    @Override
    public int getLayoutID() {
        return R.layout.activity_askplusdetail;
    }

    @Override
    public void initView() {


    }

    @Override
    public void initData() {

        AskPlusDetailPresenter askPlusDetailPresenter = new AskPlusDetailPresenter(this);
        askPlusDetailPresenter.loadDada("xkycs", "468", "");
    }

    @Override
    public void showOrHindLoad(boolean flag) {

    }

    @Override
    public void refresh(AskPlusDetailResPonse askPlusDetailResPonse) {

        if (askPlusDetailResPonse != null && askPlusDetailResPonse.model != null) {
            textView.setText(askPlusDetailResPonse.model.title);
        }

    }


    @Override
    public void showOrHindError(boolean flag) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
