package com.rainbow.kitchen.adapter.recipeitemadapters.ingredientsadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.IngredientsDetailBean;

/**
 * Created by innershows on 2016/12/1.
 *
 * @author innershows
 * @date 2016/12/1
 * @e_mail innershow@gmail.com
 */

public class IngredientsRvAdapter3 extends RecyclerView.Adapter<IngredientsRvAdapter3.MyViewHolder> {

    IngredientsDetailBean.DataBean data;
    Context context;
    LayoutInflater inflater;

    public IngredientsRvAdapter3(Context context, IngredientsDetailBean.DataBean data) {
        this.context = context;
        this.data=data;
        inflater = LayoutInflater.from(context);
    }

    public void setData(IngredientsDetailBean.DataBean data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public IngredientsRvAdapter3.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.ingredientdsdetail_item1, null);
        return new IngredientsRvAdapter3.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final IngredientsRvAdapter3.MyViewHolder holder, final int position) {
        if (data!=null) {
            holder.tv_name.setText(data.getApplied());
            Glide.with(context)
                    .load(data.getApplied_image())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.food)
                    .skipMemoryCache(true)
                    .into(holder.imageView);
        }
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name;
        ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.ingredients_details);
            imageView = (ImageView) itemView.findViewById(R.id.image_vg_ingredientsdetail);
        }
    }
}
