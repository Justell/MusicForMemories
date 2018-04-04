package com.example.android.musicformemories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView playButton = (ImageView) findViewById(R.id.play);

        playButton.setOnClickListener(new View.OnClickListener(){

            public void onClick (View view){
                Intent playlists = new Intent(MainActivity.this, CreatePlaylists.class);
                startActivity(playlists);
            }

        });
    }



}
