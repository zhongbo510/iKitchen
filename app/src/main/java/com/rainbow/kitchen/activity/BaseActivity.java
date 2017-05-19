package com.rainbow.kitchen.activity;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.rainbow.kitchen.R;

/**
 * 推荐页广告详情基础页
 */
public abstract class BaseActivity extends AppCompatActivity {
    ImageView img_left;
    TextView tv_title;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected  void init(){
        img_left = (ImageView) findViewById(R.id.img_left);
        tv_title = (TextView) findViewById(R.id.title);
    }


    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        View view = getLayoutInflater().inflate(R.layout.activity_base, null);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.content);
        // 将传入的layout加载到activity_base的relativeLayout里面
        getLayoutInflater().inflate(layoutResID, relativeLayout, true);
        super.setContentView(view);
        init();
    }

    public  void setTv_title(String title){
        tv_title.setText(title);
    };

    public  void setLeftVisible(boolean isVisible){
        img_left.setVisibility((isVisible==true)? View.VISIBLE: View.GONE);
    };

    public void back(View view){
        finish();
    }

}
