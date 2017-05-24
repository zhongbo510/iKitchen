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


public class IngredientsRvAdapter extends RecyclerView.Adapter<IngredientsRvAdapter.MyViewHolder> {

    IngredientsDetailBean.DataBean data = new IngredientsDetailBean.DataBean();
    Context context;
    LayoutInflater inflater;

    public IngredientsRvAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void setData(IngredientsDetailBean.DataBean data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public IngredientsRvAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.ingredientdsdetail_item1, null);
        return new IngredientsRvAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final IngredientsRvAdapter.MyViewHolder holder, final int position) {
                  if (data!=null){
                      holder.tv_name.setText(data.getPick());
                      Glide.with(context)
                              .load(data.getPick_image())
                              .placeholder(R.mipmap.ic_launcher)
                             // .error(R.mipmap.food)
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
