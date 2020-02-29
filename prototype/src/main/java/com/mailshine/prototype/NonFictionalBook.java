package com.mailshine.prototype;

public class NonFictionalBook extends Book {

    private String bookType;

    public NonFictionalBook(String name, String author) {
        super(name, author);
        this.bookType = "NonFictional Book";
    }

    public String getBookType() {
        return bookType;
    }


    @Override
    public Book copy() {
        NonFictionalBook nonFictionalBookClone = new NonFictionalBook(this.getName(), this.getAuthor());
        nonFictionalBookClone.setLocation(this.getLocation());
        return nonFictionalBookClone;
    }
}
