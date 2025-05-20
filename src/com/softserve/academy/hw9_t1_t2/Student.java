package com.softserve.academy.hw9_t1_t2;

public class Student extends Person implements Cloneable {
    public Student(String firstName, String lastName, int age, String subtype) {
        super(new FullName(firstName, lastName), age, subtype);
    }

    @Override
    public String info() {
        return "First Name: " + fullName.firstName +
                ", Last Name: " + fullName.lastName +
                ", Age: " + age
                ;
    }

    @Override
    public String activity(String subtype) {
        if (subtype.equals("Student")) {
            return "I am a student";
        } else if (subtype.equals("Trainee")) {
            return "I am a trainee";
        }
        else {
            return "I am another subtype";
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
