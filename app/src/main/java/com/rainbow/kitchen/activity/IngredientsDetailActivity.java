package com.rainbow.kitchen.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.RecipeAdapter;
import com.rainbow.kitchen.bean.IngredientsDetailBean;
import com.rainbow.kitchen.callback.GsonCallback;
import com.rainbow.kitchen.constants.MyURL;
import com.rainbow.kitchen.fragment.recipefragment.ingredientsdetail.Functionalfragment;
import com.rainbow.kitchen.fragment.recipefragment.ingredientsdetail.Nutritionfragment;
import com.rainbow.kitchen.fragment.recipefragment.ingredientsdetail.Pickfragment;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * 食材详请页面
 */

public class IngredientsDetailActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private FloatingActionButton fab;
    private ViewPager vp;
    private TabLayout tabLayout;
    private ImageView imageView;
    private IngredientsDetailBean.DataBean databean;
    String id,img,title;
    private RecipeAdapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN
                , WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏

        setContentView(R.layout.activity_ingredients_detail);
        vp = (ViewPager) findViewById(R.id.vp);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        imageView= (ImageView) findViewById(R.id.sc_image);
        //接受点击传来的数据
        Intent intent=getIntent();
        id= intent.getStringExtra("id");
        img= intent.getStringExtra("img");
        title= intent.getStringExtra("title");
        getvgdata();
        //设置tablayout与viewpager联动
        getTab();

       //获取数据
        getinitent();
        initToolbar();
        setFabListen();
    }

    //监听点击Fab跳转播放视频
    private void setFabListen() {
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //点击播放视频
                Intent intent=new Intent(IngredientsDetailActivity.this,PlayVideoActivity.class);
                intent.putExtra("video",databean.getVideo());
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });
    }

    //tab与viewpager联动
    private void getTab() {
        List<Fragment> fragmentList = new ArrayList<>();
            fragmentList.add(new Pickfragment());
            fragmentList.add(new Nutritionfragment());
            fragmentList.add(new Functionalfragment());

        List<String>tabitem=new ArrayList<>();
            tabitem.add("选购要诀");
            tabitem.add("营养功效");
            tabitem.add("实用百科");

    for (int i = 0; i < tabitem.size(); i++) {
        Fragment fragment = fragmentList.get(i);
        if (databean!=null){
            Bundle bundle=new Bundle();
           // bundle.putString("data",databean.getPick());
            bundle.putSerializable("data",databean);
            fragment.setArguments(bundle);
            fragmentList.add(fragment);
        }

    }
        myadapter=new RecipeAdapter(getSupportFragmentManager(),tabitem,fragmentList);
        vp.setAdapter(myadapter);
        tabLayout.setupWithViewPager(vp);

        myadapter.notifyDataSetChanged();


    }
//控件设置值
    private void getinitent() {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (img!=null){
            Glide.with(this)
                    .load(img)
                    .centerCrop()
                    .placeholder(R.mipmap.ic_launcher)
                    .into(imageView);
        }

    }

    //使用Toolbar，必须这样做
    private void initToolbar() {
        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        tb.setTitle(title);
        /*tb.setTitleTextColor(Color.parseColor("#3C3F41"));*/
        tb.setBackgroundColor(Color.parseColor("#303C3F41"));
        setSupportActionBar(tb);
       //设置返回图标点击事件。//一定要在上面方法绑定后才设置
        tb.setNavigationIcon(R.drawable.ic_back);
        tb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    //获取数据
    private void getvgdata() {
        OkHttpUtils.post()
                .addParams("methodName","MaterialView")
                .addParams("material_id",id)
                .addParams("version","4.40")
                .url(MyURL.URL)
                .build()
                .execute(new GsonCallback<IngredientsDetailBean>() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toast.makeText(getApplicationContext(), "  请求失败，" + e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                    @Override
                    public void onResponse(IngredientsDetailBean response, int id) {
                        if (response.getData()!=null){
                            databean=response.getData();
                        }else {
                            Log.e("hhh", "response is null");
                        }
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
