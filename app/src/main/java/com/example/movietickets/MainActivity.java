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

    // RecyclerView
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MovieAdapter mAdapter;

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

        //End TabLayout


        //RecyclerView

//        Toolbar toolbar = findViewById(R.id.tablayout_id);
//        setSupportActionBar(toolbar);
//
//
//        recyclerView = findViewById(R.id.recycler_view);
//        mAdapter = new MovieAdapter(movieList);
//        recyclerView.setHasFixedSize(true);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//       recyclerView.setAdapter(mAdapter);

        // Populate Data in Api Movie

        PopulateMovie();


        //End Recycler

    }

    private void PopulateMovie(){
        Movie movie = new Movie("Mad Max", "Action & Adventure", "2015","3.5","That's Story is about a man");
        movieList.add(movie);
    }


}
