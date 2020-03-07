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

    private Employee(EmployeeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.department = builder.department;
        this.locationAddress = builder.locationAddress;
    }

    public static class EmployeeBuilder {
        private String id;
        private String name;
        private int age;
        private String department;
        private String locationAddress;

        public EmployeeBuilder(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public EmployeeBuilder setLocationAddress(String locationAddress) {
            this.locationAddress = locationAddress;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
