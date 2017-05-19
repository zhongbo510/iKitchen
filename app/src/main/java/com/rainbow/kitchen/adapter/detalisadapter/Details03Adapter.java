package com.rainbow.kitchen.adapter.detalisadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.Detalis;
import com.rainbow.kitchen.callback.OnDetails02ItemClickListener;
import com.rainbow.kitchen.utils.GlideCircleTransform;

import java.util.List;

/**
 * Created by Administrator on 2017.1.6.
 */

public class Details03Adapter extends RecyclerView.Adapter<Details03Adapter.MyViewHolder>{

    private Context context;
    private List<Detalis.DataBean.LikeBean> data;
    private LayoutInflater inflater;
    private OnDetails02ItemClickListener details02ItemClickListener;

    public Details03Adapter(Context context, List<Detalis.DataBean.LikeBean> data) {
        this.context = context;
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }

    public void setOnItemClicklistener(OnDetails02ItemClickListener details02ItemClickListener){
        this.details02ItemClickListener = details02ItemClickListener;
    }

    @Override
    public Details03Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.universal_item,parent,false);

        return new Details03Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Glide.with(context)
                .load(data.get(position).getHead_img())
                .transform(new GlideCircleTransform(context))
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.food)
                .skipMemoryCache(true)
                .into(holder.iv_universal);

        holder.iv_universal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                details02ItemClickListener.OnDetails02ItemClickListener(data.get(position),position);
            }
        });
    }

    @Override
    public int getItemCount() {
        if(data.size()>20){
            return 20;
        }else {
            return data.size();
        }
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private ImageView iv_universal;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv_universal = (ImageView) itemView.findViewById(R.id.iv_universal);
        }
    }
}
