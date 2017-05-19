package com.rainbow.kitchen.adapter.detalisadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.Detalis;
import com.rainbow.kitchen.callback.OnDetails03ItemClickListener;
import com.rainbow.kitchen.utils.DisplayUtils;

import java.util.List;

/**
 * Created by Administrator on 2017.1.6.
 */

public class Details04Adapter extends RecyclerView.Adapter<Details04Adapter.MyViewHolder>{

    private Context context;
    private List<Detalis.DataBean.RelatesBean> data;
    private OnDetails03ItemClickListener details03ItemClickListener;

    public Details04Adapter(Context context, List<Detalis.DataBean.RelatesBean> data) {
        this.context = context;
        this.data = data;
    }
    public void setOnItemClicklistener(OnDetails03ItemClickListener details03ItemClickListener){
        this.details03ItemClickListener = details03ItemClickListener;
    }

    @Override
    public Details04Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(10,0,10,0);

        return new Details04Adapter.MyViewHolder(imageView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Glide.with(context)
                .load(data.get(position).getImage())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.food)
                .override(DisplayUtils.getScreenWidth(context)/3,300)
                .skipMemoryCache(true)
                .into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                details03ItemClickListener.OnDetails03ItemClickListener(data.get(position),position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView;
        }
    }
}
