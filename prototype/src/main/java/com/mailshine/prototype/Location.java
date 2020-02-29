package com.mailshine.prototype;

public final class Location {

    private String aisle;
    private String section;

    public Location(String aisle, String section){
        this.aisle = aisle;
        this.section =  section;
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
