package com.example.android.musicalstructureapp;


class Trending {

    private String mTrendingSongName;

    private String mTrendingArtistName;

    private String mRating;

    private String mLastWeekRating;

    private int mImageResourceId;


    Trending(String trendingSongName, String trendingArtistName, int imageResourceId, String rating, String lastWeekRating) {
        this.mTrendingSongName = trendingSongName;
        this.mTrendingArtistName = trendingArtistName;
        this.mImageResourceId = imageResourceId;
        this.mRating = rating;
        this.mLastWeekRating = lastWeekRating;
    }

    String getTrendingSongName() {
        return mTrendingSongName;
    }

    String getTrendingArtistName() {
        return mTrendingArtistName;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    String getRating() {
        return mRating;
    }

    String getLastWeekRating() {
        return mLastWeekRating;
    }
}
