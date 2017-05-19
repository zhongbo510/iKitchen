package com.rainbow.kitchen.adapter.ExpertDetalis;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.ArtworkDetailsActivity;
import com.rainbow.kitchen.bean.ExpertDetalis;
import com.rainbow.kitchen.utils.DisplayUtils;
import com.rainbow.kitchen.utils.GlideCircleTransform;
import com.rainbow.kitchen.utils.ShareSDK;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017.1.9.
 */


public class ExpertDetalis01Adapter extends RecyclerView.Adapter<ExpertDetalis01Adapter.MyViewHolder> {

    private List<ExpertDetalis.DataBeanX.DataBean> data;
    private List<String> list;
    private Context context;
    private LayoutInflater inflater;
    private String id;

    public ExpertDetalis01Adapter(List<ExpertDetalis.DataBeanX.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ExpertDetalis01Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.exprtdetalis01,null,false);
        return new ExpertDetalis01Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExpertDetalis01Adapter.MyViewHolder holder, final int position) {

        holder.tv_exprtdetalis01.setText(Html.fromHtml(data.get(position).getContent()));
        holder.tv_exprtdetalis01_nike.setText(data.get(position).getNick());
        holder.tv_exprtdetalis01_time.setText(data.get(position).getCreate_time());
        holder.tv_exprtdetalis01_agree.setText(data.get(position).getAgree_count());
        holder.tv_exprtdetalis01_comment.setText(data.get(position).getComment_count());

        list = new ArrayList<>();
        for (int i = 0; i <data.get(position).getComment().size() ; i++) {
            list.add(data.get(position).getComment().get(i).getNick()+": "+data.get(position).getComment().get(i).getContent());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,list);
        holder.lv_exprtdetalis01_talks.setAdapter(adapter);

        Glide.with(context)
                .load(data.get(position).getHead_img())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.food)
                .transform(new GlideCircleTransform(context))
                .override(DisplayUtils.getScreenWidth(context)/3,300)
                .skipMemoryCache(true)
                .into(holder.iv_exprtdetalis01_head);

        Glide.with(context)
                .load(data.get(position).getImage())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.food)
                .skipMemoryCache(true)
                .into(holder.iv_exprtdetalis01);

        holder.iv_exprtdetalis01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = data.get(position).getId();
                Intent intent=new Intent(context, ArtworkDetailsActivity.class);
                intent.putExtra("post_id",id);
                context.startActivity(intent);
            }
        });

        holder.iv_exprtdetalis01_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareSDK.share(context);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_exprtdetalis01,iv_exprtdetalis01_head,iv_exprtdetalis01_share;
        private TextView tv_exprtdetalis01,tv_exprtdetalis01_nike,tv_exprtdetalis01_time,tv_exprtdetalis01_agree,tv_exprtdetalis01_comment;
        private ListView lv_exprtdetalis01_talks;

        public MyViewHolder(View itemView) {
            super(itemView);
            iv_exprtdetalis01 = (ImageView) itemView.findViewById(R.id.iv_exprtdetalis01);
            iv_exprtdetalis01_head = (ImageView) itemView.findViewById(R.id.iv_exprtdetalis01_head);
            tv_exprtdetalis01 = (TextView) itemView.findViewById(R.id.tv_exprtdetalis01);
            tv_exprtdetalis01_nike = (TextView) itemView.findViewById(R.id.tv_exprtdetalis01_nike);
            tv_exprtdetalis01_time = (TextView) itemView.findViewById(R.id.tv_exprtdetalis01_time);
            lv_exprtdetalis01_talks = (ListView) itemView.findViewById(R.id.lv_exprtdetalis01_talks);
            tv_exprtdetalis01_agree = (TextView) itemView.findViewById(R.id.tv_exprtdetalis01_agree);
            tv_exprtdetalis01_comment = (TextView) itemView.findViewById(R.id.tv_exprtdetalis01_comment);
            iv_exprtdetalis01_share = (ImageView) itemView.findViewById(R.id.iv_exprtdetalis01_share);
        }
    }
}
