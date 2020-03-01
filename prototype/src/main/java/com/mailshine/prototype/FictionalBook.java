package com.mailshine.prototype;

/**
 * The type Fictional book.
 */
public class FictionalBook extends Book {

    private String bookType;

    /**
     * Instantiates a new Fictional book.
     *
     * @param name   the name
     * @param author the author
     */
    public FictionalBook(String name, String author) {
        super(name, author);
        this.bookType = "Fictional Book";
    }

    /**
     * Gets book type.
     *
     * @return the book type
     */
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
