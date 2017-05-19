package com.rainbow.kitchen.adapter.recipeitemadapters.recommenditemadapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.PlayVideoActivity;
import com.rainbow.kitchen.bean.recipe_recommenditem.Banner_2Bean;
import com.rainbow.kitchen.utils.BitmapUtils;

import java.util.List;

/**
 * Created by followlove on 2017/1/9:21:19.
 */

public class Banner2Adapter extends RecyclerView.Adapter<Banner2Adapter.MyViewHolder>{
    private List<Banner_2Bean.DataBeanX.DataBean> data;
    Context context;
    LayoutInflater inflater;

    public Banner2Adapter(List<Banner_2Bean.DataBeanX.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.banner2item,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        if (data!=null){
            BitmapUtils.showImageToUser(context,data.get(position).getCourse_image(),holder.imgcourse_image);
            holder.tvcourse_name.setText(data.get(position).getCourse_name());
            holder.tvcourse_subject.setText(data.get(position).getCourse_subject());

            final String videourl=data.get(position).getCourse_video();
            holder.imgcourse_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context, PlayVideoActivity.class);
                    intent.putExtra("video",videourl);
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvcourse_name;
        TextView tvcourse_subject;
        ImageView imgcourse_image;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvcourse_name= (TextView) itemView.findViewById(R.id.textView12);
            tvcourse_subject= (TextView) itemView.findViewById(R.id.textView13);
            imgcourse_image= (ImageView) itemView.findViewById(R.id.imageView6);
        }
    }
}
