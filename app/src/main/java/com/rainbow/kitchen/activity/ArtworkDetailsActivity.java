package com.rainbow.kitchen.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.detalisadapter.DetailsAdapter;
import com.rainbow.kitchen.bean.Detalis;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

public class ArtworkDetailsActivity extends AppCompatActivity {

    private String post_id;
    private List<Detalis.DataBean> data;
    private DetailsAdapter adapter;
    private RecyclerView artworkdetails_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artwork_details);
        initdata();
    }

    public void initdata() {
        artworkdetails_rv = (RecyclerView) findViewById(R.id.artworkdetails_rv);
        artworkdetails_rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        data = new ArrayList<>();
        Intent intent = getIntent();
        post_id = intent.getStringExtra("post_id");
        getdata();
        adapter = new DetailsAdapter(this,data);
        artworkdetails_rv.setAdapter(adapter);
    }

    public void getdata(){
        OkHttpUtils.post()
                .url(MyURL.URL)
                .addParams("post_id",post_id)
                .addParams("methodName","ShequPostview")
                .addParams("version","4.40")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(ArtworkDetailsActivity.this, "请求失败", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        if (null != response){
                            Detalis d = new Gson().fromJson(response,Detalis.class);
                            data.add(d.getData());
                            data.add(d.getData());
                            data.add(d.getData());
                            data.add(d.getData());
                            data.add(d.getData());
                            adapter.notifyDataSetChanged();
                        }
                    }
                });
    }

    public void back(View view) {
        finish();
    }
}
