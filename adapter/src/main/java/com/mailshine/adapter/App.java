package com.mailshine.adapter;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        MediaPlayer mediaPlayer = new MP3();
        mediaPlayer.play("file.mp3");

        mediaPlayer = new MediaPlayerAdapter(new MP4());
        mediaPlayer.play("file.mp4");


        mediaPlayer = new MediaPlayerAdapter(new VLC());
        mediaPlayer.play("file.vlc");

    }
}
