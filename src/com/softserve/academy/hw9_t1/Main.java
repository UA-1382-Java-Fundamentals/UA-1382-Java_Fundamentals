/*
Create a FullName class with the firstName and lastName fields of type String, which would correspond
to the principle of encapsulation.

• Create an abstract Person class with fullName field of type FullName and age of type int.

• In the Person class, create:
    o a constructor public Person(FullName fullName, int age) ;
    o info() method, which will return a string in the format "First name: <firstName>, Last name: <lastName>, Age: <age>"
    o an abstract public activity() method with a String return type.
 */

package com.softserve.academy.hw9_t1;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = {
                new Employee("Adam", "Li", 35),
                new Employee("Alan", "Gor", 30)
        };

        for (Employee emp : employee) {
            System.out.println(emp.info() + ". " + emp.activity());
        }
    }
}
