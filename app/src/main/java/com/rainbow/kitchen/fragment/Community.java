package com.rainbow.kitchen.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.adapter.CommunityAdapter;
import com.rainbow.kitchen.fragment.coomunityfragments.FocusFragment;
import com.rainbow.kitchen.fragment.coomunityfragments.NewestFragment;
import com.rainbow.kitchen.fragment.coomunityfragments.TuijianFragment;


import java.util.ArrayList;
import java.util.List;


//社区页面

public class Community extends Fragment implements ViewPager.OnPageChangeListener {

    ViewPager vp_community;
    TabLayout tab_community;
    CommunityAdapter communityAdapter;
    List<Fragment> fragments=new ArrayList<Fragment>();
    List<String> titles=new ArrayList<String>();
    public Community() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_community, container, false);

        vp_community = (ViewPager) view.findViewById(R.id.vp_community);
        tab_community = (TabLayout) view.findViewById(R.id.tab_community);
        initView();
        communityAdapter = new CommunityAdapter(getFragmentManager(),titles,fragments);


        vp_community.setAdapter(communityAdapter);
        //设置tablayout与viewpager联动
        tab_community.setupWithViewPager(vp_community);
        vp_community.addOnPageChangeListener(this);
        return view;


    }

    //分别对应tab创建fragment
    private void initView() {
        //对应的tab的页面的请求参数
        titles.add("关注");
        titles.add("推荐");
        titles.add("最新");
        fragments.add(new FocusFragment());
        fragments.add(new TuijianFragment());
        fragments.add(new NewestFragment());
        for (int i = 0; i < titles.size(); i++) {
            Fragment fragment = fragments.get(i);
            Bundle bundle = new Bundle();
            bundle.putString("type", titles.get(i));
            fragment.setArguments(bundle);
            fragments.add(fragment);
        }

    }

    @Override
    public void setMenuVisibility(boolean menuVisibile) {
        super.setMenuVisibility(menuVisibile);
        if (this.getView() != null) {
            this.getView().setVisibility(menuVisibile ? View.VISIBLE : View.GONE);
        }
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


}
