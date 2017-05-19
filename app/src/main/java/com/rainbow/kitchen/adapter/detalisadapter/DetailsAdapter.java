package com.rainbow.kitchen.adapter.detalisadapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.ArtworkDetailsActivity;
import com.rainbow.kitchen.activity.ExpertDetalisActivity;
import com.rainbow.kitchen.bean.Detalis;
import com.rainbow.kitchen.callback.OnDetails02ItemClickListener;
import com.rainbow.kitchen.callback.OnDetails03ItemClickListener;
import com.rainbow.kitchen.callback.OnDetails04ItemClickListener;
import com.rainbow.kitchen.utils.GlideCircleTransform;

import java.util.List;

/**
 * Created by Administrator on 2017.1.6.
 */

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.MyViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private List<Detalis.DataBean> data;

    public static final int TYPE_0 = 0;
    public static final int TYPE_1 = 1;
    public static final int TYPE_2 = 2;
    public static final int TYPE_3 = 3;
    public static final int TYPE_4 = 4;

    public DetailsAdapter(Context context, List<Detalis.DataBean> data) {
        this.context = context;
        this.data = data;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemViewType(int position) {
        int type = position;
        switch (type) {
            case 0:
                return TYPE_0;
            case 1:
                return TYPE_1;
            case 2:
                return TYPE_2;
            case 3:
                return TYPE_3;
            case 4:
                return TYPE_4;
        }
        return -1;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case TYPE_0:
                view =inflater.inflate(R.layout.detalis01,parent,false);
                break;
            case TYPE_1:
                view = inflater.inflate(R.layout.detalis02, parent, false);
                break;
            case TYPE_2:
                view = inflater.inflate(R.layout.detalis03, parent, false);
                break;
            case TYPE_3:
                view = inflater.inflate(R.layout.detalis04, parent, false);
                break;
            case TYPE_4:
                view = inflater.inflate(R.layout.detalis05, parent, false);
                break;
        }

        return new MyViewHolder(view,viewType);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        int type = getItemViewType(position);
        if(null != data){
            switch (type){
                case TYPE_0:
                    Glide.with(context)
                            .load(data.get(position).getImage())
                            .centerCrop()
                            .placeholder(R.mipmap.ic_launcher)
                            .error(R.mipmap.food)
                            .skipMemoryCache(true)
                            .into(holder.detalis01_iv);
                    break;

                case TYPE_1:
                    holder.detalis02_content.setText(Html.fromHtml(data.get(position).getContent()));
                    holder.detalis02_nike.setText(data.get(position).getNick());
                    holder.detalis02_time.setText(data.get(position).getCreate_time());
                    Glide.with(context)
                            .load(data.get(position).getHead_img())
                            .centerCrop()
                            .transform(new GlideCircleTransform(context))
                            .placeholder(R.mipmap.ic_launcher)
                            .error(R.mipmap.food)
                            .skipMemoryCache(true)
                            .into(holder.detalis02_head);
                    break;

                case TYPE_2:
                    holder.detalis03_tv.setText(data.get(position).getLike().size()+"位厨友觉得很赞");
                    List<Detalis.DataBean.LikeBean> list3 = data.get(position).getLike();
                    holder.detalis03_rv.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));

                    Details03Adapter det03adapter = new Details03Adapter(context,list3);
                    holder.detalis03_rv.setAdapter(det03adapter);
                    det03adapter.setOnItemClicklistener(new OnDetails02ItemClickListener() {
                        @Override
                        public void OnDetails02ItemClickListener(Detalis.DataBean.LikeBean data, int position) {
                            String user_id = data.getUser_id();
                            Intent intent = new Intent(context, ExpertDetalisActivity.class);
                            intent.putExtra("user_id",user_id);
                            context.startActivity(intent);
                        }
                    });

                    break;

                case TYPE_3:
                    holder.detalis04_tv.setText("更多"+data.get(position).getTopics().get(0).getTopic_name()+"的作品");
                    List<Detalis.DataBean.RelatesBean> list4 = data.get(position).getRelates();
                    holder.detalis04_rv.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));

                    Details04Adapter det04adapter = new Details04Adapter(context,list4);
                    holder.detalis04_rv.setAdapter(det04adapter);
                    det04adapter.setOnItemClicklistener(new OnDetails03ItemClickListener() {
                        @Override
                        public void OnDetails03ItemClickListener(Detalis.DataBean.RelatesBean data, int position) {
                            String post_id = data.getId();
                            Intent intent = new Intent(context, ArtworkDetailsActivity.class);
                            intent.putExtra("post_id",post_id);
                            context.startActivity(intent);
                        }
                    });

                    break;

                case TYPE_4:
                    holder.detalis05_tv.setText(data.get(position).getComment().size()+"条点评");
                    List<Detalis.DataBean.CommentBean> list5 = data.get(position).getComment();
                    holder.detalis05_rv.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false));

                    Details05Adapter det05adapter = new Details05Adapter(list5,context);
                    holder.detalis05_rv.setAdapter(det05adapter);
                    det05adapter.setOnItemClicklistener(new OnDetails04ItemClickListener() {
                        @Override
                        public void OnDetails04ItemClickListener(Detalis.DataBean.CommentBean data, int position) {
                            String user_id = data.getUser_id();
                            Intent intent = new Intent(context, ExpertDetalisActivity.class);
                            intent.putExtra("user_id",user_id);
                            context.startActivity(intent);
                        }
                    });

                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        int viewType;
        //作品详情顶上的图
        private ImageView detalis01_iv;

        //作品详情的第二条
        private ImageView detalis02_head;
        private TextView detalis02_content, detalis02_nike, detalis02_time;

        //作品详情的点赞
        private TextView detalis03_tv;
        private RecyclerView detalis03_rv;

        //作品更多栏
        private TextView detalis04_tv;
        private RecyclerView detalis04_rv;

        //评论
        private RecyclerView detalis05_rv;
        private TextView detalis05_tv;

        public MyViewHolder(View itemView, int viewType) {
            super(itemView);
            this.viewType = viewType;
            switch (viewType) {
                case TYPE_0:
                    detalis01_iv = (ImageView) itemView.findViewById(R.id.detalis01_iv);
                    break;
                case TYPE_1:
                    detalis02_head = (ImageView) itemView.findViewById(R.id.detalis02_head);
                    detalis02_content = (TextView) itemView.findViewById(R.id.detalis02_content);
                    detalis02_nike = (TextView) itemView.findViewById(R.id.detalis02_nike);
                    detalis02_time = (TextView) itemView.findViewById(R.id.detalis02_time);
                    break;
                case TYPE_2:
                    detalis03_rv = (RecyclerView) itemView.findViewById(R.id.detalis03_rv);
                    detalis03_tv = (TextView) itemView.findViewById(R.id.detalis03_tv);
                    break;
                case TYPE_3:
                    detalis04_tv = (TextView) itemView.findViewById(R.id.detalis04_tv);
                    detalis04_rv = (RecyclerView) itemView.findViewById(R.id.detalis04_rv);
                    break;
                case TYPE_4:
                    detalis05_rv = (RecyclerView) itemView.findViewById(R.id.detalis05_rv);
                    detalis05_tv = (TextView) itemView.findViewById(R.id.detalis05_tv);
                    break;
            }

        }
    }
}
