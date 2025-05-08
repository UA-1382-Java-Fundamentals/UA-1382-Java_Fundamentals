package com.softserve.academy.homework7.practicalTask1;

public class Dog implements Animal{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Гав - гав");
    }

    @Override
    public void feed() {
        System.out.println("Dog has been fed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
