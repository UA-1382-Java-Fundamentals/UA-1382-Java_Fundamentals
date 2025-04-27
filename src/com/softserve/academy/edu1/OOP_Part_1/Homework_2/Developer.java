package com.softserve.academy.edu1.OOP_Part_1.Homework_2;

public class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f, Position: %s ", getName(), getAge(), getSalary(), getPosition());
    }
}
