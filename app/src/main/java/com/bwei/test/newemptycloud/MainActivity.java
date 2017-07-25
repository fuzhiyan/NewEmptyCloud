package com.bwei.test.newemptycloud;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bwei.test.newemptycloud.adapter.MyAdapter;
import com.bwei.test.newemptycloud.ask.model.bean.AskPlusListResponse;
import com.bwei.test.newemptycloud.ask.presrnter.AskPresenter;
import com.bwei.test.newemptycloud.ask.view.IAskView;
import com.bwei.test.newemptycloud.base.BaseAtivity;

import java.util.List;

import butterknife.BindView;


public class MainActivity extends BaseAtivity implements IAskView<AskPlusListResponse> {

    private AskPresenter askPlusPresenter;
    private List<AskPlusListResponse.ListBean> askPlusList;

    @BindView(R.id.main_view)
    ListView main_listView;
    private MyAdapter myAdapter;

    @Override
    public int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {

        main_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(MainActivity.this,AskPlusDetailActivity.class));
            }
        });
    }

    @Override
    public void initData() {
        askPlusPresenter = new AskPresenter("xkycs", "0", "0", this);
        askPlusPresenter.start();
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        askPlusPresenter.detachView();
    }

    @Override
    public void showOrHindLoad(boolean flag) {

    }

    @Override
    public void refresh(AskPlusListResponse askPlusListResponse) {

        //将数据显示在listview
        askPlusList = askPlusListResponse.list;
        if (myAdapter == null) {
            myAdapter = new MyAdapter(this, askPlusList);
            main_listView.setAdapter(myAdapter);
        }else {
            myAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void showOrHindError(boolean flag) {

    }

//    class MyAdapter extends BaseAdapter {
//
//        @Override
//        public int getCount() {
//            return list == null ? 0 : list.size();
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return list.get(position);
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//
//            ViewHolde vh = null;
//            if (convertView == null) {
//
//                vh = new ViewHolde();
//                convertView = LayoutInflater.from(MyApplaction.myApplaction).inflate(R.layout.list_item, null);
//                vh.textView = (TextView) convertView.findViewById(R.id.main_ask_listitem_text);
//                convertView.setTag(vh);
//
//            }else{
//                vh= (ViewHolde) convertView.getTag();
//            }
//            vh.textView.setText(list.get(position).title);
//            return convertView;
//        }
//    }
//
//    private class ViewHolde {
//        private TextView textView;
//    }
}
