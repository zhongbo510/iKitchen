package com.rainbow.kitchen.adapter.recipeitemadapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.ArtworkDetailsActivity;
import com.rainbow.kitchen.activity.ExpertDetalisActivity;
import com.rainbow.kitchen.activity.PlayVideoActivity;
import com.rainbow.kitchen.activity.SearchActivity;
import com.rainbow.kitchen.activity.reciperecommenditemclick.Recipe_Type1;
import com.rainbow.kitchen.activity.reciperecommenditemclick.Type2wanfengleactivity;
import com.rainbow.kitchen.bean.Recommend;
import com.rainbow.kitchen.callback.OnRecommend01ItemClickListener;
import com.rainbow.kitchen.callback.OnRecommendtype2clicklistener;
import com.rainbow.kitchen.utils.BitmapUtils;

import java.util.List;

/**
 * Created by zyc on 2016/12/27:17:05.
 */

public class RecommendAdapter extends RecyclerView.Adapter<RecommendAdapter.MyViewHolder> {

    Context context;
    List<Recommend.DataBean.WidgetListBean> widgetListBeanList;
    LayoutInflater inflater;
    public static final int TYPE_HEADER = 0;
    public static final int TYPE_1 = 1;
    public static final int TYPE_2 = 2;
    public static final int TYPE_3 = 3;
    public static final int TYPE_4 = 4;
    public static final int TYPE_5 = 5;
    public static final int TYPE_7 = 7;
    public static final int TYPE_8 = 8;
    public static final int TYPE_9 = 9;
    public static final int TYPE_10 = 10;


    //  广告头
    private View header;

    public View getHeader() {
        return header;
    }

    public void addHeader(View header) {
        this.header = header;
    }


    //    构造方法，把要联系绑定的context传入，把widget_databean的list集合传入，
    public RecommendAdapter(Context context, List<Recommend.DataBean.WidgetListBean> widget_datalist) {
        this.context = context;
        this.widgetListBeanList = widget_datalist;
        inflater = LayoutInflater.from(context);
    }


    //    重写getitemviewtype方法，获取item的type类型
    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_HEADER;
        } else if (position == 1) {
            return TYPE_10;
        }
//        判断widget_datalist是否为空，防止空指针，
        else if (widgetListBeanList != null) {
            int type = widgetListBeanList.get(position - 2).getWidget_type();
            switch (type) {
                case 1:
                    //猜你喜欢：搜索框下面的四个图文混排
                    //出现一次
                    return TYPE_1;
                case 2:
                    //红包入口
                    return TYPE_2;
                case 3:
                    //午餐精神，排毒养颜蔬果汁
                    return TYPE_3;
                case 4:
                    //推荐达人
                    return TYPE_4;
                case 5:
                    //今日新品
                    return TYPE_5;
                case 7:
                    //美食专题，ListView复用，
                    return TYPE_7;
                case 8:
                    //精选作品
                    return TYPE_8;
                case 9:
                    //全部场景(141)
                    return TYPE_9;
            }
        }
        return TYPE_1;
    }


    //    根据不同类型加载不同布局，
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case TYPE_HEADER:
                view = this.getHeader();
                break;
            //猜你喜欢：搜索框下面的四个图文混排
            case TYPE_1:
                view = inflater.inflate(R.layout.recommenditem01, parent, false);
                break;
            case TYPE_2:
                view = inflater.inflate(R.layout.recommenditem02, parent, false);
                break;
            case TYPE_3:
                view = inflater.inflate(R.layout.recommenditem03, parent, false);
                break;
            case TYPE_4:
                view = inflater.inflate(R.layout.recommenditem04, parent, false);
                break;
            case TYPE_5:
                view = inflater.inflate(R.layout.recommenditem05, parent, false);
                break;
            case TYPE_7:
                view = inflater.inflate(R.layout.recommenditem07, parent, false);
                break;
            case TYPE_8:
                view = inflater.inflate(R.layout.recommenditem08, parent, false);
                break;
            case TYPE_9:
                view = inflater.inflate(R.layout.recommenditem09, parent, false);
                break;
