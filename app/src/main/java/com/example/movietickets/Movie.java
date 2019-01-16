package com.example.movietickets;


public class Movie  {
    private String title, genre, year, popularity, overview;

    public Movie(){

    }

    public Movie(String title, String genre, String year, String popularity, String overview) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.popularity = popularity;
        this.overview = overview;
    }

    public  String getTitle(){
        return title;
    }

    public String getYear(){
        return year;
    }

    public  String setYear(String year){
       return this.year = year;
    }

    public String getGenre(){
        return genre;
    }

    private  String setGenre(String genre){
       return this.genre = genre;
    }

    public String getPopularity(){
        return  popularity;
    }

    public  String setPopularity(String popularity){
       return this.popularity = popularity;
    }

    public String getOverview(){
        return overview;
    }

    public String setOverview(String overview){
        return this.overview = overview;
    }

}
