package com.codegym.lessons.module02.lesson18;

/**
 * The type Custom annotated employee.
 */
@Company
public class CustomAnnotatedEmployee {
    private int id;
    private String name;

    /**
     * Instantiates a new Custom annotated employee.
     *
     * @param id   the id
     * @param name the name
     */
    public CustomAnnotatedEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get employee details.
     */
    public void getEmployeeDetails(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
    }
}
