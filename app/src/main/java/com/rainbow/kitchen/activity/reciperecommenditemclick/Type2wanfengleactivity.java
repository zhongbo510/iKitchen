package com.rainbow.kitchen.activity.reciperecommenditemclick;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.PlayVideoActivity;
import com.rainbow.kitchen.bean.recipe_recommenditem.MoYaBean;
import com.rainbow.kitchen.constants.MyURL;
import com.rainbow.kitchen.utils.BitmapUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

public class Type2wanfengleactivity extends AppCompatActivity {

    ImageButton img_videoitem;
    String series_id;
    TextView tv_seriesname;
    TextView tv_seriestitle;
    TextView tv_keke_itemtitle;
    ImageView img_seriesimage;
    private String course_video;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=Type2wanfengleactivity.this;
        setContentView(R.layout.activity_type2wanfengleactivity);

        initView();

        if (!series_id.equals("164")) {
            initData();
        }

    }


    private void initView() {
        Intent intent = getIntent();
        series_id = intent.getStringExtra("series_id");

        img_videoitem = (ImageButton) findViewById(R.id.img_videoitem);
        tv_seriesname = (TextView) findViewById(R.id.tv_seriesname);
        tv_seriestitle = (TextView) findViewById(R.id.tv_seriestitle);
        img_seriesimage = (ImageView) findViewById(R.id.img_seriesimage);
        tv_keke_itemtitle= (TextView) findViewById(R.id.keke_itemtitle);

    }

    private void initData() {
        OkHttpUtils.post()
                .addParams("methodName", "CourseSeriesView")
                .addParams("version", "4.33")
                .addParams("series_id", series_id)
                .addParams("user_id", "0")
                .url(MyURL.URL)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        MoYaBean moYaBean = new Gson().fromJson(response, MoYaBean.class);
                        if (moYaBean!=null) {
                            course_video = moYaBean.getData().getData().get(0).getCourse_video();
                            Log.e("course_video",course_video);
                            BitmapUtils.showImageToUser(context, moYaBean.getData().getData().get(0).getCourse_image(), img_videoitem);

                            img_videoitem.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if (course_video != null) {
                                        Log.e("course_video",course_video);
                                        Intent intent = new Intent(context,PlayVideoActivity.class);
                                        intent.putExtra("video", course_video);
                                        startActivity(intent);
                                    }
                                }
                            });

                            tv_seriesname.setText(moYaBean.getData().getData().get(0).getCourse_name());

                            tv_seriestitle.setText(moYaBean.getData().getSeries_title());

                            tv_keke_itemtitle.setText(moYaBean.getData().getAlbum());

                            BitmapUtils.showImageToUser(context,moYaBean.getData().getSeries_image(),img_seriesimage);
                        }

                    }


                });

    }

    //    toolbar回退按钮
    public void backclick(View view) {
        this.finish();
    }
}
