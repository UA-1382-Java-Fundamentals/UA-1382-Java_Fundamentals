package com.softserve.academy.hw7_t1;

public abstract class Employee implements Payment {
    String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    public void printEmployees (int salary, String idType, String id) {
        System.out.println("Employee ID: " + employeeld + "; Salary: " + salary + "; " + idType + id);
    }
}
