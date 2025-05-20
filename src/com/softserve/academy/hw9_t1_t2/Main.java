/*
Create a FullName class with the firstName and lastName fields of type String, which would correspond
to the principle of encapsulation.

• Create an abstract Person class with fullName field of type FullName and age of type int.

• In the Person class, create:
    o a constructor public Person(FullName fullName, int age) ;
    o info() method, which will return a string in the format "First name: <firstName>, Last name: <lastName>, Age: <age>"
    o an abstract public activity() method with a String return type.

 2. Create a Student class with an int field that matches the course the student is taking.

    • In the Student class:
        o create a constructor with parameters to initialize all fields in the class;
        o override the info() method (which would also add course information to the previous line);
        o override the activity() method from the Person class. The activity() method should return a string
        value that is the type of activity for the corresponding Person subtype, for example for a student -
        this could be the value "I study at university".

•    In the main() method, create two instances of the Student class and output information about them by
calling the appropriate methods info() and activity().

    • Create one more instance of Student class by cloning the first student, change a course for this object
and output full information about created students.

 */

package com.softserve.academy.hw9_t1_t2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student("Adam", "Li", 35, "Student");
        Student student2 = new Student("Alan", "Gor", 30, "Trainee");
        Student student3 = (Student) student2.clone();

        Student[] students = {student1, student2, student3};

        for (Student s : students) {
            System.out.println(s.info() + ". " + s.activity(s.getSubtype()));
        }
    }
}
