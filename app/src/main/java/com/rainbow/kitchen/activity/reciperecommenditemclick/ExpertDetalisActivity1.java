package com.rainbow.kitchen.activity.reciperecommenditemclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.ExpertDetalisActivity;
import com.rainbow.kitchen.bean.ExpertDetalis;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Call;

import static android.R.attr.data;

public class ExpertDetalisActivity1 extends AppCompatActivity {

    RecyclerView recyclerView18;
    private String page="1";
    private String user_id;
    private List<ExpertDetalis.DataBeanX> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expert_detalis1);

        recyclerView18= (RecyclerView) findViewById(R.id.recyclerView18);

        initData();
    }

    private void initData() {
        Intent intent=getIntent();
        user_id = intent.getStringExtra("user_id");

        OkHttpUtils.post()
                .url(MyURL.URL)
                .addParams("methodName","ShequUlist")
                .addParams("size","20")
                .addParams("page",page)
                .addParams("visitor_id",user_id)
                .addParams("version","4.40")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(ExpertDetalisActivity1.this, "请求失败", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        if (null != response){
                            ExpertDetalis e = new Gson().fromJson(response,ExpertDetalis.class);
                            Log.e("ExpertDetalisActivity1",response.toString());
                        }
                    }
                });
    }
}
