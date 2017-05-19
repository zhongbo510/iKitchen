package com.rainbow.kitchen.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * Created by innershows on 2016/11/29.
 *
 * @author innershows
 * @date 2016/11/29
 * @e_mail innershow@gmail.com
 */

public class FullScreenVideoView extends VideoView {

    public FullScreenVideoView(Context context) {
        super(context);
    }

    public FullScreenVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FullScreenVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //重写onMeasure方法，避免按照比例宽高测量

    /**
     * @param widthMeasureSpec  这个值 是 测量模式和测量出来的宽的和。
     *                          MeasureSpec.getSize()实际上，就是一个位运算，可以拿到宽
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);

        setMeasuredDimension(width, height);

    }
}
