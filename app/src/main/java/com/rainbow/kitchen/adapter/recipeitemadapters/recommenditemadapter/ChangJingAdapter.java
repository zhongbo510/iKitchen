package com.rainbow.kitchen.adapter.recipeitemadapters.recommenditemadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.recipe_recommenditem.ChangJing;
import com.rainbow.kitchen.utils.BitmapUtils;

import java.util.List;

/**
 * Created by followlove on 2017/1/10:22:41.
 */

public class ChangJingAdapter extends RecyclerView.Adapter<ChangJingAdapter.MyViewHolder>{
    Context context;
    private List<ChangJing.DataBeanX.DataBean> datachangjing;
    LayoutInflater inflater;

    public ChangJingAdapter(Context context, List<ChangJing.DataBeanX.DataBean> datachangjing) {
        this.context = context;
        this.datachangjing = datachangjing;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.changjingitem,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BitmapUtils.showImageToUser(context,datachangjing.get(position).getScene_background(),holder.imageView13);
        holder.textView17.setText(datachangjing.get(position).getDish_count()+"");
        holder.textView16.setText(datachangjing.get(position).getScene_title());
        holder.textView18.setText("道菜");
    }

    @Override
    public int getItemCount() {
        return datachangjing.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView17;
        ImageView imageView13;
        TextView textView16;
        TextView textView18;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView13= (ImageView) itemView.findViewById(R.id.imageView13);
            textView17= (TextView) itemView.findViewById(R.id.textView17);
            textView16= (TextView) itemView.findViewById(R.id.textView16);
            textView18= (TextView) itemView.findViewById(R.id.textView18);
        }
    }
}
