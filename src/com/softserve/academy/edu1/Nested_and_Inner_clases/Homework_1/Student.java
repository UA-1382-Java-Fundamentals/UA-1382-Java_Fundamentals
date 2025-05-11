package com.softserve.academy.edu1.Nested_and_Inner_clases.Homework_1;

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
    public String activity() {
        return "I study at university.";
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    protected Student clone() {
        FullName clonedFullName = getFullName().clone();
        return new Student(clonedFullName, getAge(), course);
    }

}


