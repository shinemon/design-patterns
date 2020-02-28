package com.mailshine.prototype;

public class Employee implements Cloneable {

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //todo
        return new Employee();
    }
}
