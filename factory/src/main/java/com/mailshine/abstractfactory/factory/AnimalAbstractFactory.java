package com.mailshine.abstractfactory.factory;

import com.mailshine.abstractfactory.bean.Animal;

/**
 * The interface Animal abstract factory.
 */
public interface AnimalAbstractFactory {
    /**
     * Create animal animal.
     *
     * @return the animal
     */
    public Animal createAnimal();
}
