package com.softserve.academy.edu6;

public class Employee2 {
    //Private fields for encapsulation
    private String name;
    private int age;
    private double salary;

    //Constructor for fields
    public Employee2(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
//Protected getters to access in subclasses
    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected double getSalary() {
        return salary;
    }
//Method to return formatted string
    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4%.2f.", name, age, salary);
    }
}