package com.mailshine.prototype;

public class FictionalBook extends Book {

    private String bookType;

    public FictionalBook(String name, String author) {
        super(name, author);
        this.bookType = "Fictional Book";
    }

    public String getBookType() {
        return bookType;
    }


    @Override
    public Book copy() {
        FictionalBook fictionalBookClone = new FictionalBook(this.getName(), this.getAuthor());
        fictionalBookClone.setLocation(this.getLocation());
        return fictionalBookClone;
    }
}
