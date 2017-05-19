package com.rainbow.kitchen.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.RecipeAdapter;
import com.rainbow.kitchen.bean.ExpertDetalis;
import com.rainbow.kitchen.bean.NormalPlayer;
import com.rainbow.kitchen.constants.MyURL;
import com.rainbow.kitchen.fragment.expert.Attention;
import com.rainbow.kitchen.fragment.expert.Fans;
import com.rainbow.kitchen.fragment.expert.Production;
import com.rainbow.kitchen.utils.DisplayUtils;
import com.rainbow.kitchen.utils.GlideCircleTransform;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

public class ExpertDetalisActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ViewPager vp_exprtdetalishead;
    private TabLayout tab_exprtdetalishead;
    private Toolbar toolbar_exprtdetalishead;
    private TextView exprtdetalishead_nick, exprtdetalishead_content;
    private ImageView exprtdetalishead_iv, exprtdetalishead_head;
    private List<ExpertDetalis.DataBeanX> data;
    private List<Fragment> fragmentList;
    private List<String> tabitem;
    private String user_id;
    private Fragment fragment1, fragment2, fragment3;
    private String nick = "nick";
    private int page = 1;
    private RecipeAdapter adapter01;
    private boolean normalplayer = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                , WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏

        setContentView(R.layout.exprtdetalishead);

        initView();

        //设置tablayout与viewpager联动
        getTab();
    }

    private void initView() {
        vp_exprtdetalishead = (ViewPager) findViewById(R.id.vp_exprtdetalishead);
        tab_exprtdetalishead = (TabLayout) findViewById(R.id.tab_exprtdetalishead);
        exprtdetalishead_nick = (TextView) findViewById(R.id.exprtdetalishead_nick);
        exprtdetalishead_content = (TextView) findViewById(R.id.exprtdetalishead_content);
        exprtdetalishead_iv = (ImageView) findViewById(R.id.exprtdetalishead_iv);
        exprtdetalishead_head = (ImageView) findViewById(R.id.exprtdetalishead_head);
        toolbar_exprtdetalishead = (Toolbar) findViewById(R.id.toolbar_exprtdetalishead);

        data = new ArrayList<>();
        fragmentList = new ArrayList<>();
        tabitem = new ArrayList<>();
        Intent intent = getIntent();
        user_id = intent.getStringExtra("user_id");
        getdata();
    }

    //获取数据
    public void getdata() {
        if(!normalplayer){
            OkHttpUtils.post()
                    .url(MyURL.URL)
                    .addParams("methodName", "ShequUlist")
                    .addParams("size", "20")
                    .addParams("page", page + "")
                    .addParams("visitor_id", user_id)
                    .addParams("version", "4.40")
                    .build()
                    .execute(new StringCallback() {
                        @Override
                        public void onError(Call call, Exception e, int id) {
                            Toast.makeText(ExpertDetalisActivity.this, "请求失败", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onResponse(String response, int id) {
                            if (null != response) {
                                ExpertDetalis e = new Gson().fromJson(response, ExpertDetalis.class);
                                if (e != null) {
                                    data.add(e.getData());
                                    if (data.get(0).getData().size() != 0) {
                                        nick = data.get(0).getData().get(0).getNick();

                                        Glide.with(ExpertDetalisActivity.this)
                                                .load(data.get(0).getData().get(0).getHead_img())
                                                .placeholder(R.mipmap.ic_launcher)
                                                .error(R.mipmap.food)
                                                .override(DisplayUtils.getScreenWidth(ExpertDetalisActivity.this) / 3, DisplayUtils.getScreenHeight(ExpertDetalisActivity.this)/4)
                                                .transform(new GlideCircleTransform(ExpertDetalisActivity.this))
                                                .skipMemoryCache(true)
                                                .into(exprtdetalishead_head);

                                        Glide.with(ExpertDetalisActivity.this)
                                                .load(data.get(0).getData().get(0).getImage())
                                                .placeholder(R.mipmap.ic_launcher)
                                                .error(R.mipmap.food)
                                                .skipMemoryCache(true)
                                                .into(exprtdetalishead_iv);

                                        initToolbar();
                                        exprtdetalishead_nick.setText(nick);
                                        exprtdetalishead_content.setText(data.get(0).getData().get(0).getContent());
                                    }else {
                                        normalplayer = true;
                                        getdata();
                                    }
                                }
                                adapter01.notifyDataSetChanged();
                            }
                        }
                    });
        }else {
            OkHttpUtils.post()
                    .url(MyURL.URL)
                    .addParams("methodName", "UserInfo")
                    .addParams("visitor_id", user_id)
                    .addParams("version", "4.40")
                    .build()
                    .execute(new StringCallback() {
                        @Override
                        public void onError(Call call, Exception e, int id) {
                            Toast.makeText(ExpertDetalisActivity.this, "请求失败", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onResponse(String response, int id) {
                            if (null != response){
                                NormalPlayer n = new Gson().fromJson(response,NormalPlayer.class);
                                nick = n.getData().getNickname();
                                String con = n.getData().getDeclaration();
                                initToolbar();
                                if(null != con){
                                    exprtdetalishead_content.setText(con);
                                }else {
                                    exprtdetalishead_content.setText("这家伙很懒，什么都没有写");
                                }
                                Glide.with(ExpertDetalisActivity.this)
                                        .load(n.getData().getHeadphoto())
                                        .placeholder(R.mipmap.ic_launcher)
                                        .error(R.mipmap.food)
                                        .override(DisplayUtils.getScreenWidth(ExpertDetalisActivity.this) / 3, DisplayUtils.getScreenHeight(ExpertDetalisActivity.this)/4)
                                        .transform(new GlideCircleTransform(ExpertDetalisActivity.this))
                                        .skipMemoryCache(true)
                                        .into(exprtdetalishead_head);


                                exprtdetalishead_iv.setImageResource(R.mipmap.owner_top_bg);
                            }
                        }
                    });
        }

    }

    public void exprtdetalisheadback(View view) {
        finish();
    }

    public void getTab() {
        fragment1 = new Production();
        fragment2 = new Attention();
        fragment3 = new Fans();

        fragmentList.add(fragment1);
        fragmentList.add(fragment2);
        fragmentList.add(fragment3);

        Bundle bundle = new Bundle();
        String strValue = user_id;
        bundle.putString("str", strValue);
        fragment1.setArguments(bundle);
        fragment2.setArguments(bundle);
        fragment3.setArguments(bundle);

        tabitem.add("作品");
        tabitem.add("关注");
        tabitem.add("粉丝");

        adapter01 = new RecipeAdapter(getSupportFragmentManager(), tabitem, fragmentList);
        vp_exprtdetalishead.setAdapter(adapter01);
        tab_exprtdetalishead.setupWithViewPager(vp_exprtdetalishead);

        adapter01.notifyDataSetChanged();
    }

    private void initToolbar() {
        Toolbar tb = (Toolbar) findViewById(R.id.toolbar_exprtdetalishead);
        tb.setTitle(nick);
        tb.setBackgroundColor(Color.parseColor("#303C3F41"));
        setSupportActionBar(tb);
        //设置返回图标点击事件。//一定要在上面方法绑定后才设置
        tb.setNavigationIcon(R.drawable.ic_back);
        tb.setTitleTextColor(Color.parseColor("#ffffff"));
        tb.setSubtitleTextColor(Color.parseColor("#ffffff"));
        tb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
