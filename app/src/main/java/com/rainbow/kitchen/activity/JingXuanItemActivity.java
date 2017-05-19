package com.rainbow.kitchen.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.recipe_recommenditem.JingXuanItem;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;


import cn.sharesdk.framework.ShareSDK;
import okhttp3.Call;

public class JingXuanItemActivity extends AppCompatActivity {

    private TextView tv_content,tv_name,tv_time;
    private ImageView Jxshare,img_jxitem,iv_head;
    private String[] postid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jing_xuan);
        ShareSDK.initSDK(this,"1aa924c8e0be4");
        tv_content= (TextView) findViewById(R.id.tv_content);
        tv_name= (TextView) findViewById(R.id.tv_name);
        tv_time= (TextView) findViewById(R.id.tv_time);
        Jxshare= (ImageView) findViewById(R.id.Jxshare);
        img_jxitem= (ImageView) findViewById(R.id.img_jxitem);
        iv_head= (ImageView) findViewById(R.id.iv_head);
        Intent intent=getIntent();
        String link=intent.getStringExtra("link");
        postid=link.split("#");
        Log.e("postid++长度","=="+postid.length);
        loadData();
    }

    public void backOnClick(View view){
        this.finish();
    }

    public void loadData(){
        OkHttpUtils.post()
                .addParams("methodName","ShequPostview")
                .addParams("post_id",postid[1])
                .addParams("version","4.40")
                .url(MyURL.URL)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        JingXuanItem jingXuanItem=new Gson().fromJson(response,JingXuanItem.class);
                        if(response!=null){
                            Glide.with(JingXuanItemActivity.this)
                                    .load(jingXuanItem.getData().getImage())
                                    .skipMemoryCache(true)
                                    .centerCrop()
                                    .into(img_jxitem);
                            Glide.with(JingXuanItemActivity.this)
                                    .load(jingXuanItem.getData().getHead_img())
                                    .skipMemoryCache(true)
                                    .centerCrop()
                                    .into(iv_head);
                            tv_content.setText(jingXuanItem.getData().getContent());
                            tv_name.setText(jingXuanItem.getData().getNick());
                            tv_time.setText(jingXuanItem.getData().getCreate_time());
                            Jxshare.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    com.rainbow.kitchen.utils.ShareSDK.share(JingXuanItemActivity.this);
                                }
                            });
                        }
                    }
                });
    }
}
