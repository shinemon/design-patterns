package com.mailshine.builder.without.boilerplatecode;

import lombok.Builder;
import lombok.Getter;

/**
 * The type Employee.
 */
@Getter
@Builder
public class Employee {

    //mandatory
    private String id;
    private String name;

    //optional
    private int age;
    private String department;
    @Builder.Default private String locationAddress = "Office One, 1 Main St.";


}
