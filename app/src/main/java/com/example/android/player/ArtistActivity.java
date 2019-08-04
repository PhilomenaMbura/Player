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


public class ArtistActivity extends AppCompatActivity {

    ArrayList songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.artist));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_artist);

        songList = new ArrayList<Song>();
        songList.add(new Song("Gorr", "Muscian F", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Gorr1", "Muscian G", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Gorr2", "Muscian H", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Gorr3", "Muscian I", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Gorr4", "Muscian J", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Gorr5", "Muscian K", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Gorr6", "Muscian L", R.drawable.ic_play_circle_filled));

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

        Button albumButton = findViewById(R.id.button_album);
        Button nowplayingbutton = findViewById(R.id.button_playing);
        Button songButton = findViewById(R.id.button_song);

        //Navigate to album activity
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(ArtistActivity.this, AlbumActivity.class);
                startActivity(v);
            }
        });

        //Navigate to allsongs activity
        songButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(ArtistActivity.this, AllSongsActivity.class);
                startActivity(v);
            }
        });

        //Navigate to MyPlayer activity
        nowplayingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(ArtistActivity.this, MyPLayer.class);
                startActivity(v);
            }
        });
    }
}
