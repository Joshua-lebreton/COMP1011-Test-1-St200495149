package com.example.test1comp1011section2200495149;

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

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }
}
