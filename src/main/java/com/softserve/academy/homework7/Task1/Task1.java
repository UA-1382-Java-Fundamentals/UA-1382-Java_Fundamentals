package com.softserve.academy.homework7.Task1;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("E001", "Alice", "SSN12345" ,4000.0 );
        employees[1] = new ContractEmployee("E002", "Bob","FTID56789" ,25.0, 160);
        employees[2] = new SalariedEmployee("E003", "Charlie", "SSN67890",3500.0 );
        employees[3] = new ContractEmployee("E004", "Diana", "FTID11223",30.0, 150);

        sort(employees);
        print(employees);
    }

    public static void sort(Employee[] employees){
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.calculatePay(), o1.calculatePay());
            }
        });
    }

    public static void print(Employee[]employees){
        System.out.println("Employee ID | Name     | Monthly Pay");
        System.out.println("--------------------------------------");
        for (Employee e : employees) {
            System.out.printf("%-11s | %-8s | $%.2f%n",
                    e.getEmployeeId(), e.getName(), e.calculatePay());
        }
    }
}
