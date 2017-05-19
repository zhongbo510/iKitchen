package com.rainbow.kitchen.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by tsngtso on 2016/12/29.
 */

public class MineScrollView extends ScrollView{
    private OnScrollChangedListener onScrollChangedListener;

    public MineScrollView(Context context) {
        super(context);
    }

    public MineScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MineScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if(onScrollChangedListener!=null) {
            onScrollChangedListener.onScrollChanged(this, l, t, oldl, oldt);
        }
    }


    public void setOnScrollChangedListener(OnScrollChangedListener listener) {
        onScrollChangedListener = listener;
    }

    public interface OnScrollChangedListener{
        void onScrollChanged(ScrollView who, int l, int t, int oldl, int oldt);
    }
}
