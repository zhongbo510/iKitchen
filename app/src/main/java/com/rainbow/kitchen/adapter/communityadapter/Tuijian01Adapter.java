package com.rainbow.kitchen.adapter.communityadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.Tuijian;
import com.rainbow.kitchen.callback.OnTuijian01ItemClickListener;
import com.rainbow.kitchen.utils.DisplayUtils;
import com.rainbow.kitchen.utils.GlideCircleTransform;

import java.util.List;

/**
 * Created by Administrator on 2017.1.4.
 */

public class Tuijian01Adapter extends RecyclerView.Adapter<Tuijian01Adapter.MyViewHolder>{

    private Context context;
    private List<Tuijian.DataBeanX.ShequTalentBean> data;
    private LayoutInflater inflater;
    private OnTuijian01ItemClickListener tuijian01ItemClickListener;

    public Tuijian01Adapter(Context context, List<Tuijian.DataBeanX.ShequTalentBean> data) {
        this.context = context;
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }

    public void setOnItemClicklistener(OnTuijian01ItemClickListener tuijian01ItemClickListener){
        this.tuijian01ItemClickListener = tuijian01ItemClickListener;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.tuijian01_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        if(null != data){
            holder.tuijian01_item_tv1.setText(data.get(position).getNick());
            holder.tuijian01_item_tv2.setText("粉丝："+data.get(position).getTongji_be_follow());

            Glide.with(context)
                    .load(data.get(position).getHead_img())
                    .skipMemoryCache(true)
                    .transform(new GlideCircleTransform(context))
                    .override(DisplayUtils.getScreenWidth(context)/4,DisplayUtils.getScreenHeight(context)/8)
                    .into(holder.tuijian01_item_iv);

            holder.tuijian01_item_iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tuijian01ItemClickListener.OnTuijian01ItemClickListener(data.get(position),position);
                }
            });
        }
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView tuijian01_item_iv;
        TextView tuijian01_item_tv1,tuijian01_item_tv2;

        public MyViewHolder(View itemView) {
            super(itemView);
            tuijian01_item_iv = (ImageView) itemView.findViewById(R.id.tuijian01_item_iv);
            tuijian01_item_tv1 = (TextView) itemView.findViewById(R.id.tuijian01_item_tv1);
            tuijian01_item_tv2 = (TextView) itemView.findViewById(R.id.tuijian01_item_tv2);
        }
    }
}
