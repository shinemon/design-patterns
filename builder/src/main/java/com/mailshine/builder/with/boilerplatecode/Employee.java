package com.mailshine.builder.with.boilerplatecode;

/**
 * The type Employee.
 */
public class Employee {

    //mandatory
    private String id;
    private String name;

    //optional
    private int age;
    private String department;
    private String locationAddress;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets department.
     *
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Gets location address.
     *
     * @return the location address
     */
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

    /**
     * The type Employee builder.
     */
    public static class EmployeeBuilder {
        private String id;
        private String name;
        private int age;
        private String department;
        private String locationAddress;

        /**
         * Instantiates a new Employee builder.
         *
         * @param id   the id
         * @param name the name
         */
        public EmployeeBuilder(String id, String name) {
            this.id = id;
            this.name = name;
        }

        /**
         * Sets age.
         *
         * @param age the age
         * @return the age
         */
        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        /**
         * Sets department.
         *
         * @param department the department
         * @return the department
         */
        public EmployeeBuilder setDepartment(String department) {
            this.department = department;
            return this;
        }

        /**
         * Sets location address.
         *
         * @param locationAddress the location address
         * @return the location address
         */
        public EmployeeBuilder setLocationAddress(String locationAddress) {
            this.locationAddress = locationAddress;
            return this;
        }

        /**
         * Build employee.
         *
         * @return the employee
         */
        public Employee build() {
            return new Employee(this);
        }
    }
}
