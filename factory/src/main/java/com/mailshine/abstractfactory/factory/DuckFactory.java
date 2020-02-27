package com.mailshine.abstractfactory.factory;

import com.mailshine.abstractfactory.bean.Animal;
import com.mailshine.abstractfactory.bean.Duck;

public class DuckFactory implements AnimalAbstractFactory{

    private String sound;

    @Override
    public Animal createAnimal() {
        return new Duck(this.sound);
    }

    public DuckFactory(String sound){
        this.sound = sound;
    }

}
