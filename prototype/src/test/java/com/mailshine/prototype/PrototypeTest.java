package com.mailshine.prototype;

import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void prototypeFictionalLibraryTest(){
        Location location = new Location("City Library", "A1", "Section 3");
        Location anotherLocation = new Location("University Library ", "D3", "Section 33");

        FictionalBook fictionalBook = new FictionalBook("Harry Potter", "J K Rowling");
        fictionalBook.setLocation(location);
        FictionalBook anotherFictionalBook = (FictionalBook) fictionalBook.copy();
        anotherFictionalBook.setLocation(anotherLocation);

        Assert.assertEquals(location, fictionalBook.getLocation());
        Assert.assertEquals(anotherLocation, anotherFictionalBook.getLocation());

    }

    @Test
    public void prototypeNonFictionalLibraryTest(){
        Location location = new Location("City Library", "F1", "Section 4");
        Location anotherLocation = new Location("Main St Library ", "Q3", "Section 1");

        NonFictionalBook nonFictionalBook = new NonFictionalBook("A Brief History Of time", "Stephen Hawking");
        nonFictionalBook.setLocation(location);
        NonFictionalBook anotherNonFictionalBook = (NonFictionalBook) nonFictionalBook.copy();
        anotherNonFictionalBook.setLocation(anotherLocation);

        Assert.assertEquals(location, nonFictionalBook.getLocation());
        Assert.assertEquals(anotherLocation, anotherNonFictionalBook.getLocation());

    }
}
