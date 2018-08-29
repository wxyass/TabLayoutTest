package com.tablayout.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tablayout.base.BaseMainFragment;

import java.util.List;

/**
 * Created by wxyass on 2018/8/20.
 */
public class MainPagerAdapter extends FragmentPagerAdapter {

    private List<String> tabIndicators;
    private List<BaseMainFragment> tabFragments;

    public MainPagerAdapter(FragmentManager fm, List<BaseMainFragment> tabFragments, List<String> tabIndicators) {
        super(fm);
        this.tabIndicators = tabIndicators;
        this.tabFragments = tabFragments;
    }

    @Override
    public Fragment getItem(int position) {
        return tabFragments.get(position);
    }

    @Override
    public int getCount() {
        return tabIndicators.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabIndicators.get(position);
    }
}
