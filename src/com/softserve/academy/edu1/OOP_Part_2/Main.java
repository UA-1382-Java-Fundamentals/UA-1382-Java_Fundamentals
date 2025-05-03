package com.softserve.academy.edu1.OOP_Part_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("EMP001", "Alice", 5000.0, "SSN001"));
        employees.add(new ContractEmployee("EMP002", "Bob", 160, 25.0, "TAX001"));
        employees.add(new SalariedEmployee("EMP003", "Carol", 4500.0, "SSN002"));
        employees.add(new ContractEmployee("EMP004", "Dave", 170, 30.0, "TAX002"));
        employees.add(new SalariedEmployee("EMP005", "Eve", 3000.0, "SSN003"));
        employees.add(new SalariedEmployee("EMP006", "Frank", 2500.0, "SSN004"));

        employees.sort((a, b) -> Double.compare(b.calculatePay(), a.calculatePay()));

        System.out.println("Працівники за спаданням місячної зарплати:");
        for (Employee e : employees) {
            System.out.println("ID: " + e.getEmployeeId() +
                    ", Name: " + e.getName() +
                    ", Monthly Pay: $" + e.calculatePay());
        }

    }
}