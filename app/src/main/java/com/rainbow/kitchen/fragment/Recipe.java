package com.rainbow.kitchen.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.RecipeAdapter;
import com.rainbow.kitchen.fragment.recipefragment.Classificationfragment;
import com.rainbow.kitchen.fragment.recipefragment.Ingredientsfragment;
import com.rainbow.kitchen.fragment.recipefragment.Recommendfragment;
import com.rainbow.kitchen.activity.SearchActivity;
import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;
import com.uuzuche.lib_zxing.activity.ZXingLibrary;

import java.util.ArrayList;
import java.util.List;

/**
 * 食谱打碎片
 * A simple {@link Fragment} subclass.
 * 新添扫一扫与搜索功能
 */
public class Recipe extends Fragment implements ViewPager.OnPageChangeListener,View.OnClickListener{

    List<String> tabitem;
    ViewPager viewPager;
    List<Fragment> fragments;
    TabLayout tabLayout;
    RecipeAdapter recipeAdapter;
    ImageButton ibSwip,ibSearch;
    public static final int REQUEST_CODE = 111;


    public Recipe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_recipe, container, false);
        viewPager= (ViewPager) view.findViewById(R.id.viewpager);
        tabLayout= (TabLayout) view.findViewById(R.id.tablayout);
        initData();
        viewPager.setAdapter(recipeAdapter);
        viewPager.addOnPageChangeListener(this);
        // Inflate the layout for this fragment
        ibSwip = (ImageButton) view.findViewById(R.id.ibSwip);
        ibSwip.setOnClickListener(this);
        ibSearch = (ImageButton) view.findViewById(R.id.ibSearch);
        ibSearch.setOnClickListener(this);

        ZXingLibrary.initDisplayOpinion(getContext());//初始化操作

        return view;
    }



    private void initData() {

        tabitem=new ArrayList<>();
        tabitem.add("推荐");
        tabitem.add("食材");
        tabitem.add("分类");

        fragments=new ArrayList<>();
        fragments.add(new Recommendfragment());
        fragments.add(new Ingredientsfragment());
        fragments.add(new Classificationfragment());

        for (int i = 0; i < tabitem.size(); i++) {
            Fragment fragment = fragments.get(i);
            Bundle bundle=new Bundle();
            bundle.putString("type",tabitem.get(i));
            fragment.setArguments(bundle);
            fragments.add(fragment);
        }
        recipeAdapter=new RecipeAdapter(getFragmentManager(),tabitem,fragments);

        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void setMenuVisibility(boolean menuVisibile) {
        super.setMenuVisibility(menuVisibile);
        if (this.getView() != null) {
            this.getView().setVisibility(menuVisibile ? View.VISIBLE : View.GONE);
        }
    }

//    食谱下面的viewpager滑动监听重写方法
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View v) {
        //二维码扫描
        ibSwip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CaptureActivity.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });
        //搜索
        ibSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "haha", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), SearchActivity.class);
                startActivity(intent);
            }
        });



    }

    //处理结果
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE){
            if (null !=data){
                Bundle bundle = data.getExtras();
                if (bundle == null){
                    return;
                }
                if (bundle.getInt(CodeUtils.RESULT_TYPE)==CodeUtils.RESULT_SUCCESS){
                    String result  = bundle.getString(CodeUtils.RESULT_STRING);
                    Toast.makeText(getContext(), "解析结果:"+result, Toast.LENGTH_SHORT).show();
                }else if (bundle.getInt(CodeUtils.RESULT_TYPE)==CodeUtils.RESULT_FAILED){
                    Toast.makeText(getContext(), "解析失败", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
