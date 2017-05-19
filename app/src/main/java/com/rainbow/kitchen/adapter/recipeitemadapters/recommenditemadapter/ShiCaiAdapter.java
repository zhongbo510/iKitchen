package com.rainbow.kitchen.adapter.recipeitemadapters.recommenditemadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.recipe_recommenditem.ShiCaiDaPei;
import com.rainbow.kitchen.utils.BitmapUtils;

import java.util.List;

/**
 * Created by followlove on 2017/1/10:21:41.
 */

public class ShiCaiAdapter extends RecyclerView.Adapter<ShiCaiAdapter.MyViewHolder>{

    Context context;
    List<ShiCaiDaPei.DataBeanXX.DataBeanX.DataBean> data;
    LayoutInflater inflater;

    public ShiCaiAdapter(Context context, List<ShiCaiDaPei.DataBeanXX.DataBeanX.DataBean> data) {
        this.context = context;
        this.data = data;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.shicaiitem,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BitmapUtils.showImageToUser(context,data.get(position).getImage(),holder.imageView10);
        holder.textView11.setText(data.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView10;
        TextView textView11;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView10= (ImageView) itemView.findViewById(R.id.imageView10);
            textView11= (TextView) itemView.findViewById(R.id.textView11);
        }
    }
}
