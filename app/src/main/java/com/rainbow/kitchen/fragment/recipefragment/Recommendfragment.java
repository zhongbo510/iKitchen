package com.rainbow.kitchen.fragment.recipefragment;


import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.recipeitemadapters.BannerAdapter;
import com.rainbow.kitchen.callback.GsonCallback;
import com.rainbow.kitchen.adapter.recipeitemadapters.RecommendAdapter;
import com.rainbow.kitchen.bean.Recommend;
import com.rainbow.kitchen.constants.MyURL;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.ArrayList;
import java.util.List;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;
import okhttp3.Call;

/**
 * 食谱推荐页
 * A simple {@link Fragment} subclass.
 */
public class Recommendfragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener, AdapterView.OnItemClickListener {

    AutoScrollViewPager autoScrollViewPager;
    LinearLayout layout_points;
    private  BannerAdapter myAdAdapter;
    //    食谱里面的推荐的适配器
    private RecommendAdapter recommendAdapter;
    private List<Recommend.DataBean.BannerBean> pager=new ArrayList<>();
    private List<Recommend.DataBean.WidgetListBean> widgetListBeendata=new ArrayList<>();
    private RecyclerView recyclerView;
    private SwipeRefreshLayout mSwipeLayout;
    Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context =context;
    }

    public Recommendfragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layou_test, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.rc_v);
        View headView =inflater.inflate(R.layout.layout_home_adhead,null);
        autoScrollViewPager= (AutoScrollViewPager) headView.findViewById(R.id.hdviewPager);
        layout_points= (LinearLayout) headView.findViewById(R.id.layoutIcons);

        mSwipeLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_container);
        //绑定刷新时间
        mSwipeLayout.setOnRefreshListener(this);
        //设置颜色
        mSwipeLayout.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light, android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

        getvgdata();


//recyclerview的布局管理器
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

//        新建食材适配器，传数据源和上下文过去
        recommendAdapter = new RecommendAdapter(context,widgetListBeendata);

//        适配器中添加头部，把headview传过去
        recommendAdapter.addHeader(headView);

//        绑定适配器
        recyclerView.setAdapter(recommendAdapter);
        //广告滑动监听
        SetAdlistener();
//        返回生成的界面
        return view;
    }

    //广告滑动监听
    private void SetAdlistener() {
        autoScrollViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                Log.i("=====","----"+position);
                //根据布局容器得到其中的所有child
                if (pager.size() != 0) {
                    //根据布局容器得到其中的所有child
                    int count = layout_points.getChildCount();
                    for (int i = 0; i < count; i++) {
                        ImageView imgPoint = (ImageView) layout_points.getChildAt(i);
                        if (i == position) {
                            imgPoint.setImageResource(R.drawable.perssed_point);
                        } else {
                            imgPoint.setImageResource(R.drawable.default_point);
                        }
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    //设置广告图片
    private void setHead() {
        List<View> views = new ArrayList<>();
        for (int i = 0; i < pager.size(); i++) {
            //加载原图
            ImageView img = new ImageView(getActivity());
            img.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Glide.with(getActivity())
                    .load(pager.get(i).getBanner_picture())
                    .centerCrop()
                    .placeholder(R.mipmap.sxms)
                    .into(img);
            views.add(img);

            //加载原点(指示器)
            ImageView imgPoint = new ImageView(context);

            //默认选中第一个
            if (i == 0) {
                imgPoint.setImageResource(R.drawable.perssed_point);
            } else {
                imgPoint.setImageResource(R.drawable.default_point);
            }
            imgPoint.setPadding(5, 0, 5, 0);

            layout_points.addView(imgPoint);
        }

        myAdAdapter =  new BannerAdapter(views,context);
        autoScrollViewPager.setAdapter(myAdAdapter);
        //启动自动轮播功能
        autoScrollViewPager.startAutoScroll();
        //手触摸停止自动滚动，一旦手放开继续自动滑动；默认开启的；
        autoScrollViewPager.setStopScrollWhenTouch(true);
        //默认循环轮播
        autoScrollViewPager.setCycle(true);
        //设置图片轮播的间隔时间
        autoScrollViewPager.setInterval(3000);

    }


    //下载解析数据
    private void getvgdata() {
        pager.clear();
        OkHttpUtils.post()
                .addParams("methodName","SceneHome")
                .addParams("version","4.40")
                .url(MyURL.URL)
                .build()
                .execute(new GsonCallback<Recommend>() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Log.e("hhh", "GsonCallback error==" + e.getMessage());
                        Toast.makeText(getActivity(), "  请求失败，" + e.getMessage(), Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onResponse(Recommend response, int id) {
                        Log.e("aaa","==="+response.getData());
                        if (response.getData().getBanner()!=null&&response.getData().getWidgetList()!=null){
                            pager.addAll(response.getData().getBanner());
                            setHead();
                            widgetListBeendata.addAll(response.getData().getWidgetList());
                            recommendAdapter.notifyDataSetChanged();
                            // pager.clear();
                            Log.i("=dadada==","===="+"成功");
                        } else {
                            Log.e("hhh", "response is null");
                        }
                    }

                });
    }


    // TODO: 2016/12/27
    //listview的点击监听事件
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
       /* Intent intent=new Intent(getActivity(), DetailActivity.class);
       // intent.putExtra("data",datalist.get(position-1));
        Log.i("===", "onItemClick: "+i);
       context.startActivity(intent);*/
    }

    //    刷新控件执行刷新的方法
    @Override
    public void onRefresh() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //pager.clear();
                //getvgdata();
                recommendAdapter.notifyDataSetChanged();
//                这里没网的时候会报空指针崩溃，所以try，catch一下，
                try {
                    myAdAdapter.notifyDataSetChanged();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //停止刷新
                mSwipeLayout.setRefreshing(false);
            }
        }, 3000);
    }
}

