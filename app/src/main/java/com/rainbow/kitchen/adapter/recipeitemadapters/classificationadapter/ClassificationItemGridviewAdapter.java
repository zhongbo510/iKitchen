package com.rainbow.kitchen.adapter.recipeitemadapters.classificationadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.bean.Classification;
import com.rainbow.kitchen.bean.ClassificationItem;

import java.util.List;

/**
 * Created by tsngtso on 2017/1/8.
 */

public class ClassificationItemGridviewAdapter extends BaseAdapter{
    Context context;
    List<ClassificationItem.DataBeanX.DataBean.TagsInfoBean> data;

    public ClassificationItemGridviewAdapter(Context context, List<ClassificationItem.DataBeanX.DataBean.TagsInfoBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.gridview_item,null);
            holder=new ViewHolder();
            holder.textView= (TextView) convertView.findViewById(R.id.tv_griditem);
            convertView.setTag(holder);
        }
        holder= (ViewHolder) convertView.getTag();
        holder.textView.setText(data.get(position).getText());
        return convertView;
    }

    static class ViewHolder {

        TextView textView;
    }
}
