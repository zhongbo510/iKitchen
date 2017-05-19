package com.rainbow.kitchen.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/12/26.
 */

public class CommunityAdapter extends FragmentStatePagerAdapter{
    private List<String> titles;
    private List<Fragment> fragments;

    public CommunityAdapter(FragmentManager fm, List<String> titles, List<Fragment> fragments) {
        super(fm);
        this.titles = titles;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    @Override
    public int getCount() {

        return titles.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {

        return titles.get(position);
    }

}
