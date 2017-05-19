package com.rainbow.kitchen.adapter.recipeitemadapters.recommenditemadapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.recipe_recommenditem.RecipeType1Item;
import com.rainbow.kitchen.bean.recipe_recommenditem.XinShou2;
import com.rainbow.kitchen.utils.BitmapUtils;

import java.util.List;

/**
 * Created by followlove on 2017/1/10:18:42.
 */

public class XinShouAdapter extends RecyclerView.Adapter<XinShouAdapter.MyViewHolder>{
    Context context;
    private List<XinShou2.DataBeanX.DataBean> dataBeenList;

    private List<RecipeType1Item.DataBean.LogosBean> logosBeanList;
    LayoutInflater inflater;

    public static final int TYPE_HEAD=0;
    public static final int TYPE_BODY=1;
    private Recyclerview11adapter recyclerview11adapter;


    public XinShouAdapter(Context context, List<XinShou2.DataBeanX.DataBean> dataBeenList) {
        this.context = context;
        this.dataBeenList = dataBeenList;
        inflater=LayoutInflater.from(context);
    }

    public void setLogosBeanList(List<RecipeType1Item.DataBean.LogosBean> logosBeanList) {
        this.logosBeanList = logosBeanList;
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0){
            return TYPE_HEAD;
        }else {
            return TYPE_BODY;
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=null;
        switch (viewType){
            case TYPE_HEAD:
                view=inflater.inflate(R.layout.xinshouitem1,null);
                break;
            case TYPE_BODY:
                view=inflater.inflate(R.layout.xinshou,null);
                break;
        }
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        int type = getItemViewType(position);
        switch (type){
            case TYPE_HEAD:
                holder.recyclerView11.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
                if (logosBeanList!=null) {
                    recyclerview11adapter=new Recyclerview11adapter(logosBeanList,context);
                    holder.recyclerView11.setAdapter(recyclerview11adapter);
                    recyclerview11adapter.notifyDataSetChanged();
                }
                break;
            case TYPE_BODY:
                BitmapUtils.showImageToUser(context,dataBeenList.get(position-1).getImage(),holder.imageView9);
                holder.textView9.setText(dataBeenList.get(position-1).getTitle());
                break;
        }
    }

    @Override
    public int getItemCount() {
        return dataBeenList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView9;
        TextView textView9;
        RecyclerView recyclerView11;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView9= (ImageView) itemView.findViewById(R.id.imageView9);
            textView9= (TextView) itemView.findViewById(R.id.textView9);

            recyclerView11= (RecyclerView) itemView.findViewById(R.id.recyclerView11);
        }
    }
}
