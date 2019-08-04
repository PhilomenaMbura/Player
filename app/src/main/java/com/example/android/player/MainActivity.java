package com.example.android.player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button albumButton = findViewById(R.id.button_album);
        Button nowplayingButton = findViewById(R.id.button_playing);
        Button artistButton = findViewById(R.id.button_artist);
        Button songsButton = findViewById(R.id.button_song);

        //Navigate to AllSongs activity
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(MainActivity.this, AllSongsActivity.class);
                startActivity(v);
            }
        });

        //Navigate to album activity
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(v);
            }
        });


        //Navigate to artist activity
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(v);
            }
        });

        //Navigate to MyPlayer activity
        nowplayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(MainActivity.this, MyPLayer.class);
                startActivity(v);
            }
        });
    }
}
