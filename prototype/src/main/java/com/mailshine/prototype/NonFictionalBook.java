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
        //todo
        return null;
    }
}
