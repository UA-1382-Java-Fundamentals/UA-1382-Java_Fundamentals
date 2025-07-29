package com.softserve.academy.homework9.Task1;

public abstract class Person {

    protected FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void info(){
        System.out.printf("First name: %s, Last name: %s, Age: %d",fullName.getFirstName(),fullName.getLastName(),age);
    }

    abstract String activity();

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

