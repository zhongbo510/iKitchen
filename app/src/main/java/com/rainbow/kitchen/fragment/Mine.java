package com.rainbow.kitchen.fragment;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.rainbow.kitchen.R;
import com.rainbow.kitchen.activity.LoginActivity;
import com.rainbow.kitchen.utils.GlideCircleTransform;
import com.rainbow.kitchen.view.MineScrollView;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;

import static android.content.Context.MODE_PRIVATE;

/**
 * 个人
 * A simple {@link Fragment} subclass.
 */
public class Mine extends Fragment implements MineScrollView.OnScrollChangedListener,View.OnClickListener{

    private MineScrollView scrollView;
    private Toolbar toolbar;

    private float headerHeight;
    private float minHeaderHeight;
    ImageView imgView;
    Button button;
    Context context;





    public Mine() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mine, container, false);
        scrollView= (MineScrollView) view.findViewById(R.id.scrollView);
        scrollView.setOnScrollChangedListener(this);
        toolbar= (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(Color.TRANSPARENT);
        imgView = (ImageView) view.findViewById(R.id.img);
        button = (Button) view.findViewById(R.id.exit);
        button.setOnClickListener(this);
        imgView.setOnClickListener(this);
        initMeasure();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        final SharedPreferences sp =getActivity().getSharedPreferences("setting",MODE_PRIVATE);
        //1.获取sharedPreference
        String icon = sp.getString("icon","默认值");
        Log.i("info","==getIcon2=="+icon);
        Glide.with(getActivity())
                .load(icon)
                .transform(new GlideCircleTransform(getActivity()))
                .into(imgView);
        if (sp.getBoolean("isLogin",false)){
            //登录了已经
            imgView.setEnabled(false);
        }else {
            imgView.setEnabled(true);
        }

    }

    @Override
    public void setMenuVisibility(boolean menuVisibile) {
        super.setMenuVisibility(menuVisibile);
        if (this.getView() != null) {
            this.getView().setVisibility(menuVisibile ? View.VISIBLE : View.GONE);
        }
    }

    private void initMeasure() {
        headerHeight = getResources().getDimension(R.dimen.dimen_300);
        minHeaderHeight = getResources().getDimension(R.dimen.abc_action_bar_default_height_material);

    }

    @Override
    public void onScrollChanged(ScrollView who, int l, int t, int oldl, int oldt) {
        //Y轴偏移量
        float scrollY = who.getScrollY();

        //变化率
        float headerBarOffsetY = headerHeight - minHeaderHeight;//Toolbar与header高度的差值
        float offset = 1 - Math.max((headerBarOffsetY - scrollY) / headerBarOffsetY, 0f);

        //Toolbar背景色透明度
        toolbar.setBackgroundColor(Color.argb((int) (offset * 123), 123, 222, 255));

//        header背景图Y轴偏移
//        imgHead.setTranslationY(scrollY / 2);

    }


    @Override
    public void onClick(View v) {
       final SharedPreferences sp =getActivity().getSharedPreferences("setting",MODE_PRIVATE);
        switch (v.getId()){
            case R.id.img:   //头像
                if (sp.getBoolean("isLogin",false)){
                    //登录了已经

                }else {
                    Intent intent = new Intent(context,LoginActivity.class);
                    startActivity(intent);
                }
                break;
            case R.id.exit:  //退出登录
                if (sp.getBoolean("isLogin",false)){
                    //已经登录
                    new AlertDialog.Builder(getActivity())
                            .setTitle("亲，确认退出登录吗？")
                            .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    String platformName = sp.getString("platformName","");
                                    ShareSDK.initSDK(getActivity());
                                    Platform p = ShareSDK.getPlatform(platformName);
                                    p.removeAccount();
                                    sp.edit().clear().commit();

                                    imgView.setImageResource(R.drawable.foods_selector);

                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            })
                            .create().show();

                }else {
                    //未登陆
                    Toast.makeText(getActivity(), "未登陆，请登录", Toast.LENGTH_SHORT).show();
                }
                break;

            default:
                break;
        }


    }

}
