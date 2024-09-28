package com.codegym.lessons.module02.lesson18;

import java.lang.annotation.Annotation;

/**
 * The type Test custom annotated employee.
 */
public class TestCustomAnnotatedEmployee {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        CustomAnnotatedEmployee employee = new CustomAnnotatedEmployee(1, "John Doe");
        employee.getEmployeeDetails();

        Annotation companyAnnotation = employee.getClass().getAnnotation(Company.class);
        Company company = (Company)companyAnnotation;

        System.out.println("Company Name: " + company.name());
        System.out.println("Company City: " + company.city());
    }
}
