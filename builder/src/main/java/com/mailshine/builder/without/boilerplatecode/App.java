package com.mailshine.builder.without.boilerplatecode;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * The type App.
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        BasicConfigurator.configure();

        Employee employee = new Employee.EmployeeBuilder("TestID1", "Test Name")
                .build();
        logger.info("Created Employee with ID: "+ employee.getId());

        Employee employeeWithOptionalParameters = new Employee.EmployeeBuilder("TestID2", "Test Name2")
                .setAge(25)
                .setDepartment("Software Engineering")
                .setLocationAddress("Location Address 1")
                .build();
        logger.info("Created Employee with ID: "+ employeeWithOptionalParameters.getId());
        logger.info(employeeWithOptionalParameters.getId() + "  " + "belongs to Department " + employeeWithOptionalParameters.getDepartment());

    }
}
