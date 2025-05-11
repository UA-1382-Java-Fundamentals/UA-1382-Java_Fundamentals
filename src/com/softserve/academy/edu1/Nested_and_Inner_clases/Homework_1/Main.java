package com.softserve.academy.edu1.Nested_and_Inner_clases.Homework_1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(new FullName("Jon", "Smit"), 20, 2);
        Student clonedStudent = new Student(student.getFullName(), student.getAge(), student.getCourse()); //Deep copy
        Student shallowClonedStudent = student.clone(); //Shallow copy
        shallowClonedStudent.getFullName().setFirstName("Alex");
        shallowClonedStudent.getFullName().setLastName("Smith");
        shallowClonedStudent.setCourse(3);

        System.out.println(student.info());
        System.out.println(student.activity());

        System.out.println(clonedStudent.info());
        System.out.println(clonedStudent.activity());

        System.out.println(shallowClonedStudent.info());
        System.out.println(shallowClonedStudent.activity());
    }
}