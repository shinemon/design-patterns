package com.mailshine.abstractfactory.factory;

import com.mailshine.abstractfactory.bean.Animal;
import com.mailshine.abstractfactory.bean.Duck;

/**
 * The type Duck factory.
 */
public class DuckFactory implements AnimalAbstractFactory{

    private String sound;

    @Override
    public Animal createAnimal() {
        return new Duck(this.sound);
    }

    /**
     * Instantiates a new Duck factory.
     *
     * @param sound the sound
     */
    public DuckFactory(String sound){
        this.sound = sound;
    }

}
