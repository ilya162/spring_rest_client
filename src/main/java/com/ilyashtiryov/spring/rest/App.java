package com.ilyashtiryov.spring.rest;

import com.ilyashtiryov.spring.rest.entity.Employee;
import configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);
        System.out.println("************************");
        Employee empById = communication.getEmployee(1);
        System.out.println(empById);
        System.out.println("************************");
        Employee emp = new Employee("Sveta", "Sokolova", "HR", 900);
        communication.saveEmployee(emp);
        System.out.println("************************");
communication.deleteEmployee(9);
    }
}
