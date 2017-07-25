package com.baway.wendemo.ask.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.baway.wendemo.R;
import com.baway.wendemo.ask.model.bean.AskPlusRequest;

import java.util.List;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/14 16:34
 */

public class MyAdapter extends BaseAdapter {
    private List<AskPlusRequest.ListBean> list;
    private Context context;

    public MyAdapter(List<AskPlusRequest.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list != null ? list.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return list != null ? list.get(position) : 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(context, R.layout.item_main_list, null);
            holder.textView = (TextView) convertView.findViewById(R.id.item_list_text);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(list.get(position).title);
        return convertView;

    }

    static class ViewHolder {
        TextView textView;
    }

}
