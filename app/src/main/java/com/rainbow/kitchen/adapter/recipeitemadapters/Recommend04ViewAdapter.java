package com.rainbow.kitchen.adapter.recipeitemadapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.Recommend;
import com.rainbow.kitchen.callback.OnRecommend01ItemClickListener;
import com.rainbow.kitchen.utils.GlideCircleTransform;

import java.util.List;


public class Recommend04ViewAdapter extends RecyclerView.Adapter<Recommend04ViewAdapter.MyViewHolder> {
    List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data;
    Context context;
    LayoutInflater inflater;
    private OnRecommend01ItemClickListener onItemClicklistener;

    public Recommend04ViewAdapter( Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void setData(List<Recommend.DataBean.WidgetListBean.WidgetDataBean> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item444, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        //0. path  1,name  ,2,简介 3.表示粉丝数
        //4,       5,      6,     7,

        if (data!=null){
            //0,4,8
            Log.e("====","====="+data.get(position*4).getContent());
            Glide.with(context)
                    .load(data.get(position*4).getContent())
                    .placeholder(R.mipmap.ic_talent)
                  //  .error(R.mipmap.food)
                    .transform(new GlideCircleTransform(context))
                    .skipMemoryCache(true)
                    .into(holder.circleImageView);

            //1,5,9
            holder.tv_name.setText(data.get(position*4+1).getContent());

            //2,6,10
            holder.tv_jianjie.setText(data.get(position*4+2).getContent());

            //3,7,11
            holder.tv_fensi.setText(data.get(position*4+3).getContent());
        }

        holder.oncliklayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClicklistener.onItemClickListener(data.get(position*4),position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public void setOnItemClicklistener(OnRecommend01ItemClickListener onItemClicklistener) {
        this.onItemClicklistener = onItemClicklistener;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_name;
        TextView tv_jianjie;
        TextView tv_fensi;
        ImageView circleImageView;
        RelativeLayout oncliklayout;

        public MyViewHolder(View itemView) {
            super(itemView);
            circleImageView = (ImageView) itemView.findViewById(R.id.circleImageview4);

            tv_name = (TextView) itemView.findViewById(R.id.name);
            tv_jianjie = (TextView) itemView.findViewById(R.id.textView4);
            tv_fensi = (TextView) itemView.findViewById(R.id.fensi);
            oncliklayout= (RelativeLayout) itemView.findViewById(R.id.oncliklayout);
        }
    }
}
