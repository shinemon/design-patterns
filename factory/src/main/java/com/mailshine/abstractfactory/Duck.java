package com.mailshine.abstractfactory;

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
