package com.softserve.academy.edu1.Hw6.Hw2;


public class Developer extends Employee {
    private String name;
    private int age;
    private double salary;
    private String position = "Average Java developer";

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public String report() {
        return String.format("Name : %s, Age : %d" + " ,Position: " + getPosition() + ", Salary: \u20B4 %.2f", super.getName(), super.getAge(), super.getSalary());
    }

    public String getPosition() {
        return position;
    }
}
