package com.example.android.musicformemories;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        //Create ArrayList for songs
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song ("Medicine", "Daughter"));
        songs.add(new Song ("You only live once", "The Strokes"));
        songs.add(new Song ("Slow and steady", "Of Monsters And Men"));
        songs.add(new Song ("Vejas per tavo kelius", "Domantas Razauskas"));
        songs.add(new Song ("Sunny road", "Emiliana Torrini"));
        songs.add(new Song ("Hiding tonight", "Alex Turner"));
        songs.add(new Song ("Cmon talk", "Bernhoft"));


        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
