package com.rainbow.kitchen.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by followlove on 2016/12/26:13:11.
 */

public class RecipeAdapter extends FragmentPagerAdapter {

    List<String> tabitem;
    List<Fragment> fragments;

    public RecipeAdapter(FragmentManager fm, List<String> tabitem, List<Fragment> fragments) {
        super(fm);
        this.tabitem = tabitem;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return tabitem.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabitem.get(position);
    }
}
