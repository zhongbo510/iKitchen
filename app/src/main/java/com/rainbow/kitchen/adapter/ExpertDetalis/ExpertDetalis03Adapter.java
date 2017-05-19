package com.rainbow.kitchen.adapter.ExpertDetalis;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.FansBean;
import com.rainbow.kitchen.utils.DisplayUtils;
import com.rainbow.kitchen.utils.GlideCircleTransform;

import java.util.List;

/**
 * Created by Administrator on 2017.1.6.
 */

public class ExpertDetalis03Adapter extends RecyclerView.Adapter<ExpertDetalis03Adapter.MyViewHolder> {

    private List<FansBean.DataBeanX.DataBean> data;
    private Context context;
    private LayoutInflater inflater;


    public ExpertDetalis03Adapter(List<FansBean.DataBeanX.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public ExpertDetalis03Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.exprtdetalis02,null,false);
        return new ExpertDetalis03Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExpertDetalis03Adapter.MyViewHolder holder, int position) {
        holder.tv_exprtdetalis02_nike.setText(data.get(position).getNick());
        holder.tv_exprtdetalis02_fans.setText("粉丝："+data.get(position).getCount_fensi());

        Glide.with(context)
                .load(data.get(position).getHead_img())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.food)
                .transform(new GlideCircleTransform(context))
                .override(DisplayUtils.getScreenWidth(context)/5,300)
                .skipMemoryCache(true)
                .into(holder.iv_exprtdetalis02_head);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_exprtdetalis02_fans,tv_exprtdetalis02_nike;
        private ImageView iv_exprtdetalis02_head;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_exprtdetalis02_nike = (TextView) itemView.findViewById(R.id.tv_exprtdetalis02_nike);
            tv_exprtdetalis02_fans = (TextView) itemView.findViewById(R.id.tv_exprtdetalis02_fans);
            iv_exprtdetalis02_head = (ImageView) itemView.findViewById(R.id.iv_exprtdetalis02_head);
        }
    }
}
