package com.mailshine.builder.with.boilerplatecode;

public class Employee {

    //mandatory
    private String id;
    private String name;

    //optional
    private int age;
    private String department;
    private String locationAddress;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    private Employee(EmployeeBuilder builder){

    }

    public static class EmployeeBuilder {
    }
}
