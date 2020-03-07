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

        Employee employee = new Employee.EmployeeBuilder()
                .id("TestID1")
                .name("Test Name")
                .age(20)
                .department("Dept")
                .locationAddress("Location")
                .build();
        logger.info("Created Employee with ID: "+ employee.getId());
        logger.info(employee.getId() + "'s age is " +  employee.getAge());


    }
}
