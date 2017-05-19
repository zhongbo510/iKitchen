package com.rainbow.kitchen.adapter.recipeitemadapters.recommenditemadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.recipe_recommenditem.RecipeType1Item;
import com.rainbow.kitchen.utils.GlideCircleTransform;

import java.util.List;

/**
 * Created by followlove on 2017/1/9:11:46.
 */

public class Recyclerview11adapter extends RecyclerView.Adapter<Recyclerview11adapter.MyViewHolder>{
    private List<RecipeType1Item.DataBean.LogosBean> logosBeanList;
    Context context;
    LayoutInflater inflater;

    public Recyclerview11adapter(List<RecipeType1Item.DataBean.LogosBean> logosBeanList, Context context) {
        this.logosBeanList = logosBeanList;
        this.context = context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.recyclerview_item11,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        if (logosBeanList!=null){
            Glide.with(context)
                    .load(logosBeanList.get(position).getLogo())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .transform(new GlideCircleTransform(context))
                    .skipMemoryCache(true)
                    .into(holder.imageView15);
            holder.textView8.setText(logosBeanList.get(position).getName());
        }
    }

    @Override
    public int getItemCount() {
        return logosBeanList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView15;
        TextView textView8;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView15= (ImageView) itemView.findViewById(R.id.imageView15);
            textView8= (TextView) itemView.findViewById(R.id.textView8);
        }
    }
}
