package com.softserve.academy.homework9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student(new FullName("Petro", "Sandiuk"),33,4419);
        Student student1 = new Student(new FullName("Taras", "Sandiuk"), 29,4417);

        student.activity();
        student.info();
        System.out.println(student);

        Student studentClone = student.clone();
        studentClone.setAge(35);
        studentClone.fullName.setLastName("Haufler");
        studentClone.fullName.setFirstName("Peter");
        studentClone.setCourse(4413);
        System.out.println(studentClone);

        student1.activity();
        student1.info();
    }
}
