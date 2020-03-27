package com.mailshine.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VLC implements NewMediaPlayer {
    private static final Logger logger = LoggerFactory.getLogger(VLC.class);

    @Override
    public void playFile(String filename) {
        logger.info("Playing VLC file" + filename);

    }
}
