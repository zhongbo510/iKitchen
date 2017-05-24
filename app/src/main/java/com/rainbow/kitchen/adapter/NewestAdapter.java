package com.rainbow.kitchen.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.CommunityNewest;

import java.util.List;



public class NewestAdapter extends RecyclerView.Adapter<NewestAdapter.MyViewHolder> {
    private Context context;
    private List<CommunityNewest.DataBeanX.DataBean> dataList;

    public NewestAdapter(Context context, List<CommunityNewest.DataBeanX.DataBean> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.newestrecycler_item,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        CommunityNewest.DataBeanX.DataBean dataBean=dataList.get(position);
        if(dataBean.getImage()!=null){
            Glide.with(context)
                    .load(dataBean.getImage())
                    .placeholder(R.mipmap.ic_talent)
                    .skipMemoryCache(true)
                    .into(holder.img);
        }
        if(dataBean.getHead_img()!=null){
            Glide.with(context)
                    .load(dataBean.getHead_img())
                    .placeholder(R.mipmap.head)
                    .skipMemoryCache(true)
                    .into(holder.img_head);
        }
        holder.tv_title.setText(dataBean.getNick());
        holder.tv_time.setText(dataBean.getCreate_time());
        holder.tv_count.setText(dataBean.getAgree_count());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView img,img_head,img_good;
        TextView tv_title,tv_time,tv_count;

        public MyViewHolder(View itemView) {
            super(itemView);
            img= (ImageView) itemView.findViewById(R.id.img);
            img_head= (ImageView) itemView.findViewById(R.id.img_head);
            tv_title= (TextView) itemView.findViewById(R.id.tv_title);
            tv_time= (TextView) itemView.findViewById(R.id.tv_time);
            tv_count= (TextView) itemView.findViewById(R.id.tv_count);
            img_good= (ImageView) itemView.findViewById(R.id.img_good);
        }
    }
}
