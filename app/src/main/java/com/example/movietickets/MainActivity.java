package com.example.movietickets;

import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // TabLayout
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TabLayout
        tabLayout = findViewById(R.id.tablayout_id);
        appBarLayout = findViewById(R.id.appbarId);
        viewPager = findViewById(R.id.viewpager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentMonday(), "Monday");
        adapter.AddFragment(new FragmentTuesday(), "Tuesday");
        adapter.AddFragment(new FragmentWednesday(), "Wednesday");
        adapter.AddFragment(new FragmentThursday(), "Thursday");
        adapter.AddFragment(new FragmentFriday(), "Friday");
        adapter.AddFragment(new FragmentSaturday(), "Saturday");
        adapter.AddFragment(new FragmentSunday(), "Sunday");

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }


}
