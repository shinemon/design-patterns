package com.mailshine.prototype;

/**
 * The type Location.
 */
public final class Location {

    private String library;
    private String aisle;
    private String section;

    /**
     * Instantiates a new Location.
     *
     * @param library the library
     * @param aisle   the aisle
     * @param section the section
     */
    public Location(String library, String aisle, String section){
        this.library = library;
        this.aisle = aisle;
        this.section =  section;
    }

    /**
     * Gets library.
     *
     * @return the library
     */
    public String getLibrary() {
        return library;
    }

    /**
     * Sets library.
     *
     * @param library the library
     */
    public void setLibrary(String library) {
        this.library = library;
    }

    /**
     * Gets aisle.
     *
     * @return the aisle
     */
    public String getAisle() {
        return aisle;
    }

    /**
     * Sets aisle.
     *
     * @param aisle the aisle
     */
    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    /**
     * Gets section.
     *
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * Sets section.
     *
     * @param section the section
     */
    public void setSection(String section) {
        this.section = section;
    }
}
