package com.rainbow.kitchen.adapter.communityadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.CommunityFocus;
import com.rainbow.kitchen.callback.OnFocusItemClickListenter;

import java.util.List;

import cn.sharesdk.framework.ShareSDK;

/**
 * Created by tsngtso on 2017/1/3.
 * 这个是社区中的关注页面--适配器
 */

public class FocusAdapter extends RecyclerView.Adapter<FocusAdapter.MyViewHolder>{

    private Context context;
    private List<CommunityFocus.DataBeanX.DataBean> dataList;
    private OnFocusItemClickListenter focusItemClickListenter;

    public FocusAdapter(Context context, List<CommunityFocus.DataBeanX.DataBean> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    public void setOnItemClicklistener(OnFocusItemClickListenter focusItemClickListenter){
        this.focusItemClickListenter = focusItemClickListenter;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.comunityfocus_item,parent,false);
        ShareSDK.initSDK(context,"1aa924c8e0be4");
        return new FocusAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        final CommunityFocus.DataBeanX.DataBean dataBean=dataList.get(position);
        if(dataBean.getHead_img()!=null){
            Glide.with(context)
                    .load(dataBean.getHead_img())
                    .skipMemoryCache(true)
                    .into(holder.iv_head);
            Glide.with(context)
                    .load(dataBean.getImage())
                    .skipMemoryCache(true)
                    .into(holder.iv_focus);

            holder.tv_agree.setText(dataBean.getAgree_count());
            holder.tv_comment.setText(dataBean.getComment_count());
            holder.tv_create.setText(dataBean.getCreate_time());
            holder.tv_nike.setText(dataBean.getNick());
            holder.tv_focus.setText(Html.fromHtml(dataBean.getContent()));

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    focusItemClickListenter.OnFocusItemClickListener(dataBean ,position);
                }
            });

            holder.img_share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    com.rainbow.kitchen.utils.ShareSDK.share(context);
                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    public  static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView iv_focus,iv_head;
        TextView tv_focus,tv_nike,tv_create,tv_agree,tv_comment;
        ImageButton img_agree,img_comment,img_share;


        public MyViewHolder(View itemView) {
            super(itemView);
            iv_focus = (ImageView) itemView.findViewById(R.id.iv_focus);
            tv_focus = (TextView) itemView.findViewById(R.id.tv_focus);
            iv_head = (ImageView) itemView.findViewById(R.id.iv_head);
            tv_nike = (TextView) itemView.findViewById(R.id.tv_nike);
            tv_create = (TextView) itemView.findViewById(R.id.tv_create);
            tv_agree = (TextView) itemView.findViewById(R.id.tv_agree);
            tv_comment = (TextView) itemView.findViewById(R.id.tv_comment);
            img_agree = (ImageButton) itemView.findViewById(R.id.img_agree);
            img_comment = (ImageButton) itemView.findViewById(R.id.img_comment);
            img_share = (ImageButton) itemView.findViewById(R.id.img_share);


        }


    }
}
