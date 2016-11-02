package com.wbh.day36_designlayout02.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import com.wbh.day36_designlayout02.MyFragment;

import java.util.List;

/**
 * Created by Administrator on 2016/10/16.
 */
public class MyViewPagerAdapter extends FragmentPagerAdapter {
    private String[] titles;
    private List<Fragment> list;

    public MyViewPagerAdapter(FragmentManager fm,List<Fragment> list,   String[] titles) {
        super(fm);
        this.list = list;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
