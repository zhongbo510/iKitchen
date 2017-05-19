package com.rainbow.kitchen.adapter.recipeitemadapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.Recommend;
import com.rainbow.kitchen.callback.OnRecommendtype2clicklistener;
import com.rainbow.kitchen.utils.DisplayUtils;

import java.util.List;

/**
 * Created by BlueSky on 17/1/4.
 */

public class Recommend02ViewAdapter extends RecyclerView.Adapter<Recommend02ViewAdapter.MyViewHolder> {
    List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data;
    Context context;
    OnRecommendtype2clicklistener onRecommendtype2clicklistener;

    public void setOntype2clicklistener(OnRecommendtype2clicklistener onRecommendtype2clicklistener){
        this.onRecommendtype2clicklistener=onRecommendtype2clicklistener;
    }

    public Recommend02ViewAdapter(List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ImageView imageView =new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new MyViewHolder(imageView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Glide.with(context)
                .load(data.get(position).getContent())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.food)
                .override(DisplayUtils.getScreenWidth(context)/2,200)
                .skipMemoryCache(true)
                .into(holder.imageView);
        Log.e("Recommend02ViewAdapter",data.get(position).getContent().toString());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRecommendtype2clicklistener.onItemClickListener(data.get(position),position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static  class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView;
        }
    }
}
