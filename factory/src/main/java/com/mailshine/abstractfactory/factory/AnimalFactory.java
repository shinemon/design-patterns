package com.mailshine.abstractfactory.factory;

import com.mailshine.abstractfactory.bean.Animal;

public class AnimalFactory {

    public static Animal createAnimal(AnimalAbstractFactory abstractFactory){
        return abstractFactory.createAnimal();
    }
}
