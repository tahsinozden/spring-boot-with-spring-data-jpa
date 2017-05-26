package com.web.app.entities.wrappers;

public class StarWrapper {
    private String starName;
    private String movieName;

    public StarWrapper() {
    }

    public StarWrapper(String starName, String movieName) {
        this.starName = starName;
        this.movieName = movieName;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
