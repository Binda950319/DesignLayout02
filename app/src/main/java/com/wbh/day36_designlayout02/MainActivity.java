package com.wbh.day36_designlayout02;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;

import com.wbh.day36_designlayout02.adapter.MyViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Toolbar toolBar;
    private TabLayout tabLayout;
    private String[] titles = {"首页", "新闻", "视频", "关注", "我的"};
    private ViewPager viewPager;
    private List<Fragment> list = new ArrayList<Fragment>();
    private MyViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingTollbar);
        toolBar = (Toolbar) findViewById(R.id.toolBar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        initToolBar();
//        initTitle();
        initViewPager();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initToolBar() {
        setSupportActionBar(toolBar);
        collapsingToolbarLayout.setTitleEnabled(true);
        collapsingToolbarLayout.setTitle("测试程序");
        collapsingToolbarLayout.setExpandedTitleGravity(Gravity.LEFT);
        collapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);
        collapsingToolbarLayout.setCollapsedTitleGravity(Gravity.CENTER);
    }


    private void initTitle() {
        for (int i = 0; i < titles.length; i++) {
//            tabLayout.addTab(tabLayout.newTab().setText(titles[i]));
        }
    }

    private void initViewPager() {
        for (int i = 0; i < titles.length; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(titles[i]));
            MyFragment fragment = new MyFragment();
            list.add(fragment);
        }
        adapter = new MyViewPagerAdapter(getSupportFragmentManager(), list, titles);
        viewPager.setAdapter(adapter);
    }

}
