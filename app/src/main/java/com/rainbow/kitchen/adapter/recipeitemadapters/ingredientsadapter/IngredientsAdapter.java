package com.rainbow.kitchen.adapter.recipeitemadapters.ingredientsadapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.IngredientsDetailActivity;
import com.rainbow.kitchen.callback.OnIngredientsItemClicklistener;
import com.rainbow.kitchen.bean.Ingredients;

import java.util.List;

/**
 * Created by zb on 2017/1/4:17:50.
 * 食材基础适配器
 *
 */

public class IngredientsAdapter extends RecyclerView.Adapter<IngredientsAdapter.MyViewholder>{
    Context context;
    List<Ingredients.DataBeanXX.DataBeanX> dataBeanXList;
    LayoutInflater inflater;
    /*public IngredientsAdapter(Context context, List<Ingredients.DataBeanXX.DataBeanX> dataBeanXList) {
        this.context = context;
        this.dataBeanXList = dataBeanXList;
        inflater = LayoutInflater.from(context);
    }*/
    public IngredientsAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }
    public void setData(List<Ingredients.DataBeanXX.DataBeanX> data) {
        this.dataBeanXList = data;
        notifyDataSetChanged();
    }

    //负责生成界面
    @Override
    public MyViewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=inflater.inflate(R.layout.ingredientdsitem1,parent,false);
        return new MyViewholder(view);
    }

//    负责绑定控件数据
    @Override
    public void onBindViewHolder(MyViewholder holder, int position) {
        String  title1 = dataBeanXList.get(position).getText();
        holder.textView1.setText(title1);
        String  img1 = dataBeanXList.get(position).getImage();
        Glide.with(context)
                .load(img1)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.food)
                .skipMemoryCache(true)
                .into(holder.imageView1);
        List<Ingredients.DataBeanXX.DataBeanX.DataBean> data =
                dataBeanXList.get(position).getData();
        final Ingredients02ViewAdapter adapter = new Ingredients02ViewAdapter(context);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 5);

        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                int spansize=1;
                return spansize;
            }
        });
        holder.recyclerView1.setLayoutManager(gridLayoutManager);

        holder.recyclerView1.setAdapter(adapter);

        //点击事件监听
        adapter.setOnItemClicklistener(new OnIngredientsItemClicklistener(){
            @Override
            public void onItemClickListener(Ingredients.DataBeanXX.DataBeanX.DataBean componentBean, int pos) {
                Log.e("======", "+=======" + componentBean.getText());
                Intent intent = new Intent(context, IngredientsDetailActivity.class);
                intent.putExtra("id", componentBean.getId());
                intent.putExtra("img", componentBean.getImage());
                intent.putExtra("title", componentBean.getText());
                context.startActivity(intent);
            }

        });
        adapter.setData(data);
    }

    @Override
    public int getItemCount() {
        return dataBeanXList.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder{
//        负责控件和找到控件
//        TYPE_INGRE1常见食材菠菜的控件
        RecyclerView recyclerView1;
        TextView textView1;
        ImageView imageView1;
        public MyViewholder(View itemView) {
            super(itemView);
                  recyclerView1 = (RecyclerView) itemView.findViewById(R.id.recyclerViewsc1);
                    textView1= (TextView) itemView.findViewById(R.id.titlesc1);
                    imageView1= (ImageView) itemView.findViewById(R.id.imagesc1);
        }
    }
}
