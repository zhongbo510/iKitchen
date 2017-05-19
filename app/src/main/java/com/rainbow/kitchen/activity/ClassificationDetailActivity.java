package com.rainbow.kitchen.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.recipeitemadapters.classificationadapter.ClassificationItemAdapter;
import com.rainbow.kitchen.bean.ClassificationItem;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

public class ClassificationDetailActivity extends AppCompatActivity {

    private TextView textView;
    private RecyclerView rcv_classifidetail;
    private ClassificationItemAdapter adapter;
    private List<ClassificationItem.DataBeanX.DataBean> dataBeanList;
    String cat_id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classification_detail);
        textView= (TextView) findViewById(R.id.tv_classifidetail);
        Intent intent=getIntent();
        cat_id=intent.getStringExtra("id");
        textView.setText(intent.getStringExtra("text"));
        rcv_classifidetail= (RecyclerView) findViewById(R.id.rcv_classifidetail);
        rcv_classifidetail.setLayoutManager(new LinearLayoutManager(this));
        loadClassificationitemData();
        dataBeanList=new ArrayList<>();
        adapter=new ClassificationItemAdapter(this,dataBeanList);
        rcv_classifidetail.setAdapter(adapter);


    }

    public void backOnClick(View view){
       this.finish();
    }



    public void loadClassificationitemData(){
        OkHttpUtils.post()
                .addParams("methodName","CategorySearch")
                .addParams("version","4.40")
                .addParams("cat_id",cat_id)
                .addParams("size","20")
                .addParams("type","1")
                .addParams("page","1")
                .url(MyURL.URL)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {

                        Log.e("===classItemdetail=","----"+response);
                        ClassificationItem classificationItem=new Gson().fromJson(response,ClassificationItem.class);
                        List<ClassificationItem.DataBeanX.DataBean> dataBeen=classificationItem.getData().getData();
                        if (dataBeen!=null){
                            dataBeanList.addAll(dataBeen);
                            adapter.notifyDataSetChanged();
                        }
                    }
                });
    }
}
