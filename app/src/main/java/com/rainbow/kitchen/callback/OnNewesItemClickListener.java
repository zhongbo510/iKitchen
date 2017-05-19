package com.rainbow.kitchen.callback;

import android.view.View;

import com.rainbow.kitchen.bean.CommunityNewest;

/**
 * Created by Administrator on 2017.1.9.
 */

public interface OnNewesItemClickListener {
    void OnNewsItemClickListener(CommunityNewest.DataBeanX.DataBean data,int position);
}
