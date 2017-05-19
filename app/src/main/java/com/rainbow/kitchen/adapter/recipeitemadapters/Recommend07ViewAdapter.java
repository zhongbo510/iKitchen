package com.rainbow.kitchen.adapter.recipeitemadapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.reciperecommenditemclick.Banner1;
import com.rainbow.kitchen.bean.Recommend;

import java.util.List;

/**
 * Created by BlueSky on 17/1/4.
 */

public class Recommend07ViewAdapter extends RecyclerView.Adapter<Recommend07ViewAdapter.MyViewHolder> {
    List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data;
    Context context;
    LayoutInflater inflater;

    public Recommend07ViewAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void setData(List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item777, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        if (data!=null){
            //0,3
            Log.e("====","====="+data.get(position*3).getContent());
            Glide.with(context)
                    .load(data.get(position*3).getContent())
                    .placeholder(R.mipmap.sxm)
                    .error(R.mipmap.food)
                    .skipMemoryCache(true)
                    .into(holder.circleImageView);

            //1,4
            holder.tv_name.setText(data.get(position*3+1).getContent());

            //2,5
            holder.tv_jianjie.setText(data.get(position*3+2).getContent());

            holder.circleImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,Banner1.class);
                    context.startActivity(intent);
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return 2;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name;
        TextView tv_jianjie;
        ImageView circleImageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            circleImageView = (ImageView) itemView.findViewById(R.id.imageView7);
            tv_name = (TextView) itemView.findViewById(R.id.textView77);
            tv_jianjie = (TextView) itemView.findViewById(R.id.textView777);

        }
    }
}
