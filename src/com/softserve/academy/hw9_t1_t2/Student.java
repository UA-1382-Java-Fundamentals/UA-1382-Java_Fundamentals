package com.softserve.academy.hw9_t1_t2;

public class Student extends Person implements Cloneable {
    public Student(String firstName, String lastName, int age, String subtype) {
        super(new FullName(firstName, lastName), age, subtype);
    }

    @Override
    public String info() {
        return "First Name: " + fullName.getFirstName() +
                ", Last Name: " + fullName.getLastName() +
                ", Age: " + age
                ;
    }

    @Override
    public String activity(String subtype) {
        return switch (subtype) {
            case "Student" -> "I am a student";
            case "Trainee" -> "I am a trainee";
            default -> "I am another subtype";
        };
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
