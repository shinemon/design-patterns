package com.mailshine.abstractfactory.factory;

import com.mailshine.abstractfactory.bean.Animal;
import com.mailshine.abstractfactory.bean.Cat;

public class CatFactory implements AnimalAbstractFactory{
    private String sound;

    @Override
    public Animal createAnimal() {
        return new Cat(this.sound);
    }

    public CatFactory(String sound){
        this.sound = sound;
    }
}
