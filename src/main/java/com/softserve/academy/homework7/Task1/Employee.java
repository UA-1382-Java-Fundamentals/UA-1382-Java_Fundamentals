package com.softserve.academy.homework7.Task1;

public abstract class Employee implements Payment{
    private String name;
    private String employeeId;

    public Employee(String employeeId,String name) {
        this.name = name;
        this.employeeId = employeeId;
    }


    public abstract double calculatePay();

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
