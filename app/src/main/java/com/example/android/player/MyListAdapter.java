package com.example.android.player;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.player.R;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<String> {

    private  Activity context;

    private ArrayList<Song> songArrayList;
    private LayoutInflater inf;

    public MyListAdapter(Activity context, ArrayList<Song> songArrayList) {
        super(context, R.layout.design);
        // TODO Auto-generated constructor stub

        this.context = context;
        this.songArrayList = songArrayList;
        inf= LayoutInflater.from(context);

    }


    @Override
    public int getCount() {
        return songArrayList.size();
    }

    public View getView(final int position, View view, ViewGroup parent) {
       // LayoutInflater inflater = context.getLayoutInflater();
            LinearLayout songLayout =(LinearLayout) inf.inflate(R.layout.design, parent,false);
        TextView artistsText = (TextView) songLayout.findViewById(R.id.artists);
        ImageView imageView = (ImageView) songLayout.findViewById(R.id.icon);
        TextView songText = (TextView) songLayout.findViewById(R.id.song3);

        //get songs using position
            Song currentSong = songArrayList.get(position);

        artistsText.setText(currentSong.getSongName());
        imageView.setImageResource(currentSong.getSongImages());
        songText.setText(currentSong.getSongAuthor());
        songLayout.setTag(position);
        return songLayout;

    }


}
