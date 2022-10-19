package com.example.test1comp1011section2200495149;

import java.util.Arrays;
import java.util.List;

public class NetfilxShow {
    private int showId;
    private String type, title, rating, director, cast;

    public NetfilxShow(int showId, String type, String title, String rating, String director, String cast) {
        setShowId(showId);
        setType(type);
        setTitle(title);
        setRating(rating);
        setDirector(director);
        setCast(cast);
        }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        if(showId > 0){
            this.showId = showId;
        }else{
            throw new IllegalArgumentException("showId must be greater then 0");
        }

    }

    public String getType() {
        return type;
    }
    public static List<String> validTypes() {
        return Arrays.asList("Movie", "TV Show");
    }
    public void setType(String type) {
        List<String> validTypes = validTypes();
        if (validTypes.contains(type)) {
            this.type = type;
        }else {
            throw new IllegalArgumentException("Valid types are: " + validTypes);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.length() >= 2) {
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Title must be at least 2 characters long");
        }
    }

    public String getRating() {
        return rating;
    }

    public static List<String> validRatings() {
        return Arrays.asList("PG-13", "R", "TV-14", "TV-G", "TV-MA", "TV-Y", "TV-Y7");
    }
    public void setRating(String rating) {
        List<String> validRatings = validRatings();
        if (validRatings.contains(rating)) {
            this.rating = rating;
        }else {
            throw new IllegalArgumentException("Valid ratings are: " + validRatings);
        }
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if(director.length() >= 5){
            this.director = director;
        }else {
            throw new IllegalArgumentException("Director must be at least 5 characters long");
        }
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }
}
