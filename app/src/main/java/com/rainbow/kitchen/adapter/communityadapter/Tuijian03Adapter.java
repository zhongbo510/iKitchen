package com.rainbow.kitchen.adapter.communityadapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.ArtworkDetailsActivity;
import com.rainbow.kitchen.bean.Tuijian;
import com.rainbow.kitchen.callback.OnTuijian03ItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017.1.4.
 */

public class Tuijian03Adapter extends RecyclerView.Adapter<Tuijian03Adapter.MyViewHodler>{

    private List<Tuijian.DataBeanX.ShequTopicsBean> data;
    private Context context;
    private LayoutInflater inflater;

    public Tuijian03Adapter( Context context,List<Tuijian.DataBeanX.ShequTopicsBean> data) {
        this.data = data;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.tuijian03_lv_item,null,false);

        return new MyViewHodler(view);
    }

    @Override
    public void onBindViewHolder(MyViewHodler holder, int position) {

        List<Tuijian.DataBeanX.ShequTopicsBean.DataBean> list = new ArrayList<>();
        list.addAll(data.get(position).getData());
        Tuijian03ItemAdapter adapter = new Tuijian03ItemAdapter(context,list);
        holder.tuijian03_item_tv.setText(data.get(position).getTopic_name());
        holder.tuijian03_item_rv.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));

        holder.tuijian03_item_rv.setAdapter(adapter);
        adapter.setOnItemClicklistener(new OnTuijian03ItemClickListener() {

            @Override
            public void OnTuijian03ItemClickListener(Tuijian.DataBeanX.ShequTopicsBean.DataBean dataBean, int position) {
               String post_id = dataBean.getId();
                Intent intent = new Intent(context, ArtworkDetailsActivity.class);
                intent.putExtra("post_id",post_id);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class MyViewHodler extends RecyclerView.ViewHolder{
        private TextView tuijian03_item_tv;
        private RecyclerView tuijian03_item_rv;

        public MyViewHodler(View itemView) {
            super(itemView);
            tuijian03_item_tv = (TextView) itemView.findViewById(R.id.tuijian03_item_tv);
            tuijian03_item_rv = (RecyclerView) itemView.findViewById(R.id.tuijian03_item_rv);
        }
    }
}
