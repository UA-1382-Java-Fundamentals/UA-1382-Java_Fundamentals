package com.softserve.academy.edu1.Hw7.Hw1;

public abstract class Employee implements Payment {
    protected String employeeld;
    protected String name;

    public Employee(String employeeld, String name) {
        this.employeeld = employeeld;
        this.name = name;
    }

    public Employee() {}

    public String getName() {
        return name;
    }

    public String getEmployeeld() {
        return employeeld;
    }
}

