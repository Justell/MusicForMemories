package com.example.android.musicformemories;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);


        //Create ArrayList for songs
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song ("Make my day", "Waldeck"));
        songs.add(new Song ("Seaside", "The Kooks"));
        songs.add(new Song ("The high road", "Broken Bells"));
        songs.add(new Song ("Use somebody", "Kings of Leon"));
        songs.add(new Song ("Mushaboom", "Feist"));
        songs.add(new Song ("Mrs Cold", "Kings of Convenience"));
        songs.add(new Song ("Love lost", "The Temper trap"));
        songs.add(new Song ("Why", "Gus Gus"));
        songs.add(new Song ("Easy to love", "The Jezabels"));


        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }



}
