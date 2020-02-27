package com.mailshine.abstractfactory;

import com.mailshine.abstractfactory.bean.Animal;
import com.mailshine.abstractfactory.factory.AnimalFactory;
import com.mailshine.abstractfactory.factory.CatFactory;
import com.mailshine.abstractfactory.factory.DuckFactory;
import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void abstractFactoryTest(){

        Animal cat = AnimalFactory.createAnimal(new CatFactory("Meow"));
        Animal duck = AnimalFactory.createAnimal(new DuckFactory("Quack"));

        Assert.assertEquals( "Meow", cat.getSound());
        Assert.assertEquals( "Quack", duck.getSound());

    }
}
