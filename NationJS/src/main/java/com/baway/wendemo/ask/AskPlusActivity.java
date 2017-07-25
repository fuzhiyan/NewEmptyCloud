package com.baway.wendemo.ask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.baway.wendemo.AppConstants;
import com.baway.wendemo.R;
import com.baway.wendemo.ask.adapter.MyAdapter;
import com.baway.wendemo.ask.model.bean.AskPlusRequest;
import com.baway.wendemo.ask.presenter.AskPlusPresenter;
import com.baway.wendemo.ask.view.IConfigView;
import com.baway.wendemo.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class AskPlusActivity extends BaseActivity implements IConfigView<AskPlusRequest> {

    @BindView(R.id.list_view)
    ListView listView;
    @BindView(R.id.progress_main)
    ProgressBar progressMain;

    private AskPlusPresenter present;
    private MyAdapter adapter;
    private List<AskPlusRequest.ListBean> list = new ArrayList<>();

    @Override
    public int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                if (list != null && list.size() > 0) {
                    bundle.putString(AppConstants.ASKBARPLUS_INTENT_BUNDLE, list.get(position).title);
                }
                intent.putExtras(bundle);
                intent.setClass(AskPlusActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void initData() {
        present = new AskPlusPresenter("xkycs", "0", "0", this);
        present.start();
    }

    @Override
    public void getExtras(Bundle bundle) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (present != null) {
            present.detachView();
        }
    }

    @Override
    public void showOrHidePregress(boolean flag) {
        if (flag && progressMain != null) {
            progressMain.setVisibility(View.VISIBLE);
        } else {
            if (progressMain != null) {
                progressMain.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void showOrHideErrorView(boolean flag) {

    }

    @Override
    public void refreshView(AskPlusRequest askRequestBean) {

        if (list != null) {
            list.addAll(askRequestBean.list);
        }
        if (askRequestBean != null) {
            if (adapter == null) {
                adapter = new MyAdapter(askRequestBean.list, AskPlusActivity.this);
                listView.setAdapter(adapter);
            } else {
                adapter.notifyDataSetChanged();
            }
        }
    }
}
