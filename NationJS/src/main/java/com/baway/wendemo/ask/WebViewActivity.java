package com.baway.wendemo.ask;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

import com.baway.wendemo.AppConstants;
import com.baway.wendemo.R;
import com.baway.wendemo.ask.model.bean.UserInfo;
import com.baway.wendemo.base.BaseActivity;
import com.baway.wendemo.utils.ACache;

import butterknife.BindView;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/7/22 17:12
 */

public class WebViewActivity extends BaseActivity {
    @BindView(R.id.webview_info_detial)
    WebView webviewInfoDetial;
    @BindView(R.id.tv_user_title)
    TextView tvUserTitle;
    private String title;

    @Override
    public int getLayoutID() {
        return R.layout.activity_webview;
    }

    @Override
    public void initView() {
        WebSettings webSettings = webviewInfoDetial.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webviewInfoDetial.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.contains("login://")) {
                    Uri uri = Uri.parse(url);
                    String from=uri.getQueryParameter("from");
                    Toast.makeText(WebViewActivity.this,"A:"+from+":A",Toast.LENGTH_LONG).show();
                    UserInfo userInfo = (UserInfo) ACache.get(WebViewActivity.this).getAsObject(AppConstants.CACHE_USERINFO_KEY);

                    if (userInfo != null) {
                        startActivityForResult(new Intent(WebViewActivity.this, LoginActivity.class), AppConstants.RESULT_CODE_KEY);
                    }
                    nativeToHTML(userInfo);
                    return true;
                }
                return false;
            }
        });
        webviewInfoDetial.setWebChromeClient(new WebChromeClient() {

        });
    }

    @Override
    public void initData() {
        if (title != null) {
            tvUserTitle.setText(title);
        }
        initWebView();
    }

    private void initWebView() {
        UserInfo info = (UserInfo) ACache.get(this).getAsObject(AppConstants.CACHE_USERINFO_KEY);
        String baseUrl = "http://169.254.37.104:3000/";
        if (info != null) {
            baseUrl += "?username=" + info.userName;
        }
        webviewInfoDetial.loadUrl(baseUrl);

    }

    @Override
    public void getExtras(Bundle bundle) {
        if (bundle != null) {
            title = bundle.getString(AppConstants.ASKBARPLUS_INTENT_BUNDLE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == AppConstants.RESULT_CODE_KEY) {
            UserInfo userInfo = (UserInfo) ACache.get(this).getAsObject(AppConstants.CACHE_USERINFO_KEY);
            if (userInfo != null) {
                nativeToHTML(userInfo);
            }
        }
    }
    private void nativeToHTML(UserInfo info){
        if (Build.VERSION.SDK_INT>=19) {
            webviewInfoDetial.evaluateJavascript("javascript:nativeToHtml('" + info.userName + "')",null);
        }else {
            webviewInfoDetial.loadUrl("javascript:nativeToHtml('" + info.userName + "')");
        }
    }
}
