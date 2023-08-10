package com.zq.study.framework5.nine;

// Java Program to Illustrate Company Class

import java.util.*;
import java.util.Map.Entry;

// Class
public class Company {

    // Class member variable
    private Map<Employee, Address> employees;

    public void setEmployees(Map<Employee, Address> employees) {
        this.employees = employees;
    }

    // Method
    public void display()
    {
        // Iterating over Map using for each loop
        for (Map.Entry<Employee, Address> entry :
                employees.entrySet()) {

            // Print statement
            System.out.println(
                    "Employee Data ->"
                            + entry.getKey().toString() + " Address ->"
                            + entry.getValue().toString());
        }
    }
}

