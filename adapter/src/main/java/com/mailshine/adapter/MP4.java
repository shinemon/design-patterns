package com.mailshine.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MP4 implements NewMediaPlayer {

    private static final Logger logger = LoggerFactory.getLogger(MP4.class);

    @Override
    public void playFile(String filename) {

        logger.info("Playing MP4 file" + filename);

    }
}
