package com.example.android.musicalstructureapp;


class Album {
    private int mThumbnail;
    private String mAlbumName;

    Album(String albumName, int thumbnail) {
        this.mThumbnail = thumbnail;
        this.mAlbumName = albumName;
    }

    int getThumbnail() {
        return mThumbnail;
    }

    String getAlbumName() {
        return mAlbumName;
    }
}
