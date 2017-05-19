package com.rainbow.kitchen.adapter.recipeitemadapters.classificationadapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.ClassificationDetailActivity;
import com.rainbow.kitchen.bean.Classification;
import com.rainbow.kitchen.view.MyGridView;

import java.util.ArrayList;
import java.util.List;

/**食谱分类适配器
 * Created by tsngtso on 2017/1/4.
 */

public class ClassificationAdapter extends RecyclerView.Adapter<ClassificationAdapter.MyViewHolder>{
    private Context context;
    private ArrayList<Classification.DataBeanXX.DataBeanX> dataBeanList;

    public ClassificationAdapter(Context context, ArrayList<Classification.DataBeanXX.DataBeanX> dataBeanList) {
        this.context = context;
        this.dataBeanList = dataBeanList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.classification_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
      Classification.DataBeanXX.DataBeanX dataBeanX=dataBeanList.get(position);
        if(dataBeanX!=null){
            holder.textView.setText(dataBeanX.getText());
            Glide.with(context)
                    .load(dataBeanX.getImage())
                    .skipMemoryCache(true)
                    .into(holder.imageView);
            final List<Classification.DataBeanXX.DataBeanX.DataBean> dataBeen=dataBeanX.getData();
            MyGridViewAdapter myGridViewAdapter=new MyGridViewAdapter(context,dataBeen);
            holder.gridView.setAdapter(myGridViewAdapter);
            holder.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent intent=new Intent(context,ClassificationDetailActivity.class);
                    String text=dataBeen.get(position).getText();
                    intent.putExtra("text",text);
                    intent.putExtra("id",dataBeen.get(position).getId());
                    context.startActivity(intent);
                }
            });
            myGridViewAdapter.notifyDataSetChanged();

        }
    }

    @Override
    public int getItemCount() {
        return dataBeanList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        ImageView imageView;
        MyGridView gridView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.tv_classtitle);
            imageView= (ImageView) itemView.findViewById(R.id.iv_class);
            gridView= (MyGridView) itemView.findViewById(R.id.classgridview);
        }
    }
}
