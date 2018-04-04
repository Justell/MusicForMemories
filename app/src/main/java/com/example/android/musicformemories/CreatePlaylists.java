package com.example.android.musicformemories;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CreatePlaylists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_playlists);

        TextView playlistOne = (TextView) findViewById(R.id.twofourteen);

        playlistOne.setOnClickListener(new View.OnClickListener(){

            public void onClick (View view){
                Intent playlistOne = new Intent(CreatePlaylists.this, PlaylistOne.class);
                startActivity(playlistOne);
            }
        });

        TextView playlistTwo = (TextView) findViewById(R.id.croatia);

        playlistTwo.setOnClickListener(new View.OnClickListener(){

            public void onClick (View view){
                Intent playlistTwo = new Intent(CreatePlaylists.this, PlaylistTwo.class);
                startActivity(playlistTwo);
            }
        });

        TextView playlistThree = (TextView) findViewById(R.id.wedding);

        playlistThree.setOnClickListener(new View.OnClickListener(){

            public void onClick (View view){
                Intent playlistThree = new Intent(CreatePlaylists.this, PlaylistThree.class);
                startActivity(playlistThree);
            }
        });

    }
}
