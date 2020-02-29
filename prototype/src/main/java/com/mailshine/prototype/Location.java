package com.mailshine.prototype;

public final class Location {

    private String library;
    private String aisle;
    private String section;

    public Location(String library, String aisle, String section){
        this.library = library;
        this.aisle = aisle;
        this.section =  section;
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
