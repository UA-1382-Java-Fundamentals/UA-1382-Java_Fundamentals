package com.softserve.academy.edu1.emp;

import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", 5),
                new Employee("Alice", 3),
                new Employee("Bob", 7)
        };

        Arrays.sort(employees, Employee.getNameComparator());

        System.out.println("Sorted by name:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees, Employee.getTabComparator());

        System.out.println("\nSorted by tab number:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
