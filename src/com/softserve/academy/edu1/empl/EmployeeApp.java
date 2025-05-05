package com.softserve.academy.edu1.empl;

import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) {
        // Create a fixed array of employees
        Employee[] employees = {
                new Employee("John", 15),
                new Employee("Alice", 3),
                new Employee("Bob", 8)
        };


        // Sort by name
        Arrays.sort(employees, new NameComparator());
        System.out.println("Sorted by name:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        // Sort by tab number
        Arrays.sort(employees, new TabComparator());
        System.out.println("\nSorted by tab number:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
