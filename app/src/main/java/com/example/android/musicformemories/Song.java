package com.example.android.musicformemories;


public class Song {

    private String mSongTitle;

    private String mArtistName;


    public Song(String songname, String artist) {
        mSongTitle = songname;
        mArtistName = artist;
    }


    public String getSongTitle() {

        return mSongTitle;
    }


    public String getArtistName() {

        return mArtistName;
    }

}