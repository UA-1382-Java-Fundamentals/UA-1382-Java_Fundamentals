package com.softserve.academy.edu6;

public class Developer2 extends Employee2 {
private String position;
//Constructor for fields
public Developer2(String name, int age, double salary, String position) {
    super(name, age, salary);
    this.position = position;
}
//Report method with data
@Override
    public String report() {
    return String.format("Name: %s, Age: %d years, Position: %s, Salary: \u20B4%.2f.", getName(), getAge(), position,  getSalary());
}
}
