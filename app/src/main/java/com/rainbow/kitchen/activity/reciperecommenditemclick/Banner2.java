package com.rainbow.kitchen.activity.reciperecommenditemclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.recipeitemadapters.recommenditemadapter.Banner2Adapter;
import com.rainbow.kitchen.bean.recipe_recommenditem.Banner_2Bean;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

public class Banner2 extends AppCompatActivity {

    RecyclerView recyclerView66;
    private List<Banner_2Bean.DataBeanX.DataBean> data;
    private Banner2Adapter banner2Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner2);

        recyclerView66 = (RecyclerView) findViewById(R.id.recyclerView66);

        initData();

    }

    private void initData() {
        OkHttpUtils.post()
                .url(MyURL.URL)
                .addParams("methodName", "CourseSeriesView")
                .addParams("size", "20")
                .addParams("series_id", "73")
                .addParams("version", "4.40")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(Banner2.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Banner_2Bean banner_2Bean = new Gson().fromJson(response, Banner_2Bean.class);
                        data = banner_2Bean.getData().getData();

                        if (data!=null) {
                            recyclerView66.setLayoutManager(new LinearLayoutManager(Banner2.this));
                            banner2Adapter = new Banner2Adapter(data, Banner2.this);
                            recyclerView66.setAdapter(banner2Adapter);
                            banner2Adapter.notifyDataSetChanged();
                        }
                    }
                });
    }
}
