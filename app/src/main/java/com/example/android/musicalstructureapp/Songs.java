package com.example.android.musicalstructureapp;


class Songs {

    private String mSongName;

    private String mArtistName;

    private int mImageResourceId;

    private String mSongDuration;

    Songs(String songName, String artistName, int imageResourceId, String songDuration) {
        this.mSongName = songName;
        this.mArtistName = artistName;
        this.mImageResourceId = imageResourceId;
        this.mSongDuration = songDuration;
    }

    String getSongName() {
        return mSongName;
    }

    String getArtistName() {
        return mArtistName;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    String getSongDuration() {
        return mSongDuration;
    }
}
