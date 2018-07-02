package com.example.android.musicalstructureapp;


class Genre {

    private int mGenreThumbnail;

    private String mGenreName;

    Genre(int genreThumbnail, String genreName) {
        this.mGenreThumbnail = genreThumbnail;
        this.mGenreName = genreName;
    }

    int getGenreThumbnail() {
        return mGenreThumbnail;
    }

    String getGenreName() {
        return mGenreName;
    }
}
