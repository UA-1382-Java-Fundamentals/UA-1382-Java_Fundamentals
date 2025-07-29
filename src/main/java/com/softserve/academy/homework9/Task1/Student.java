package com.softserve.academy.homework9.Task1;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    String activity() {
        return "I study at university";
    }

    @Override
    public void info() {
        super.info();
        System.out.println("б Course: " + course);
    }

    @Override
    protected Student clone()  {
        try {
            var clone = (Student)super.clone();
            clone.fullName = (FullName) fullName.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw null;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course = " + course +
                ", " + fullName +
                '}';
    }
}
