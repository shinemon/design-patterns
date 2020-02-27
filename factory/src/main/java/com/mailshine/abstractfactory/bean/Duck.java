package com.mailshine.abstractfactory.bean;

import com.mailshine.abstractfactory.bean.Animal;

/**
 * The type Duck.
 */
public class Duck implements Animal {
    private String sound;

    /**
     * Instantiates a new Duck.
     *
     * @param sound the sound
     */
    public Duck(String sound){
        this.sound = sound;
    }

    @Override
    public String getSound() {
        return this.sound;
    }

    /**
     * Sets sound.
     *
     * @param sound the sound
     */
    public void setSound(String sound) {
        this.sound = sound;
    }
}
