package com.softserve.academy.hw6_t2;

public class Developer extends Employee {
    private String position;

    public void setPosition(String position) {
        this.position = position;
    }

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return super.report() + String.format(" Position: %s.", position);
    }
}
