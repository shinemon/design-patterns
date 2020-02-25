package com.mailshine.singleton;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        BasicConfigurator.configure();

        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setValue("Updated Message");

        logger.info("singleton1.getValue() is "+ singleton1.getValue());
        logger.info("singleton2.getValue() is "+ singleton2.getValue());

    }
}
