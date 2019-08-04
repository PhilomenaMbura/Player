package com.example.android.player;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class AlbumActivity extends AppCompatActivity {


    ArrayList songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.album));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_album);

        songList = new ArrayList<Song>();
        songList.add(new Song("Blah", "Muscian A", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Blah1", "Muscian B", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Blah2", "Muscian C", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Blah3", "Muscian D", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Blah4", "Muscian E", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Blah5", "Muscian F", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Blah6", "Muscian G", R.drawable.ic_play_circle_filled));


        ListView listView = findViewById(R.id.listsong);

        com.example.android.player.MyListAdapter adapter = new com.example.android.player.MyListAdapter(this, songList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    MediaPlayer c = MediaPlayer.create(getApplicationContext(), R.raw.jonroselytrapped);
                    c.start();
                } else if (position == 1) {
                    MediaPlayer c = MediaPlayer.create(getApplicationContext(), R.raw.johnwesleycolemantequila);
                    c.start();
                } else if (position == 2) {
                    MediaPlayer c = MediaPlayer.create(getApplicationContext(), R.raw.ericcarlsontunnelbirds);
                    c.start();
                } else if (position == 3) {
                    MediaPlayer c = MediaPlayer.create(getApplicationContext(), R.raw.marcoraaphorstmafkees);
                    c.start();
                } else if (position == 4) {
                    MediaPlayer c = MediaPlayer.create(getApplicationContext(), R.raw.goon);
                    c.start();
                } else {
                    MediaPlayer c = MediaPlayer.create(getApplicationContext(), R.raw.thebooksbuzz);
                    c.start();
                }
            }
        });

        //buttons click listeners

        Button songButton = findViewById(R.id.button_song);
        Button nowplayingbutton = findViewById(R.id.button_playing);
        Button artistButton = findViewById(R.id.button_artist);

        //Navigate to all songs activity
        songButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(AlbumActivity.this, AllSongsActivity.class);
                startActivity(v);
            }
        });

        //Navigate to artist activity
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(AlbumActivity.this, ArtistActivity.class);
                startActivity(v);
            }
        });

        //Navigate to MyPlayer activity
        nowplayingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(AlbumActivity.this, MyPLayer.class);
                startActivity(v);
            }
        });

    }
}
