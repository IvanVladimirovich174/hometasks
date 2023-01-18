package com.ninthhometask.ninthhometask.model;

public enum Genre {
    DETECTIVE("Detective"),
    FANTASTIC("Fantastic"),
    THRILLER("Thriller"),
    COMEDY("Comedy");

    private final String genreText;

    Genre(String genreText) {
        this.genreText = genreText;
    }

    public String getGenreText() {
        return this.genreText;
    }
}