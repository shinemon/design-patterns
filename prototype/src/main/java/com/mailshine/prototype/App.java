package com.mailshine.prototype;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){
        BasicConfigurator.configure();

        Location location = new Location("City Library", "A1", "Section 3");
        Location anotherLocation = new Location("University Library ", "D3", "Section 33");

        FictionalBook fictionalBook = new FictionalBook("Harry Potter", "J K Rowling");
        fictionalBook.setLocation(location);

        FictionalBook anotherFictionalBook = (FictionalBook) fictionalBook.copy();
        anotherFictionalBook.setLocation(anotherLocation);

        Location location1 = new Location("City Library", "F1", "Section 4");
        Location anotherLocation1 = new Location("Main St Library ", "Q3", "Section 1");

        NonFictionalBook nonFictionalBook = new NonFictionalBook("A Brief History Of time", "Stephen Hawking");
        nonFictionalBook.setLocation(location1);

        NonFictionalBook anotherNonFictionalBook = (NonFictionalBook) nonFictionalBook.copy();
        anotherNonFictionalBook.setLocation(anotherLocation1);


    }
}