//            这个是搜索框
            case TYPE_10:
                view = inflater.inflate(R.layout.recommenditem10, parent, false);
        }
        return new MyViewHolder(view, viewType);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        int type = getItemViewType(position);

        if (widgetListBeanList != null) {
            switch (type) {
                case TYPE_HEADER:
                    //如果是HEADER这个类型，那么在这里，就不需要任何处理
                    break;
                //猜你喜欢：搜索框下面的四个图文混排
                case TYPE_1://猜你喜欢
                    if (holder.layout_love.getChildCount() > 0) {
                        holder.layout_love.removeAllViews();
                    }
                    final List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data =
                            widgetListBeanList.get(position - 2).getWidget_data();
                    for (int i = 0; i < data.size(); i++) {
                        if (i % 2 == 0) {
                            LinearLayout layout1 = (LinearLayout) inflater.inflate(R.layout.item111, null);
                            ImageView imageView = (ImageView) layout1.findViewById(R.id.imageView22);
                            TextView tv = (TextView) layout1.findViewById(R.id.textView33);
                            Glide.with(context)
                                    .load(data.get(i).getContent())
                                    .placeholder(R.mipmap.ic_launcher)
                                    .error(R.mipmap.food)
                                    .skipMemoryCache(true)
                                    .into(imageView);

                            final String content = data.get(i + 1).getContent();
                            tv.setText(content);
                            layout1.setLayoutParams(new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1));
                            layout1.setPadding(10, 10, 10, 10);
                            holder.layout_love.addView(layout1);

                            layout1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(context, Recipe_Type1.class);
                                    intent.putExtra("content", content);
                                    context.startActivity(intent);
                                }
                            });

                        }
                    }
                    break;
                case TYPE_2://玩疯了创之星
                    List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data1 =
                            widgetListBeanList.get(position - 2).getWidget_data();
                    holder.recyclerView02.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.HORIZONTAL));
                    holder.recyclerView02.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));

                    Recommend02ViewAdapter recommend02ViewAdapter = new Recommend02ViewAdapter(data1, context);
                    holder.recyclerView02.setAdapter(recommend02ViewAdapter);
                    recommend02ViewAdapter.setOntype2clicklistener(new OnRecommendtype2clicklistener() {
                        @Override
                        public void onItemClickListener(Recommend.DataBean.WidgetListBean.WidgetDataBean dataBean, int pos) {
                            Intent intent = new Intent(context, Type2wanfengleactivity.class);
                            String [] series=dataBean.getLink().split("id=");
                            String series_id = series[series.length - 1];
//                            Log.e("series",""+series[series.length-1]);
                            intent.putExtra("series_id",series_id);
                            context.startActivity(intent);
                        }
                    });
                    break;
                case TYPE_3: //午餐精神，排毒养颜蔬果汁
                    String title3 = widgetListBeanList.get(position - 2).getTitle();
                    holder.title03.setText(title3);
                    List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data3 =
                            widgetListBeanList.get(position - 2).getWidget_data();
                    BitmapUtils.showImageToUser(context, data3.get(0).getContent(), holder.img031);
                    holder.title31.setText(data3.get(1).getContent());
                    holder.title32.setText(data3.get(2).getContent());

                    //四个图的顺序从左到到右，在从上而下

                    BitmapUtils.showImageToUser(context, data3.get(3).getContent(), holder.top1);
                    BitmapUtils.showImageToUser(context, data3.get(5).getContent(), holder.top2);
                    BitmapUtils.showImageToUser(context, data3.get(7).getContent(), holder.bottom1);
                    BitmapUtils.showImageToUser(context, data3.get(9).getContent(), holder.bottom2);

                    final String video1 = data3.get(4).getContent();
                    final String video2 = data3.get(6).getContent();
                    final String video3 = data3.get(8).getContent();
                    final String video4 = data3.get(10).getContent();
                    holder.top1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            boFanShiPin(video1);
                        }
                    });
                    holder.top2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            boFanShiPin(video2);
                        }
                    });
                    holder.bottom1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            boFanShiPin(video3);
                        }
                    });
                    holder.bottom2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            boFanShiPin(video4);
                        }
                    });

                    break;
                case TYPE_4: //推荐达人
                    String title4 = widgetListBeanList.get(position - 2).getTitle();
                    holder.title04.setText(title4);

                    List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data4 = widgetListBeanList.get(position - 2).getWidget_data();
                    holder.recyclerView04.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.HORIZONTAL));
                    holder.recyclerView04.setLayoutManager(new LinearLayoutManager(context));
                    Recommend04ViewAdapter adapter = new Recommend04ViewAdapter(context);
                    holder.recyclerView04.setAdapter(adapter);
                    adapter.setData(data4);

                    adapter.setOnItemClicklistener(new OnRecommend01ItemClickListener() {
                        @Override
                        public void onItemClickListener(Recommend.DataBean.WidgetListBean.WidgetDataBean componentBean, int pos) {
                            String user_id = componentBean.getId() + "";
                            Intent intent = new Intent(context, ExpertDetalisActivity.class);
                            intent.putExtra("user_id", user_id);

                            String[] splitlink = componentBean.getLink().split("#");
                            String visitor_id = splitlink[splitlink.length - 1];
                            Log.e("visitor_id",visitor_id);
                            intent.putExtra("user_id",visitor_id);

                            context.startActivity(intent);
                        }
                    });


                    break;
                case TYPE_5://今日新品
                    if (holder.layout05.getChildCount() > 0) {
                        holder.layout05.removeAllViews();
                    }
                    String title5 = widgetListBeanList.get(position - 2).getTitle();
                    holder.title05.setText(title5);
                    final List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data5 =
                            widgetListBeanList.get(position - 2).getWidget_data();
                    //只显示前3个item内容
                    for (int i = 0; i < 12; i++) {
                        if (i % 4 == 0) {
                            RelativeLayout layout1 = (RelativeLayout) inflater.inflate(R.layout.item555, null);
                            ImageView imageView22 = (ImageView) layout1.findViewById(R.id.imageView22);
                            TextView tv33 = (TextView) layout1.findViewById(R.id.textView33);
                            TextView tv44 = (TextView) layout1.findViewById(R.id.textView44);
                            BitmapUtils.showImageToUser(context, data5.get(i).getContent(), imageView22);

                            tv33.setText(data5.get(i + 2).getContent());
                            tv44.setText(data5.get(i + 3).getContent());
                            layout1.setLayoutParams(new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1));
                            layout1.setPadding(10, 10, 10, 10);
                            holder.layout05.addView(layout1);

                            final String videourl = data5.get(i + 1).getContent();
                            Log.e("====videourl=====", videourl.toString());
                            imageView22.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    boFanShiPin(videourl);
                                }
                            });
                        }
                    }
                    break;
                case TYPE_7://美食专题
                    String title7 = widgetListBeanList.get(position - 2).getTitle();
                    holder.title07.setText(title7);

                    List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data7 =
                            widgetListBeanList.get(position - 2).getWidget_data();
                    holder.recyclerView07.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.HORIZONTAL));
                    holder.recyclerView07.setLayoutManager(new LinearLayoutManager(context));
                    Recommend07ViewAdapter adapter07 = new Recommend07ViewAdapter(context);
                    holder.recyclerView07.setAdapter(adapter07);
                    adapter07.setData(data7);

                    break;
                case TYPE_8://精选作品
                    if (holder.layout08.getChildCount() > 0) {
                        holder.layout08.removeAllViews();
                    }
                    String title8 = widgetListBeanList.get(position - 2).getTitle();
                    holder.title08.setText(title8);
                    String title88 = widgetListBeanList.get(position - 2).getDesc();
                    holder.title088.setText(title88);
                    final List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data8 =
                            widgetListBeanList.get(position - 2).getWidget_data();
                    //只显示前3个item内容
                    for (int i = 0; i < 9; i++) {
                        if (i % 3 == 0) {
                            RelativeLayout layout1 = (RelativeLayout) inflater.inflate(R.layout.item888, null);
                            ImageView imageView8 = (ImageView) layout1.findViewById(R.id.imageView8);
                            ImageView imageView88 = (ImageView) layout1.findViewById(R.id.image88);
                            TextView tv88 = (TextView) layout1.findViewById(R.id.textView888);
                            BitmapUtils.showImageToUser(context, data8.get(i).getContent(), imageView8);
                            BitmapUtils.showImagehead(context, data8.get(i + 1).getContent(), imageView88);
                            tv88.setText(data8.get(i + 2).getContent());
                            layout1.setLayoutParams(new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1));
                            layout1.setPadding(10, 10, 10, 10);
                            holder.layout08.addView(layout1);
                            final int finalI = i;
                            imageView8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent=new Intent(context, ArtworkDetailsActivity.class);
                                    String link=data8.get(finalI).getLink();
                                    String[] postid = link.split("#");
                                    intent.putExtra("post_id",postid[1]);
                                    context.startActivity(intent);
                                }
                            });
                        }
                    }
                    break;
                case TYPE_9://全部场景(141)
                    String title9 = widgetListBeanList.get(position - 2).getTitle();
                    holder.title9.setText(title9);
                    break;
                case TYPE_10:
                    holder.searchView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(context, SearchActivity.class);
                            context.startActivity(intent);
                        }
                    });
                    break;
            }
        }
    }

    //    播放视频
    private void boFanShiPin(String video) {
        Intent intent = new Intent(context, PlayVideoActivity.class);
        intent.putExtra("video", video);
        if (video != null) {
            context.startActivity(intent);
        }
    }


    //    返回子item的个数,
    @Override
    public int getItemCount() {
        return widgetListBeanList.size() + 2;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        //recommenditem01布局里的控件，搜索框下面的四个图文混排
        LinearLayout layout_love;
        RecyclerView recyclerView02;
        TextView title03;
        TextView title31;
        TextView title32;
        ImageView img031;

        ImageView top1;
        ImageView top2;
        ImageView bottom1;
        ImageView bottom2;

        TextView title04;
        RecyclerView recyclerView04;

        TextView title05;
        LinearLayout layout05;

        TextView title07;
        RecyclerView recyclerView07;

        TextView title08;
        TextView title088;
        LinearLayout layout08;

        TextView title9;
        int viewType;

        ImageView searchView;

        //        MyViewHolder构造方法
        public MyViewHolder(View itemView, int viewType) {
            super(itemView);
            this.viewType = viewType;
            switch (viewType) {
                case TYPE_HEADER:
                    break;
//                搜索框下面的四个图文混排
                case TYPE_1:
                    layout_love = (LinearLayout) itemView.findViewById(R.id.layout_love);
                    break;
                case TYPE_2:
                    recyclerView02 = (RecyclerView) itemView.findViewById(R.id.recyclerView02);
                    break;
                case TYPE_3:
                    title03 = (TextView) itemView.findViewById(R.id.title3);
                    title31 = (TextView) itemView.findViewById(R.id.title31);
                    title32 = (TextView) itemView.findViewById(R.id.title32);
                    img031 = (ImageView) itemView.findViewById(R.id.img031);
                    top1 = (ImageView) itemView.findViewById(R.id.top1);
                    top2 = (ImageView) itemView.findViewById(R.id.top2);
                    bottom1 = (ImageView) itemView.findViewById(R.id.bottom1);
                    bottom2 = (ImageView) itemView.findViewById(R.id.bottom2);
                    break;
                case TYPE_4:
                    title04 = (TextView) itemView.findViewById(R.id.title4);
                    recyclerView04 = (RecyclerView) itemView.findViewById(R.id.recyclerView04);
                    break;
                case TYPE_5:
                    title05 = (TextView) itemView.findViewById(R.id.title5);
                    layout05 = (LinearLayout) itemView.findViewById(R.id.layout05);
                    break;
                case TYPE_7:
                    title07 = (TextView) itemView.findViewById(R.id.title7);
                    recyclerView07 = (RecyclerView) itemView.findViewById(R.id.recyclerView07);
                    break;
                case TYPE_8:
                    title08 = (TextView) itemView.findViewById(R.id.title8);
                    title088 = (TextView) itemView.findViewById(R.id.title88);
                    layout08 = (LinearLayout) itemView.findViewById(R.id.layout08);
                    break;
                case TYPE_9:
                    title9 = (TextView) itemView.findViewById(R.id.title9);
                    break;
                case TYPE_10:
                    searchView = (ImageView) itemView.findViewById(R.id.search1);
            }
        }
    }


}

