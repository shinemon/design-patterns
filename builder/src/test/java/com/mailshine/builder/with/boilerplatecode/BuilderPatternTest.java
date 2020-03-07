package com.mailshine.builder.with.boilerplatecode;

import org.junit.Assert;
import org.junit.Test;

public class BuilderPatternTest {

    @Test
    public void builderTest() {
        Employee employee = new Employee.EmployeeBuilder("TestID1", "Test Name")
                .build();
        Assert.assertEquals("TestID1", employee.getId());
        Assert.assertNull(employee.getDepartment());
        Assert.assertEquals(0, employee.getAge());
    }

    @Test
    public void builderTest2() {
        Employee employee = new Employee.EmployeeBuilder("TestID1", "Test Name")
                .setAge(30)
                .setLocationAddress("address1")
                .setDepartment("dept1")
                .build();
        Assert.assertEquals(30, employee.getAge());
        Assert.assertNotNull(employee.getDepartment());
        Assert.assertNotNull(employee.getLocationAddress());
    }
}
