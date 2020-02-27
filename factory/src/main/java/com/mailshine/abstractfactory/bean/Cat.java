package com.mailshine.abstractfactory.bean;

import com.mailshine.abstractfactory.bean.Animal;

public class Cat implements Animal {

    private String sound;

    public Cat(String sound){
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
