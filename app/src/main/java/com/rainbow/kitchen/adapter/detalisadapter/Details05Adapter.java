package com.rainbow.kitchen.adapter.detalisadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.Detalis;
import com.rainbow.kitchen.callback.OnDetails04ItemClickListener;
import com.rainbow.kitchen.utils.DisplayUtils;
import com.rainbow.kitchen.utils.GlideCircleTransform;

import java.util.List;

/**
 * Created by Administrator on 2017.1.6.
 */

public class Details05Adapter extends RecyclerView.Adapter<Details05Adapter.MyViewHolder> {

    private List<Detalis.DataBean.CommentBean> data;
    private Context context;
    private LayoutInflater inflater;
    private OnDetails04ItemClickListener details04ItemClickListener;

    public Details05Adapter(List<Detalis.DataBean.CommentBean> data, Context context) {
        this.data = data;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void setOnItemClicklistener(OnDetails04ItemClickListener details04ItemClickListener){
        this.details04ItemClickListener = details04ItemClickListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.detalis05_item,null,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.detalis05_item_nick.setText(data.get(position).getNick());
        holder.detalis05_item_content.setText(Html.fromHtml(data.get(position).getContent()));

        Glide.with(context)
                .load(data.get(position).getHead_img())
                .transform(new GlideCircleTransform(context))
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.food)
                .override(DisplayUtils.getScreenWidth(context)/5,300)
                .skipMemoryCache(true)
                .into(holder.detalis05_item_head);

        holder.detalis05_item_head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                details04ItemClickListener.OnDetails04ItemClickListener(data.get(position),position);
            }
        });
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView detalis05_item_nick,detalis05_item_content;
        private ImageView detalis05_item_head;

        public MyViewHolder(View itemView) {
            super(itemView);

            detalis05_item_nick = (TextView) itemView.findViewById(R.id.detalis05_item_nick);
            detalis05_item_content = (TextView) itemView.findViewById(R.id.detalis05_item_content);
            detalis05_item_head = (ImageView) itemView.findViewById(R.id.detalis05_item_head);
        }
    }
}
