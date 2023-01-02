package com.galvanize.gmdb.gmdb;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

public class Reviews {
    private Long ReviewID;
    private Long MovieID;
    private Long ReviewerID;
    private String ReviewText;
    public Long getReviewID() {
        return ReviewID;
    }
    public Long getMovieID() {
        return MovieID;
    }
    public Long getReviewerID() {
        return ReviewerID;
    }
    public String getReviewText() {
        return ReviewText;
    }
    public String getDateTimeModified() {
        return DateTimeModified;
    }
    public Movies getMovies() {
        return movies;
    }
    private String DateTimeModified;
    @ManyToOne(fetch = FetchType.LAZY)
    private Movies movies;

    
}
