package com.rainbow.kitchen.activity.reciperecommenditemclick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.recipeitemadapters.recommenditemadapter.ChangJingAdapter;
import com.rainbow.kitchen.adapter.recipeitemadapters.recommenditemadapter.ShiCaiAdapter;
import com.rainbow.kitchen.adapter.recipeitemadapters.recommenditemadapter.XinShouAdapter;
import com.rainbow.kitchen.bean.recipe_recommenditem.ChangJing;
import com.rainbow.kitchen.bean.recipe_recommenditem.RecipeType1Item;
import com.rainbow.kitchen.bean.recipe_recommenditem.ShiCaiDaPei;
import com.rainbow.kitchen.bean.recipe_recommenditem.XinShou2;
import com.rainbow.kitchen.callback.GsonCallback;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

public class Recipe_Type1 extends AppCompatActivity {

    RecyclerView recyclerview12;
    TextView textView10;
    private String content;

    //    新手数据
    private List<RecipeType1Item.DataBean.LogosBean> logosBeanList;
    private List<XinShou2.DataBeanX.DataBean> dataBeenList;
    private XinShouAdapter xinShouAdapter;

    //    食材数据
    List<ShiCaiDaPei.DataBeanXX.DataBeanX.DataBean> data;

    public static final String XINSHOU = "新手入门";
    public static final String SHICAI = "食材搭配";
    public static final String CHANGJING = "场景菜谱";
    public static final String MEISHI = "美食直播";
    private List<ChangJing.DataBeanX.DataBean> datachangjing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_type1);

        initView();

        switch (content) {
            case XINSHOU:
//    下载新手入门2数据
                initDataxinshou2();
//    下载新手入门1数据
                initDataxinshou1();
                break;
            case SHICAI:
                //    下载食材数据
                initDatashicai();
                break;
            //    下载场景数据
            case CHANGJING:
                initDatachangjing();
                break;
            case MEISHI:
                //    下载美食数据
                initDatameishi();
                break;
        }

    }

    //    下载美食数据
    private void initDatameishi() {

    }

    //    下载场景数据
    private void initDatachangjing() {
        OkHttpUtils.post()
                .addParams("methodName", "SceneList")
                .addParams("version", "4.40")
                .addParams("page", "1")
                .addParams("size", "20")
                .url(MyURL.URL)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(Recipe_Type1.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        ChangJing changJing = new Gson().fromJson(response, ChangJing.class);
                        datachangjing = changJing.getData().getData();
                        if (datachangjing != null) {
                            ChangJingAdapter changJingAdapter = new ChangJingAdapter(Recipe_Type1.this, datachangjing);
                            recyclerview12.setLayoutManager(new GridLayoutManager(Recipe_Type1.this, 3));
                            recyclerview12.setAdapter(changJingAdapter);
                            changJingAdapter.notifyDataSetChanged();
                        }
                    }
                });
    }

    //    下载食材数据
    private void initDatashicai() {
        OkHttpUtils.post()
                .addParams("methodName", "MaterialSubtype")
                .addParams("version", "4.40")
                .url(MyURL.URL)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(Recipe_Type1.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        ShiCaiDaPei shiCaiDaPei = new Gson().fromJson(response, ShiCaiDaPei.class);
                        data = shiCaiDaPei.getData().getData().get(0).getData();
                        if (data != null) {
                            GridLayoutManager gridLayoutManager = new GridLayoutManager(Recipe_Type1.this, 4);
                            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                                @Override
                                public int getSpanSize(int position) {
                                    int spainsize = 1;
                                    return spainsize;
                                }
                            });
                            recyclerview12.setLayoutManager(gridLayoutManager);
                            recyclerview12.setAdapter(new ShiCaiAdapter(Recipe_Type1.this, data));
                        }
                    }
                });
    }

    private void initView() {
        recyclerview12 = (RecyclerView) findViewById(R.id.recyclerview12);
        textView10 = (TextView) findViewById(R.id.textView10);
        Intent intent = getIntent();
        content = intent.getStringExtra("content");
        if (content != null) {
            textView10.setText(content);
        }
    }

    //    下载新手入门2数据
    private void initDataxinshou2() {
        OkHttpUtils.post()
                .addParams("methodName", "TourIndex")
                .addParams("version", "4.40")
                .addParams("catid", "7")
                .addParams("size", "10")
                .addParams("type", "2")
                .addParams("page", "1")
                .addParams("user_id", "0")
                .url(MyURL.URL)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        Log.e("===classItemdetail=", "----" + response);
                        XinShou2 xinShou2 = new Gson().fromJson(response, XinShou2.class);
                        dataBeenList = xinShou2.getData().getData();
                        if (dataBeenList != null) {
                            recyclerview12.setLayoutManager(new LinearLayoutManager(Recipe_Type1.this));
                            xinShouAdapter = new XinShouAdapter(Recipe_Type1.this, dataBeenList);
                            recyclerview12.setAdapter(xinShouAdapter);
                            xinShouAdapter.notifyDataSetChanged();
                        }
                    }
                });
    }

    //  下载新手入门1数据
    private void initDataxinshou1() {
//        下载数据
        OkHttpUtils.post()
                .addParams("methodName", "TourLogo")
                .addParams("user_id", "0")
                .addParams("version", "4.40")
                .url(MyURL.URL)
                .build()
                .execute(new GsonCallback<RecipeType1Item>() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(Recipe_Type1.this, "  请求失败，" + e.getMessage(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(RecipeType1Item response, int id) {
                        if (response.getData() != null) {
                            logosBeanList = response.getData().getLogos();
                            Log.e("========", logosBeanList.toString() + "===");
                            if (logosBeanList != null && xinShouAdapter != null) {
                                xinShouAdapter.setLogosBeanList(logosBeanList);
                            }
                        }
                    }
                });

    }

    //    左上角返回按钮的监听
    public void recipe_type1back(View view) {
        finish();
    }
}
