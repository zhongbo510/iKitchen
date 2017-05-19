package com.rainbow.kitchen.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.Foods;
import com.rainbow.kitchen.callback.OnFunItemClickListener;

import java.util.List;

/**
 * Created by tsngtso on 2016/12/26.
 */

public class FunAdapter extends RecyclerView.Adapter<FunAdapter.MyViewHolder>{
    private  Context context;
    private List<Foods.DataBeanX.DataBean> dataList;
    private OnFunItemClickListener onFunItemClickListener;

    public FunAdapter(Context context, List<Foods.DataBeanX.DataBean> dataList) {
        this.context = context;
        this.dataList = dataList;
        Log.e("=====","=====");
    }

    public void setOnFunItemClickListener(OnFunItemClickListener onFunItemClickListener) {
        this.onFunItemClickListener = onFunItemClickListener;
    }

    public void setDataList(List<Foods.DataBeanX.DataBean> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, final int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.recyclerview_item,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
      final Foods.DataBeanX.DataBean dataBean=dataList.get(position);
        if(dataBean.getImage()!=null){
            Glide.with(context)
                    .load(dataBean.getImage())
                    .placeholder(R.mipmap.food)
                    .skipMemoryCache(true)
                    .into(holder.img);
        }
        if(dataBean.getAlbum_logo()!=null){
            Glide.with(context)
                    .load(dataBean.getAlbum_logo())
                    .placeholder(R.mipmap.head)
                    .skipMemoryCache(true)
                    .into(holder.img_head);
        }
        holder.tv_title.setText(dataBean.getSeries_name());
        holder.tv_new.setText("更新至"+dataBean.getEpisode_sum()+"集");
        holder.tv_num.setText("上课人数"+dataBean.getPlay());
        holder.tv_name.setText(dataBean.getAlbum());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onFunItemClickListener!=null){
                    onFunItemClickListener.onFunItemClick(dataBean,holder.getLayoutPosition());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView img,img_head;
        TextView tv_title,tv_new,tv_num,tv_name;

        public MyViewHolder(View itemView) {
            super(itemView);
            img= (ImageView) itemView.findViewById(R.id.img);
            img_head= (ImageView) itemView.findViewById(R.id.img_head);
            tv_title= (TextView) itemView.findViewById(R.id.tv_title);
            tv_new= (TextView) itemView.findViewById(R.id.tv_new);
            tv_num= (TextView) itemView.findViewById(R.id.tv_num);
            tv_name= (TextView) itemView.findViewById(R.id.tv_name);
        }
    }


}
