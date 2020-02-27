package com.mailshine.abstractfactory.bean;

import com.mailshine.abstractfactory.bean.Animal;

/**
 * The type Cat.
 */
public class Cat implements Animal {

    private String sound;

    /**
     * Instantiates a new Cat.
     *
     * @param sound the sound
     */
    public Cat(String sound){
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
