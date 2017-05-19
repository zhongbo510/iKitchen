package com.rainbow.kitchen.adapter.recipeitemadapters;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.rainbow.kitchen.activity.reciperecommenditemclick.Banner2;

import java.util.List;

/**
 * Created by zyc on 2016/12/29:22:04.
 * 广告头的适配器
 */
public class BannerAdapter extends PagerAdapter{

    Context context;
    List<View> viewList;

    public BannerAdapter(List<View> viewList,Context context) {
        this.viewList = viewList;
        this.context=context;
    }

    public BannerAdapter(List<View> viewList) {
        this.viewList = viewList;
    }

    @Override
    public int getCount() {
        return viewList.size();
    }

    //检查ViewPager是否正常工作
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

//    实例化子view
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = viewList.get(position);
        container.addView(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Banner2.class);
                context.startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // super.destroyItem(container, position, object);
        container.removeView(viewList.get(position));
    }
}
