package com.mailshine.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MP3 implements MediaPlayer {
    private static final Logger logger = LoggerFactory.getLogger(MP3.class);

    @Override
    public void play(String filename) {

        logger.info("Playing MP3 file" + filename);

    }
}
