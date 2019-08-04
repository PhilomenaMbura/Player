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


public class AllSongsActivity extends AppCompatActivity {

    ArrayList songList;

    int [] songs = {R.raw.ericcarlsontunnelbirds,R.raw.goon,R.raw.jonroselytrapped};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getResources().getString(R.string.main));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_all_songs);

        songList = new ArrayList<Song>();
        songList.add(new Song("Lahb", "Muscian 1", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Lahb1", "Muscian 2", R.drawable.ic_play_circle_filled));
        songList.add(new Song("Lahb2", "Muscian 3", R.drawable.ic_play_circle_filled));


        ListView listView = findViewById(R.id.listsong);

        MyListAdapter adapter = new MyListAdapter(this, songList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

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
        Button artistButton = findViewById(R.id.button_artist);

        //Navigate to album activity
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(AllSongsActivity.this, AlbumActivity.class);
                startActivity(v);
            }
        });

        //Navigate to artist activity
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(AllSongsActivity.this, ArtistActivity.class);
                startActivity(v);
            }
        });

        //Navigate to MyPlayer activity
        nowplayingbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent v = new Intent(AllSongsActivity.this, MyPLayer.class);
                startActivity(v);
            }
        });
    }
}
