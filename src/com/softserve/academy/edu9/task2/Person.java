package com.softserve.academy.edu9.task2;

//Outer class
public class Person {
    String name;
    int age;

    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String info() {
        return "Name " + name + ", Age " + age;
    }

    public String activity() {
        return "Generic activity";
    }

    //Inner class which extends Person
    class Student extends Person implements Cloneable {
        int course;

        public Student(String name, int age, int course) {
            super(name, age);
            this.course = course;
        }

        //Overriding all methods
        @Override
        public String info() {
            return super.info() + ", Course " + course;
        }

        @Override
        public String activity() {
            return "I study at university";
        }

        @Override
        public Student clone() {
            return new Student(this.name, this.age, this.course);
        }
    }

    public static void main(String[] args) {

        //Outer object needed in order to create inner class instance
        Person outer = new Person("Example", 0);

        Student s1 = outer.new Student("Jason", 18, 2);
        Student s2 = outer.new Student("Bob", 21, 3);

        System.out.println(s1.info());
        System.out.println(s1.activity());

        System.out.println(s2.info());
        System.out.println(s2.activity());

        Student s3 = s1.clone();
        s3.course = 4;

        System.out.println(s3.info());
        System.out.println(s3.activity());
    }
}