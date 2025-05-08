package com.softserve.academy.homework7.practicalTask2;

public class Task2 {
    public static void main(String[] args) {
        Person[] people = {
                new Teacher("Anna"),
                new Cleaner("Bob"),
                new Student("Diana"),
                new Teacher("Ivan"),
                new Student("Olga")
        };

        for (Person person : people){
            person.print();
            if(person instanceof Staff){
                double salary = ((Staff) person).salary();
                System.out.println("Salary = " + salary);
            }
        }
    }
}
