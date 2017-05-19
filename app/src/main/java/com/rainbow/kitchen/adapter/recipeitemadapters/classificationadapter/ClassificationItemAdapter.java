package com.rainbow.kitchen.adapter.recipeitemadapters.classificationadapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.PlayVideoActivity;
import com.rainbow.kitchen.bean.ClassificationItem;
import com.rainbow.kitchen.view.MyGridView;

import java.util.List;

/**
 * Created by tsngtso on 2017/1/6.
 */

public class ClassificationItemAdapter extends RecyclerView.Adapter<ClassificationItemAdapter.MyViewHolder>{

    private Context context;
    private List<ClassificationItem.DataBeanX.DataBean> dataBeanList;

    public ClassificationItemAdapter(Context context, List<ClassificationItem.DataBeanX.DataBean> dataBeanList) {
        this.context = context;
        this.dataBeanList = dataBeanList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.classificationdetail_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final ClassificationItem.DataBeanX.DataBean dataBean=dataBeanList.get(position);
        if(dataBean!=null){
            Glide.with(context)
                    .load(dataBean.getImage())
                    .skipMemoryCache(true)
                    .into(holder.classitem_image);
            holder.player.setImageResource(R.mipmap.play);
            holder.classifitem_name.setText(dataBean.getTitle());
            holder.classifitem_describe.setText(dataBean.getDescription());
            holder.classitem_num.setText(dataBean.getPlay()+"人看过");
            List<ClassificationItem.DataBeanX.DataBean.TagsInfoBean> tagsInfoBeen=dataBean.getTags_info();
            ClassificationItemGridviewAdapter gridViewAdapter=new ClassificationItemGridviewAdapter(context,tagsInfoBeen);
            holder.classitemdetail_gridview.setAdapter(gridViewAdapter);
            holder.player.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context, PlayVideoActivity.class);
                    intent.putExtra("video",dataBean.getVideo1());
                    context.startActivity(intent);
                }
            });

        }
    }

    @Override
    public int getItemCount() {
        return dataBeanList.size();
    }


    static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView classitem_image,player;
        VideoView classitem_video;
        TextView classifitem_name,classifitem_describe,classitem_num;
        MyGridView classitemdetail_gridview;


        public MyViewHolder(View itemView) {
            super(itemView);
            classitem_image= (ImageView) itemView.findViewById(R.id.classitem_image);
            player= (ImageView) itemView.findViewById(R.id.player);
            classitem_video= (VideoView) itemView.findViewById(R.id.classitem_video);
            classifitem_name= (TextView) itemView.findViewById(R.id.classifitem_name);
            classifitem_describe= (TextView) itemView.findViewById(R.id.classifitem_describe);
            classitem_num= (TextView) itemView.findViewById(R.id.classitem_num);
            classitemdetail_gridview= (MyGridView) itemView.findViewById(R.id.classitemdetail_gridview);
        }
    }
}
