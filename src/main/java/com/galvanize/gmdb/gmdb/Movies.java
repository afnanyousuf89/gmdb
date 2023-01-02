package com.galvanize.gmdb.gmdb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String movieTitle;
    private int movieYear;
    private String movieGenre;
    private String movieRuntime;

    protected Movies(){}


    public Movies(String movieTitle, int movieYear, String movieGenre, String movieRuntime){

        this.movieTitle = movieTitle;
        this.movieYear = movieYear;
        this.movieGenre = movieGenre;
        this.movieRuntime = movieRuntime;


    }

    @Override
    public String toString(){
        return String.format(
            "Movies[id=%d, movieTitle='%s', movieYear=%d, movieGenre='%s', movieRuntime='%s']", 
            id, movieTitle, movieYear,movieGenre,movieRuntime);
    }

    public Long getId(){
        return id;
    }

    public String getMovieTitle(){
        return movieTitle;
    }

    public int getMovieYear(){
        return movieYear;
    }
    public String getMovieGenre(){
        return movieGenre;
    }

    public String getMovieRuntime(){
        return movieRuntime;
    }
}
