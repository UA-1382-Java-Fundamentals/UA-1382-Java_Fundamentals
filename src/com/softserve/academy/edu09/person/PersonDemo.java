package com.softserve.academy.edu09.person;


public class PersonDemo {

    public static void main(String[] args) {
        Person person = new Person("Alice", "Green", 18);
        String fullName = person.getFullName();
        int age = person.getAge();
        System.out.println("Full Name: " + fullName + ", Age: " + age);

        // This line would cause a compile error because FullName is a private inner class
        // and cannot be accessed directly from outside the Person class
        // Person.FullName fullNameObj = person.new FullName("Alice", "Green");
    }
}
