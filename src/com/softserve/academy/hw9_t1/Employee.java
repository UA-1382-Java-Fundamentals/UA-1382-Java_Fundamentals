package com.softserve.academy.hw9_t1;

public class Employee extends Person {
    public Employee(String firstName, String lastName, int age) {
        super(new FullName(firstName, lastName), age);
    }

    @Override
    public String info() {
        return "First Name: " + fullName.firstName +
                ", Last Name: " + fullName.lastName +
                ", Age: " + age;
    }

    @Override
    public String activity() {
        return "Employee works";
    }
}
