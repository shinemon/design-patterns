package com.mailshine.abstractfactory.bean;

import com.mailshine.abstractfactory.bean.Animal;

public class Duck implements Animal {
    private String sound;

    public Duck(String sound){
        this.sound = sound;
    }

    @Override
    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
