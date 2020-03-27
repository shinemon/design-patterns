package com.mailshine.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MediaPlayerAdapter implements MediaPlayer {
    private static final Logger logger = LoggerFactory.getLogger(MediaPlayerAdapter.class);

    private NewMediaPlayer newMediaPlayer;

    public MediaPlayerAdapter(NewMediaPlayer newMediaPlayer) {
        this.newMediaPlayer = newMediaPlayer;
    }

    @Override
    public void play(String filename) {
        logger.info("USING ADAPTER" );
        newMediaPlayer.playFile(filename);
    }
}
