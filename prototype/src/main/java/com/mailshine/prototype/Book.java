package com.mailshine.prototype;

/**
 * The type Book.
 */
public abstract class Book {
    private String name;
    private String author;
    private Location location;

    /**
     * Instantiates a new Book.
     *
     * @param name   the name
     * @param author the author
     */
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets author.
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets author.
     *
     * @param author the author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString(){
        return "Book [ Name: " + name + " Author: " + author + " Location: " + location + " ]";
    }

    /**
     * Copy book.
     *
     * @return the book
     */
    public abstract Book copy();
}
