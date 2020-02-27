package com.mailshine.abstractfactory.factory;

import com.mailshine.abstractfactory.bean.Animal;

/**
 * The type Animal factory.
 */
public class AnimalFactory {

    /**
     * Create animal animal.
     *
     * @param abstractFactory the abstract factory
     * @return the animal
     */
    public static Animal createAnimal(AnimalAbstractFactory abstractFactory){
        return abstractFactory.createAnimal();
    }
}
