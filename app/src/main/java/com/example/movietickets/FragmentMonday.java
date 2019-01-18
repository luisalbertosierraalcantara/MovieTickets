package com.example.movietickets;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentMonday  extends Fragment {
    View view;
    private RecyclerView recyclerView;
    // RecyclerView
    private List<Movie> movieList = new ArrayList<>();
    private MovieAdapter mAdapter;
    private Context context;
    public FragmentMonday() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.monday_fragment, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        context = view.getContext().getApplicationContext();

        PopulateMovie();

        mAdapter = new MovieAdapter(movieList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(context, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        return view;
    }

    private void PopulateMovie(){
        Movie movie = new Movie("Mad Max \n", "Action & Adventure \n", "2015 \n","3.5\n" ,"That's Story is about a man");
        movieList.add(movie);
    }

}
