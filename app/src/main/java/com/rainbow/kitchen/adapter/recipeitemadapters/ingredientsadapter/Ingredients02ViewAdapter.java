package com.rainbow.kitchen.adapter.recipeitemadapters.ingredientsadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.callback.OnIngredientsItemClicklistener;
import com.rainbow.kitchen.bean.Ingredients;

import java.util.List;

/**
 * Created by BlueSky on 17/1/4.
 */

public class Ingredients02ViewAdapter extends RecyclerView.Adapter<Ingredients02ViewAdapter.MyViewHolder> {
    List<Ingredients.DataBeanXX.DataBeanX.DataBean> data;
    Context context;
    LayoutInflater inflater;
    private OnIngredientsItemClicklistener onItemClicklistener;
    public void setOnItemClicklistener(OnIngredientsItemClicklistener onItemClicklistener) {
        this.onItemClicklistener = onItemClicklistener;
    }
    public Ingredients02ViewAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void setData(List<Ingredients.DataBeanXX.DataBeanX.DataBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.ingredientdsitem2, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        if (data!=null){
            holder.tv_name.setText(data.get(position).getText());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClicklistener!=null){
                        onItemClicklistener.onItemClickListener(data.get(position),holder.getLayoutPosition());
                    }
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.ingredientsname);
        }
    }
}
