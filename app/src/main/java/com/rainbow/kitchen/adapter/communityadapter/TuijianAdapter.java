package com.rainbow.kitchen.adapter.communityadapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.ArtworkDetailsActivity;
import com.rainbow.kitchen.activity.ExpertDetalisActivity;
import com.rainbow.kitchen.adapter.recipeitemadapters.BannerAdapter;
import com.rainbow.kitchen.bean.Tuijian;
import com.rainbow.kitchen.callback.OnTuijian01ItemClickListener;
import com.rainbow.kitchen.callback.OnTuijian02ItemClickListener;

import java.util.ArrayList;
import java.util.List;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;

/**
 * Created by Administrator on 2017.1.4.
 */

public class TuijianAdapter extends RecyclerView.Adapter<TuijianAdapter.MyViewHolder> {

    private List<Tuijian.DataBeanX> data;
    private Context context;
    private LayoutInflater inflater;
    private List<View> bannerdata = new ArrayList<>();
    private boolean banner = true;

    public static final int TYPE_HEADER = 0;
    public static final int TYPE_1 = 1;
    public static final int TYPE_2 = 2;
    public static final int TYPE_3 = 3;

    private View header;

    public View getHeader() {
        return header;
    }

    public void addHeader(View header) {
        this.header = header;
    }

    public TuijianAdapter(List<Tuijian.DataBeanX> data, Context context) {
        this.data = data;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemViewType(int position) {
        int type = position;
        switch (type) {
            case 0:
                return TYPE_HEADER;
            case 1:
                return TYPE_1;
            case 2:
                return TYPE_2;
            case 3:
                return TYPE_3;
        }
        return -1;
    }

    @Override
    public TuijianAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case TYPE_HEADER:
                view = inflater.inflate(R.layout.tuijianhead, parent, false);
                break;
            case TYPE_1:
                view = inflater.inflate(R.layout.tuijian01, parent, false);
                break;
            case TYPE_2:
                view = inflater.inflate(R.layout.tuijian02, parent, false);
                break;
            case TYPE_3:
                view = inflater.inflate(R.layout.tuijian03, parent, false);
                break;
        }
        return new MyViewHolder(view, viewType);
    }

    @Override
    public void onBindViewHolder(final TuijianAdapter.MyViewHolder holder, int position) {
        int type = getItemViewType(position);
        if (null != data) {
            switch (type) {
                case TYPE_HEADER:
                    if (banner) {
                        banner = false;
                        List<Tuijian.DataBeanX.BannerBean> list = data.get(position).getBanner();
                        ImageView imgPoint = null;
                        final List<Tuijian.DataBeanX.BannerBean> lists = new ArrayList<>();
                        lists.addAll(list);
                        for (int i = 0; i < list.size(); i++) {
                            ImageView iv = new ImageView(context);
                            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            Glide.with(context)
                                    .load(list.get(i).getBanner_picture())
                                    .centerCrop()
                                    .placeholder(R.mipmap.ic_launcher)
                                    .into(iv);

                            bannerdata.add(iv);

                            imgPoint = new ImageView(context);
                            if (i == 0) {
                                imgPoint.setImageResource(R.drawable.perssed_point);
                            } else {
                                imgPoint.setImageResource(R.drawable.default_point);
                            }
                            imgPoint.setPadding(5, 0, 5, 0);
                            holder.layouttuijianIcons.addView(imgPoint);
                        }

                        holder.tuijianhead_autovp.setAdapter(new BannerAdapter(bannerdata,context));
                        //启动自动轮播功能
                        holder.tuijianhead_autovp.startAutoScroll();
                        //手触摸停止自动滚动，一旦手放开继续自动滑动；默认开启的；
                        holder.tuijianhead_autovp.setStopScrollWhenTouch(true);
                        //默认循环轮播
                        holder.tuijianhead_autovp.setCycle(true);
                        //设置图片轮播的间隔时间
                        holder.tuijianhead_autovp.setInterval(3000);

                        holder.tuijianhead_autovp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                            @Override
                            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                            }

                            @Override
                            public void onPageSelected(int position) {
                                if (lists.size() != 0) {
                                    //根据布局容器得到其中的所有child
                                    int count = holder.layouttuijianIcons.getChildCount();
                                    for (int i = 0; i < count; i++) {
                                        ImageView imgPoint = (ImageView) holder.layouttuijianIcons.getChildAt(i);
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

                    break;
                case TYPE_1:
                    List<Tuijian.DataBeanX.ShequTalentBean> list1 = data.get(position).getShequ_talent();
                    holder.tuijian01.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                    Tuijian01Adapter adapter = new Tuijian01Adapter(context,list1);
                    holder.tuijian01.setAdapter(adapter);
                    adapter.setOnItemClicklistener(new OnTuijian01ItemClickListener() {
                        @Override
                        public void OnTuijian01ItemClickListener(Tuijian.DataBeanX.ShequTalentBean dataBean, int position) {
                            String user_id = dataBean.getUser_id();
                            Intent intent = new Intent(context, ExpertDetalisActivity.class);
                            intent.putExtra("user_id",user_id);
                            context.startActivity(intent);
                        }
                    });

                    break;

                case TYPE_2:
                    List<Tuijian.DataBeanX.ShequMarrowBean> list2 = data.get(position).getShequ_marrow();
                    holder.tuijian02.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
                    Tuijian02Adapter adapter2 = new Tuijian02Adapter(context, list2);
                    holder.tuijian02.setAdapter(adapter2);
                    adapter2.setOnItemClicklistener(new OnTuijian02ItemClickListener() {
                        @Override
                        public void OnTuijian02ItemClickListener(Tuijian.DataBeanX.ShequMarrowBean dataBean, int position) {
                            String post_id = dataBean.getId();
                            Intent intent = new Intent(context, ArtworkDetailsActivity.class);
                            intent.putExtra("post_id", post_id);
                            context.startActivity(intent);
                        }
                    });

                    break;

                case TYPE_3:
                    List<Tuijian.DataBeanX.ShequTopicsBean> list3 = data.get(position).getShequ_topics();
                    holder.tuijian03.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));

                    holder.tuijian03.setAdapter(new Tuijian03Adapter(context, list3));
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        RecyclerView tuijian01, tuijian02, tuijian03;
        AutoScrollViewPager tuijianhead_autovp;
        LinearLayout layouttuijianIcons;
        int viewType;

        public MyViewHolder(View itemView, int viewType) {
            super(itemView);
            this.viewType = viewType;
            switch (viewType) {
                case TYPE_HEADER:
                    tuijianhead_autovp = (AutoScrollViewPager) itemView.findViewById(R.id.tuijianhead_autovp);
                    layouttuijianIcons = (LinearLayout) itemView.findViewById(R.id.layouttuijianIcons);
                    break;
                case TYPE_1:
                    tuijian01 = (RecyclerView) itemView.findViewById(R.id.tuijian01_rv);
                    break;
                case TYPE_2:
                    tuijian02 = (RecyclerView) itemView.findViewById(R.id.tuijian02_rv);
                    break;
                case TYPE_3:
                    tuijian03 = (RecyclerView) itemView.findViewById(R.id.tuijian03);
                    break;

            }
        }
    }
}
