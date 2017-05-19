package com.rainbow.kitchen.fragment.recipefragment.recommenditems;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.rainbow.kitchen.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BannerItemfragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    WebView myWebView;
    ProgressBar progressBar;
    SwipeRefreshLayout swipeRefreshLayout;

    public BannerItemfragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_banner_itemfragment, container, false);

        myWebView = (WebView) view.findViewById(R.id.webView);
        progressBar = (ProgressBar) view.findViewById(R.id.progressBar2);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_container1);


 //        webview初始化数据
        initData();


        return view;
    }


    private void initData() {
        //      设置刷新控件颜色,绑定刷新监听
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light, android.R.color.holo_orange_light,
                android.R.color.holo_red_light);


//        webview下载数据
        myWebView.loadUrl("file:///android_asset/Banneritem.html");
        //添加javaScript支持
        myWebView.getSettings().setJavaScriptEnabled(true);
        //取消滚动条
        myWebView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        //触摸焦点起作用
        myWebView.requestFocus();
        //点击链接继续在当前browser中响应
        myWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        //设置进度条
        myWebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                if (progressBar.getVisibility() == View.INVISIBLE) {
                    progressBar.setVisibility(View.VISIBLE);
                }
                progressBar.setProgress(newProgress);
                if (newProgress == 100) {
                    //隐藏进度条
                    swipeRefreshLayout.setRefreshing(false);
                    progressBar.setVisibility(View.INVISIBLE);
                } else {
                    if (!swipeRefreshLayout.isRefreshing())
                        swipeRefreshLayout.setRefreshing(true);
                }
                super.onProgressChanged(view, newProgress);
            }
        });
    }


    //刷新控件监听事件重写方法
    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                myWebView.loadUrl("file:///android_asset/Banneritem.html");
                swipeRefreshLayout.setRefreshing(false);
            }
        }, 3000);
    }



}
