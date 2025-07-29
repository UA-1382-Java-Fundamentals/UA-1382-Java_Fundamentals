package com.softserve.academy.homework7.practicalTask1;

public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    public void feed() {
        System.out.println("Cat has been fed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
