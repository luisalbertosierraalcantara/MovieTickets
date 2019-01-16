package com.example.movietickets;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public  class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private List<Movie> movieList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, year, genre, popularity, overview;

        public MyViewHolder(View view){
            super(view);

            title = view.findViewById(R.id.title);
            genre = view.findViewById(R.id.genre);
            year  = view.findViewById(R.id.year);
            popularity = view.findViewById(R.id.popularity);
            overview = view.findViewById(R.id.overview);
        }
    }

    public MovieAdapter(List<Movie> movieList){

        this.movieList = movieList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_list, viewGroup, false);

        return  new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
        holder.popularity.setText(movie.getPopularity());
        holder.overview.setText(movie.getOverview());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
