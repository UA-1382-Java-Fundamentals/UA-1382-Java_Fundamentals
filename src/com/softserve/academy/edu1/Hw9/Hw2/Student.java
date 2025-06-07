package com.softserve.academy.edu1.Hw9.Hw2;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone() {
        return new Student(
                new FullName(
                        getFullName().getFirstName(),
                        getFullName().getLastName()
                ),
                getAge(),
                this.course
        );
    }
}

