package com.mailshine.builder.without.boilerplatecode;

import org.junit.Assert;
import org.junit.Test;

public class BuilderPatternJunitTest {


    @Test
    public void builderTest2() {
        Employee employee = new Employee.EmployeeBuilder()
                .id("TestID1")
                .name("Test Name")
                .age(20)
                .department("Dept")
                .locationAddress("Location")
                .build();
        Assert.assertEquals(20, employee.getAge());
        Assert.assertNotNull(employee.getDepartment());
        Assert.assertNotNull(employee.getLocationAddress());
    }
}
