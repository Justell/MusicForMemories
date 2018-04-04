package com.example.android.musicformemories;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        //Create ArrayList for songs
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song ("Vienna", "Billy Joel"));
        songs.add(new Song ("Pompeii", "Bastille"));
        songs.add(new Song ("Get lucky", "Karen Souza"));
        songs.add(new Song ("Walking on sunshine", "Jazzysticks"));
        songs.add(new Song ("Sunrise", "Norah Jones"));
        songs.add(new Song ("Talk is cheap", "Chet Faker"));
        songs.add(new Song ("You give me something", "Jamiroquai"));

        SongAdapter itemsAdapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
