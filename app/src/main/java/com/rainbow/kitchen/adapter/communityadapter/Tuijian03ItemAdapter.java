package com.rainbow.kitchen.adapter.communityadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.Tuijian;
import com.rainbow.kitchen.callback.OnTuijian03ItemClickListener;
import com.rainbow.kitchen.utils.DisplayUtils;

import java.util.List;

/**
 * Created by Administrator on 2017.1.4.
 */

public class Tuijian03ItemAdapter extends RecyclerView.Adapter<Tuijian03ItemAdapter.MyViewHolder>{
    private Context context;
    private List<Tuijian.DataBeanX.ShequTopicsBean.DataBean> data;
    private OnTuijian03ItemClickListener tuijian03ItemClickListener;

    public Tuijian03ItemAdapter(Context context, List<Tuijian.DataBeanX.ShequTopicsBean.DataBean> data) {
        this.context = context;
        this.data = data;
    }
    public void setOnItemClicklistener(OnTuijian03ItemClickListener tuijian03ItemClickListener){
        this.tuijian03ItemClickListener = tuijian03ItemClickListener;
    }


    @Override
    public Tuijian03ItemAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(10,0,10,0);

        return new Tuijian03ItemAdapter.MyViewHolder(imageView);
    }

    @Override
    public void onBindViewHolder(Tuijian03ItemAdapter.MyViewHolder holder, final int position) {
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
                tuijian03ItemClickListener.OnTuijian03ItemClickListener(data.get(position),position);
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
