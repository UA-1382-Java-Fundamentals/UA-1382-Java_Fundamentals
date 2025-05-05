package com.softserve.academy.edu09;


public class PersonDemo {

    public static void main(String[] args) {
        // Create a new Person object with age 30
        Person person = new Person(30);

        // Create a FullName object using the existing Person object
        // This demonstrates how to create an inner class instance from an outer class instance
        Person.FullName fullPersonInfo = person.new FullName("Alice", "Green");

        fullPersonInfo.printInfo();

        // Create a new Person and FullName in a single line
        // This demonstrates a more concise way to create and use inner class instances
        Person.FullName fullPersonInfo2 = new Person(18).new FullName("Bob", "Brown");

        fullPersonInfo2.printInfo();
    }
}
