package com.example.android.player;

public class Song {

    String songTitle;
    String songAuthor;
    int songImages;


    public Song(String songTitle, String songAuthor, int songImages) {
        this.songTitle = songTitle;
        this.songAuthor = songAuthor;
        this.songImages = songImages;
    }

    public int getSongImages() {
        return songImages;
    }

    public void setSongImages(int songImages) {
        this.songImages = songImages;
    }

    public String getSongName() {
        return songTitle;
    }

    public void setSongName(String songName) {
        this.songTitle = songName;
    }

    public String getSongAuthor() {
        return songAuthor;
    }

    public void setSongAuthor(String songAuthor) {
        this.songAuthor = songAuthor;
    }
}
