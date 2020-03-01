package com.mailshine.prototype;

/**
 * The type Non fictional book.
 */
public class NonFictionalBook extends Book {

    private String bookType;

    /**
     * Instantiates a new Non fictional book.
     *
     * @param name   the name
     * @param author the author
     */
    public NonFictionalBook(String name, String author) {
        super(name, author);
        this.bookType = "NonFictional Book";
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
        NonFictionalBook nonFictionalBookClone = new NonFictionalBook(this.getName(), this.getAuthor());
        nonFictionalBookClone.setLocation(this.getLocation());
        return nonFictionalBookClone;
    }
}
