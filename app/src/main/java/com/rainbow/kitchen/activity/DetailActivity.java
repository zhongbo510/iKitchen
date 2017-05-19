package com.rainbow.kitchen.activity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.Recommend;
public class DetailActivity extends BaseActivity {

    String path = "http://h5.izhangchu.com/activity/view.html?&id=178";
    WebView webView;
    ProgressBar progressBar;
    Recommend.DataBean.BannerBean componentBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_detail);
        findView();
        /*String sourceId = getIntent().getStringExtra("sourceId");
        componentBean = (Recommend.DataBean.BannerBean) getIntent().getSerializableExtra("bean");
        setTv_title(componentBean.getBanner_title());
         String url = String.format(path, sourceId);
        */
        setTv_title("掌厨123456");
        webView.loadUrl(path);
    }

    public void findView(){
        webView = (WebView) findViewById(R.id.webView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        //设置攻略信息网页
        WebSettings webSettings = webView.getSettings();
        //为了使webview里面的内容自动适应
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        //设置WebView属性，能够执行Javascript脚本
        webSettings.setJavaScriptEnabled(true);
        //设置可以访问文件
        webSettings.setAllowFileAccess(true);
        //设置支持缩放
        webSettings.setBuiltInZoomControls(true);
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                progressBar.setProgress(newProgress);
                if (newProgress == 100) {
                    progressBar.setVisibility(View.GONE);
                }
            }
        });
    }

}
