package com.rainbow.kitchen.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.FoodsItem;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import cn.sharesdk.framework.ShareSDK;
import okhttp3.Call;


public class FunItemDetailActivity extends AppCompatActivity {


    private TextView textView,fun_itemnum,fun_itemname,itemdecrible;
    private ImageView img_funitem,funitemplay,fun_itemshare;
    private int seriesid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funitemdetail);
        ShareSDK.initSDK(this,"1aa924c8e0be4");
        textView= (TextView) findViewById(R.id.fun_itemtitle);
        fun_itemnum= (TextView) findViewById(R.id.fun_itemnum);
        fun_itemname= (TextView) findViewById(R.id.fun_itemname);
        itemdecrible= (TextView) findViewById(R.id.itemdecrible);
        img_funitem= (ImageView) findViewById(R.id.img_funitem);
        funitemplay= (ImageView) findViewById(R.id.funitemplay);
        fun_itemshare= (ImageView) findViewById(R.id.fun_itemshare);
        Intent intent=getIntent();
        seriesid=intent.getIntExtra("series_id",seriesid);
        String series_name=intent.getStringExtra("series_name");
        textView.setText(series_name.toString());
        getItemFoodData();

    }


    public void backOnClick(View view){
        this.finish();
    }

    public void getItemFoodData(){

        OkHttpUtils.post()
                .addParams("methodName","CourseSeriesView")
                .addParams("version","4.40")
                .addParams("series_id", String.valueOf(seriesid))
                .url(MyURL.URL)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        FoodsItem foodsItem=new Gson().fromJson(response,FoodsItem.class);
                        final List<FoodsItem.DataBeanX.DataBean> dataBeen= foodsItem.getData().getData();
                        if(dataBeen!=null){

                            Glide.with(FunItemDetailActivity.this)
                                    .load(dataBeen.get(id).getCourse_image())
                                    .skipMemoryCache(true)
                                    .into(img_funitem);
                            fun_itemnum.setText("上课人数:"+dataBeen.get(0).getVideo_watchcount());
                            fun_itemname.setText(dataBeen.get(0).getCourse_name());
                            itemdecrible.setText(dataBeen.get(0).getCourse_subject());
                            funitemplay.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    String videoUrl=dataBeen.get(0).getCourse_video();
                                    Intent intent=new Intent(FunItemDetailActivity.this,PlayVideoActivity.class);
                                    intent.putExtra("video",videoUrl);
                                    startActivity(intent);
                                }
                            });

                            fun_itemshare.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    fun_itemshare.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            com.rainbow.kitchen.utils.ShareSDK.share(FunItemDetailActivity.this);
                                        }
                                    });
                                }
                            });
                        }
                    }

                });
    }


}
