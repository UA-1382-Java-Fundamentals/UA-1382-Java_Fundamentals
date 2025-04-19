package com.softserve.academy.edu1.HW3.PT2;

public class main {
    public static void main(String[] args) {
        double totalSalary = 0.0;
        Employee employee1 = new Employee("Oleh",5);
        Employee employee2 = new Employee("Ivanna",8);
        Employee employee3 = new Employee("Pavlo",10);

        Employee[] employees = {employee1, employee2, employee3};

        for (Employee emp: employees) {
            totalSalary += emp.getTotalSum();
        }
        System.out.println("\nTotal salary of all employee is: "+ totalSalary);
    }
}
