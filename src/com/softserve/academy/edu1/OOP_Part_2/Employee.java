package com.softserve.academy.edu1.OOP_Part_2;

public abstract class Employee implements Payment {
    protected String employeeId;
    protected String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}