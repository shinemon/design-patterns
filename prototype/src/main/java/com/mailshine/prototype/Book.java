package com.mailshine.prototype;

public abstract class Book {
    private String name;
    private String author;
    private Location location;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString(){
        return "Book [ Name: " + name + " Author: " + author + " Location: " + location + " ]";
    }

    public abstract Book copy();
}
