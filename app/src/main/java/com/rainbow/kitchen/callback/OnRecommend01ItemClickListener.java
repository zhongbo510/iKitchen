package com.rainbow.kitchen.callback;

import com.rainbow.kitchen.bean.Ingredients;
import com.rainbow.kitchen.bean.Recommend;

/**
 * Created by followlove on 2017/1/9:14:42.
 */
public interface OnRecommend01ItemClickListener {
    void onItemClickListener(Recommend.DataBean.WidgetListBean.WidgetDataBean componentBean, int pos);
}
