package com.bwei.test.newemptycloud.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bwei.test.newemptycloud.R;
import com.bwei.test.newemptycloud.ask.model.bean.AskPlusListResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 * time:
 * author:付智焱
 */

public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<AskPlusListResponse.ListBean> list=new ArrayList<>();

    public MyAdapter(Context context, List<AskPlusListResponse.ListBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolde vh = null;
        if (convertView == null) {

            vh = new ViewHolde();
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
            vh.textView = (TextView) convertView.findViewById(R.id.main_ask_listitem_text);
            convertView.setTag(vh);

        }else{
            vh= (ViewHolde) convertView.getTag();
        }
        vh.textView.setText(list.get(position).title);
        return convertView;
    }
    class ViewHolde {
        private TextView textView;
    }
}
