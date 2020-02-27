package com.mailshine.abstractfactory;

import com.mailshine.abstractfactory.bean.Animal;
import com.mailshine.abstractfactory.factory.AnimalFactory;
import com.mailshine.abstractfactory.factory.CatFactory;
import com.mailshine.abstractfactory.factory.DuckFactory;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type App.
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    /**
     * The constant ANIMAL_IS_CREATED_WITH_SOUND.
     */
    public static final String ANIMAL_IS_CREATED_WITH_SOUND = "Animal is created with sound :: ";
    /**
     * The constant THE_CLASS_USED_WAS.
     */
    public static final String THE_CLASS_USED_WAS = ". The Class used was :: ";

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        BasicConfigurator.configure();

        Animal cat = AnimalFactory.createAnimal(new CatFactory("Meow"));
        Animal duck = AnimalFactory.createAnimal(new DuckFactory("Quack"));

        logger.info(ANIMAL_IS_CREATED_WITH_SOUND + cat.getSound() + THE_CLASS_USED_WAS + cat.getClass().getSimpleName());
        logger.info(ANIMAL_IS_CREATED_WITH_SOUND + duck.getSound() + THE_CLASS_USED_WAS + duck.getClass().getSimpleName());

    }
}
