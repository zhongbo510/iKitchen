package com.rainbow.kitchen.adapter.communityadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.Tuijian;
import com.rainbow.kitchen.callback.OnTuijian02ItemClickListener;
import com.rainbow.kitchen.utils.DisplayUtils;

import java.util.List;

/**
 * Created by Administrator on 2017.1.4.
 */

public class Tuijian02Adapter extends RecyclerView.Adapter<Tuijian02Adapter.MyViewHolder>{

    private Context context;
    private List<Tuijian.DataBeanX.ShequMarrowBean> data;
    private OnTuijian02ItemClickListener tuijian02ItemClickListener;

    public Tuijian02Adapter(Context context, List<Tuijian.DataBeanX.ShequMarrowBean> data) {
        this.context = context;
        this.data = data;
    }

    public void setOnItemClicklistener(OnTuijian02ItemClickListener tuijian02ItemClickListener){
        this.tuijian02ItemClickListener = tuijian02ItemClickListener;
    }

    @Override
    public Tuijian02Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(10,0,10,0);

        return new Tuijian02Adapter.MyViewHolder(imageView);
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
                tuijian02ItemClickListener.OnTuijian02ItemClickListener(data.get(position),position);
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
